package in.xeno.api.dataIngestor.repository;

import in.xeno.api.dataIngestor.model.CommunicationLogs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommunicationLogRepo extends JpaRepository<CommunicationLogs,Long> {
}
