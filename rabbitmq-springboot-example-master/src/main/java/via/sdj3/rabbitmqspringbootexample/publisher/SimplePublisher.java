package via.sdj3.rabbitmqspringbootexample.publisher;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import java.util.Calendar;

@Service
public class SimplePublisher {

    private RabbitTemplate rabbitTemplate;

    public SimplePublisher(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void send(String msg) {
        String message = " { " + msg + " } received at " + Calendar.getInstance().getTime();
        this.rabbitTemplate.convertAndSend(
                "product.exchange",
                "product.routingkey"
                , message);
        System.out.printf("RabbitMQ Message sent: %s\n", message);
    }

}
