package in.xeno.api.dataIngestor.repository;

import in.xeno.api.dataIngestor.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo  extends JpaRepository<Order,Long> {

}
