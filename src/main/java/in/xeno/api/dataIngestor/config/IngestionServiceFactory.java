package in.xeno.api.dataIngestor.config;

import in.xeno.api.dataIngestor.constants.ProxyContext;
import in.xeno.api.dataIngestor.lib.ProxyRequest;
import in.xeno.api.dataIngestor.model.Customer;
import in.xeno.api.dataIngestor.model.Order;
import in.xeno.api.dataIngestor.service.CustomerService;
import in.xeno.api.dataIngestor.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IngestionServiceFactory {
    @Autowired
    private CustomerService customerService;
    @Autowired private OrderService orderService;

    public void handleRequest(ProxyRequest<Object> request){
        switch (request.context){
            case ProxyContext.CUSTOMER:
                customerService.handleRequest(request.action,(Customer) request.data);
                break;
            case ProxyContext.ORDER:
                orderService.handleRequest(request.action,(Order) request.data);
                break;
            default:
                throw new Error("request context not found...");
        }

    }
}
