package in.xeno.api.dataIngestor.service;

import in.xeno.api.dataIngestor.model.Customer;
import in.xeno.api.dataIngestor.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService extends TemplateService<Customer> {

    @Autowired private CustomerRepo customerRepo;

    @Override
    public Customer save(Customer data) {
        return customerRepo.save(data);
    }

    @Override
    public Customer update(Customer data) {
        return null;
    }

    @Override
    public Customer delete(Customer data) {
        return null;
    }
}
