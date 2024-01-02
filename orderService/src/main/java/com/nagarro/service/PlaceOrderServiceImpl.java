package com.nagarro.service;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.TimeoutException;

import com.nagarro.proto.OrderService;
import com.nagarro.proto.OrderService.OrderReply;
import com.nagarro.proto.PlaceOrderGrpc.PlaceOrderImplBase;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class PlaceOrderServiceImpl extends PlaceOrderImplBase {
	
	private static final String EXCHANGE_NAME = "CREATE_ORDER";

	public void placeOrder(com.nagarro.proto.OrderService.OrderRequest request,
			io.grpc.stub.StreamObserver<com.nagarro.proto.OrderService.OrderReply> responseObserver) {

		String notification= "Order created with id :"+request.getId()+".";
		OrderReply orderReply = OrderService.OrderReply.newBuilder().setMessage("Order created successfully").build();
		responseObserver.onNext(orderReply);
		responseObserver.onCompleted();
		sendNotification(notification);
	}
	
	public void sendNotification(String msg) {
		ConnectionFactory factory = new ConnectionFactory();
		factory.setHost("localhost");
		factory.setPort(8081);

		try (Connection connection = factory.newConnection(); Channel channel = connection.createChannel()) {
			fanout(msg, channel);

		} catch (IOException | TimeoutException e) {
			System.out.println("notification cunt be sent");
			e.printStackTrace();
		}
	}
	

	private static void fanout(String msg, Channel channel) throws IOException, UnsupportedEncodingException {
		channel.exchangeDeclare(EXCHANGE_NAME, "fanout");

		channel.basicPublish(EXCHANGE_NAME, "", null, msg.getBytes("UTF-8"));

		System.out.println(" [x] Sent '" + msg + "'");
	}

}
