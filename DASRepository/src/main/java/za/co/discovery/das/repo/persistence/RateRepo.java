package za.co.discovery.das.repo.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.discovery.das.domain.persistence.Rate;

@Repository
public interface RateRepo extends JpaRepository<Rate, Long> {
}
