package in.xeno.api.dataIngestor.repository;

import in.xeno.api.dataIngestor.model.Rule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RuleRepo extends JpaRepository<Rule,Long> {
}
