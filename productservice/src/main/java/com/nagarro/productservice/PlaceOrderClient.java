package com.nagarro.productservice;

import java.util.Date;

import com.nagarro.proto.OrderService;
import com.nagarro.proto.OrderService.OrderReply;
import com.nagarro.proto.PlaceOrderGrpc;
import com.nagarro.proto.PlaceOrderGrpc.PlaceOrderBlockingStub;
import com.nagarro.proto.UpdateOrderGrpc;
import com.nagarro.proto.UpdateOrderGrpc.UpdateOrderBlockingStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class PlaceOrderClient {

	public static void main(String[] args) {
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8088).usePlaintext().build();
		PlaceOrderBlockingStub placeOrderBlockingStub = PlaceOrderGrpc.newBlockingStub(channel);
		UpdateOrderBlockingStub updateOrderBlockingStub = UpdateOrderGrpc.newBlockingStub(channel);

		/*
		 * OrderReply orderReply = placeOrderBlockingStub
		 * .placeOrder(OrderService.OrderRequest.newBuilder().setId("1").
		 * setCategory("clothings").setDate(""+System.currentTimeMillis()) .build());
		 */
		
		OrderReply updateOrderReply = updateOrderBlockingStub.updateOrder(OrderService.OrderRequest.newBuilder().setId("2").build());

		//System.out.println(orderReply.getMessage());
		System.out.println(updateOrderReply.getMessage());
		
		channel.shutdown();

	}

}
