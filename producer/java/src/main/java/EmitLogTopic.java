import com.fasterxml.jackson.databind.ObjectMapper;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.util.Scanner;

public class EmitLogTopic {
    private static final String EXCHANGE_NAME = "topic_logs";

    public static void main(String[] argv) throws Exception {
//        ConnectionFactory factory = new ConnectionFactory();
//        factory.setHost("localhost");
//        try (Connection connection = factory.newConnection();
//             Channel channel = connection.createChannel()) {
//
//            channel.exchangeDeclare(EXCHANGE_NAME, "topic");
//            Scanner in = new Scanner(System.in);
//
//            String routingKey = in.nextLine();
//            String message = in.nextLine();
//
//            channel.basicPublish(EXCHANGE_NAME, routingKey, null, message.getBytes("UTF-8"));
//            System.out.println(" [x] Sent '" + routingKey + "':'" + message + "'");
//        }

    }
}
