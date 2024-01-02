package com.nagarro.productservice;

import java.io.IOException;

import com.nagarro.proto.OrderService;
import com.nagarro.proto.OrderService.OrderReply;
import com.nagarro.proto.PlaceOrderGrpc;
import com.nagarro.proto.PlaceOrderGrpc.PlaceOrderBlockingStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class PlaceOrderClient {

	public static void main(String[] args) throws IOException {
		
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8088).usePlaintext().build();
		PlaceOrderBlockingStub placeOrderBlockingStub = PlaceOrderGrpc.newBlockingStub(channel);

		OrderReply orderReply = placeOrderBlockingStub.placeOrder(OrderService.OrderRequest.newBuilder().setId("1")
				.setCategory("clothings").setDate("" + System.currentTimeMillis()).setPrice("12.0 INR").build());

		System.out.println("received response : " + orderReply.getMessage());


		channel.shutdown();

	}

}
