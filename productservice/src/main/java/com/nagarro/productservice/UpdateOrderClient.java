package com.nagarro.productservice;

import com.nagarro.proto.OrderService;
import com.nagarro.proto.OrderService.OrderReply;
import com.nagarro.proto.UpdateOrderGrpc;
import com.nagarro.proto.UpdateOrderGrpc.UpdateOrderBlockingStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class UpdateOrderClient {

	public static void main(String[] args) {
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8088).usePlaintext().build();
		UpdateOrderBlockingStub updateOrderBlockingStub = UpdateOrderGrpc.newBlockingStub(channel);

		OrderReply updateOrderReply = updateOrderBlockingStub
				.updateOrder(OrderService.OrderRequest.newBuilder().setId("2").setCategory("clothings")
						.setDate("" + System.currentTimeMillis()).setPrice("10.20 INR").build());

		System.out.println("received response : " + updateOrderReply.getMessage());

		channel.shutdown();

	}

}
