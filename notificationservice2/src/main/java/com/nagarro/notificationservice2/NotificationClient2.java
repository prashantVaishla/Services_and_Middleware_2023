package com.nagarro.notificationservice2;

import java.io.IOException;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.DeliverCallback;

public class NotificationClient2 {
	private static final String EXCHANGE_CREATE_ORDER = "CREATE_ORDER";
	private static final String EXCHANGE_UPDATE_ORDER = "UPDATE_ORDER";
	private static final String KEY = "update_key";

	public static void main(String[] args) throws Exception {

		ConnectionFactory factory = new ConnectionFactory();
		factory.setHost("localhost");
		factory.setPort(8081);
		Connection connection = factory.newConnection();
		Channel channel = connection.createChannel();
		System.out.println(" [*] Waiting for Place and Update Order Notification. To exit press CTRL+C");
		
		fanout(channel);
		direct(channel);

	}

	private static void direct(Channel channel) throws IOException {
		channel.exchangeDeclare(EXCHANGE_UPDATE_ORDER, "direct");
		String queue = channel.queueDeclare().getQueue();

		channel.queueBind(queue, EXCHANGE_UPDATE_ORDER, KEY);


		DeliverCallback deliverCallback = (consumerTag, delivery) -> {
			String message = new String(delivery.getBody(), "UTF-8");

			System.out.println(" [x] Received Notification For Update '" + delivery.getEnvelope().getRoutingKey() + "':'" + message + "'");
		};
		channel.basicConsume(queue, true, deliverCallback, consumerTag -> {
		});
	}

	private static void fanout(Channel channel) throws IOException {
		channel.exchangeDeclare(EXCHANGE_CREATE_ORDER, "fanout");

		String queue = channel.queueDeclare().getQueue();

		channel.queueBind(queue, EXCHANGE_CREATE_ORDER, "");
		

		DeliverCallback deliverCallback = (consumerTag, delivery) -> {
			String message = new String(delivery.getBody(), "UTF-8");
			System.out.println(" [x] Received Notification for Create :'" + message + "'");
		};
		channel.basicConsume(queue, true, deliverCallback, consumerTag -> {
		});
	}

}
