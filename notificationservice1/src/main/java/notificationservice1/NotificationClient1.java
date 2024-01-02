package notificationservice1;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.DeliverCallback;

public class NotificationClient1 {
	
	private static final String EXCHANGE_NAME = "CREATE_ORDER";
	public static void main(String[] args) {
		ConnectionFactory factory = new ConnectionFactory();
	    factory.setHost("localhost");
	    factory.setPort(8081);
	    Connection connection;
		try {
			connection = factory.newConnection();
			Channel channel = connection.createChannel();

		    channel.exchangeDeclare(EXCHANGE_NAME, "fanout");
		    String queue = channel.queueDeclare().getQueue();
		    
		    channel.queueBind(queue, EXCHANGE_NAME, "");
		    System.out.println(" [*] Waiting for Place Order Notification. To exit press CTRL+C");

		    DeliverCallback deliverCallback = (consumerTag, delivery) -> {
		        String message = new String(delivery.getBody(), "UTF-8");
		        System.out.println(" [x] notification 1 '" + message + "'");
		    };
		    channel.basicConsume(queue, true, deliverCallback, consumerTag -> { });
		} catch (IOException | TimeoutException e) {
			System.out.println("Notification cannot be received on client 1 :"+e.getMessage());
			
		}
	    
	    
	    


	}

}
