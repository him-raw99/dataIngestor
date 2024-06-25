package in.xeno.api.dataIngestor.repository;

import in.xeno.api.dataIngestor.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long> {
    @Query(value = "SELECT * FROM user WHERE ?", nativeQuery = true)
    public List<Customer> findByRule(String rule);
}
