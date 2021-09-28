package za.co.discovery.das.repository.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//@Configuration makes it spring bean
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories("za.co.discovery.das.repository.persistence")
@EntityScan("za.co.discovery.das.repository.domain.persistence")
@PropertySource(value = "classpath:application-db.properties")
public class RepositoryConfig {
}
