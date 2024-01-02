package com.nagarro.orderservice;

import java.io.IOException;

import com.nagarro.service.PlaceOrderServiceImpl;
import com.nagarro.service.UpdateOrderServiceImpl;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class Main {

	public static void main(String[] args) {
		
		Server server = ServerBuilder.forPort(8088).addService(new PlaceOrderServiceImpl())
				.addService(new UpdateOrderServiceImpl()).build();
		 try {
			server.start();
			System.out.println("gRPC server started at "+server.getPort());
			server.awaitTermination();
		} catch (IOException | InterruptedException e) {
			System.out.println("terminating .."+ e.getMessage());
		}

	}

}
