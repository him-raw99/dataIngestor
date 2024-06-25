package in.xeno.api.dataIngestor.repository;

import in.xeno.api.dataIngestor.model.Campaign;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CampaignRepo extends JpaRepository<Campaign,Long> {
}
