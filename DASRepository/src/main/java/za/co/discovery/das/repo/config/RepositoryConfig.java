package za.co.discovery.das.repo.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories("za.co.discovery.das.repo.persistence")
@EntityScan("za.co.discovery.das.domain.persistence")
@PropertySource(value = "classpath:application-db.properties")
@ComponentScan(basePackages = {
        "za.co.discovery.das.repo"
})
public class RepositoryConfig {

}
