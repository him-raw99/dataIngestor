package in.xeno.api.dataIngestor.service;

import in.xeno.api.dataIngestor.model.Order;
import in.xeno.api.dataIngestor.repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OrderService extends TemplateService<Order> {

    @Autowired private OrderRepo orderRepo;

    @Override
    public Order save(Order data) {
        return orderRepo.save(data);
    }

    @Override
    public Order update(Order data) {
        return null;
    }

    @Override
    public Order delete(Order data) {
        return null;
    }
}
