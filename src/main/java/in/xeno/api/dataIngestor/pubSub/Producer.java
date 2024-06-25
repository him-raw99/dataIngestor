package in.xeno.api.dataIngestor.pubSub;

import in.xeno.api.dataIngestor.config.RabbitMQConfig;
import in.xeno.api.dataIngestor.lib.ProxyRequest;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Producer {

    @Autowired private RabbitTemplate rabbitTemplate;

    public void sendMessage(ProxyRequest<Object> data)
    {
        rabbitTemplate.convertAndSend(
                RabbitMQConfig.EXCHANGE_NAME,
                RabbitMQConfig.ROUTING_KEY,
                data
        );
    }
}
