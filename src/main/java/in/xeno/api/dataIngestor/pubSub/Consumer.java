package in.xeno.api.dataIngestor.pubSub;
import in.xeno.api.dataIngestor.config.IngestionServiceFactory;
import in.xeno.api.dataIngestor.config.RabbitMQConfig;
import in.xeno.api.dataIngestor.lib.ProxyRequest;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @Autowired private IngestionServiceFactory ingestionServiceFactory;

    @RabbitListener(queues = RabbitMQConfig.QUEUE_NAME)
    public void receiveMessage(ProxyRequest<Object> request)
    {
        System.out.println("Received message: " + request);
        this.ingestionServiceFactory.handleRequest(request);
    }
}