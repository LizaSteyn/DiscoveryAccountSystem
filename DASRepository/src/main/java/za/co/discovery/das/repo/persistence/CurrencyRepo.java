package za.co.discovery.das.repo.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.discovery.das.domain.persistence.Currency;

@Repository
public interface CurrencyRepo extends JpaRepository<Currency, Long> {
}
