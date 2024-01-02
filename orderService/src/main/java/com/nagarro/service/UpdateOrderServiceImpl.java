package com.nagarro.service;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.TimeoutException;

import com.nagarro.proto.OrderService;
import com.nagarro.proto.OrderService.OrderReply;
import com.nagarro.proto.UpdateOrderGrpc.UpdateOrderImplBase;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class UpdateOrderServiceImpl extends UpdateOrderImplBase {

	private static final String EXCHANGE_CREATE_ORDER = "CREATE_ORDER";
	private static final String EXCHANGE_UPDATE_ORDER = "UPDATE_ORDER";

	private static final String KEY = "update_key";

	public void updateOrder(com.nagarro.proto.OrderService.OrderRequest request,
			io.grpc.stub.StreamObserver<com.nagarro.proto.OrderService.OrderReply> responseObserver) {
		OrderReply orderReply = OrderService.OrderReply.newBuilder()
				.setMessage("id received for update" + request.getId()).build();
		responseObserver.onNext(orderReply);
		responseObserver.onCompleted();
		sendNotification("Order Updated for id" + request.getId());
	}

	public void sendNotification(String msg) {
		ConnectionFactory factory = new ConnectionFactory();
		factory.setHost("localhost");
		factory.setPort(8081);

		try (Connection connection = factory.newConnection(); Channel channel = connection.createChannel()) {
			direct(msg, channel);

		} catch (IOException | TimeoutException e) {
			System.out.println("notification cunt be sent");
			e.printStackTrace();
		}
	}

	private static void direct(String msg, Channel channel) throws IOException, UnsupportedEncodingException {
		channel.exchangeDeclare(EXCHANGE_UPDATE_ORDER, "direct");

		channel.basicPublish(EXCHANGE_UPDATE_ORDER, KEY, null, msg.getBytes("UTF-8"));

		System.out.println(" [x] Sent direct -> " + msg + "'");
	}


}
