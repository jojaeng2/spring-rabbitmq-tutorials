import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.MessageProperties;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;


public class NewTask {

    private final static String QUEUE_NAME = "TASK_QUEUE2" ;

    public static void main(String[] args) throws Exception{

        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");

        while(true) {

            Scanner in = new Scanner(System.in);
            String message = in.nextLine();
            if(message.equals("0")) break;

            try (Connection connection = factory.newConnection();
                 Channel channel = connection.createChannel()) {

                boolean durable = true;
                channel.queueDeclare(QUEUE_NAME, durable, false, false, null);

                channel.basicPublish("", QUEUE_NAME, MessageProperties.PERSISTENT_TEXT_PLAIN, message.getBytes(StandardCharsets.UTF_8));
                System.out.println(" [x] Sent '" + message + "'");
            }
        }
    }
}