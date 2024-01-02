# Services_and_Middleware_2023
# Requirement
1. Java version 8 or above
2. Maven 
3. Docker
4. rabbitMQ image version 3

# Services
1. OrderService - This is the gRPC server contains the proto file and runs on localserver with port 8088
2. productService - This service contains the clients for OrderService i.e. PlaceOrderClient (will call place order service) and UpdateOrderClient (will call update order service).
3. notificationservice1 - This is the consumer for create order service, which is linstening the rabbitMQ on port 8081
4. notificationservice2 - This is the consumer for create and update order service, which is linstening the rabbitMQ on port 8081.

# running
Docker command: 
docker run --rm -it -p 15672:15672 -p 8081:5672 rabbitmq:3-management

Run consumers:
1. notificationservice1 - run the main class i.e. NotificationClient1.java
2. notificationservice2 - run the main class i.e. NotificationClient2.java

Build and Run:
1. productService - use **mvn clean install** to generate the code from proto file and run the main class i.e. Main.java
2. OrderService - use **mvn clean install** to generate the code from proto file and run the PlaceOrderClient.java to place an Order and UpdateOrderClient.java to update


   
