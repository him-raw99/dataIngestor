package in.xeno.api.dataIngestor.repository;

import in.xeno.api.dataIngestor.model.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendorRepo extends JpaRepository<Vendor,Long> {
}
