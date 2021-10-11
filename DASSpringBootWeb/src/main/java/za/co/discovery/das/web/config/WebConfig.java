package za.co.discovery.das.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import za.co.discovery.das.logic.config.LogicConfig;

@Import({LogicConfig.class})
@Configuration
@ComponentScan(basePackages = {
        "za.co.discovery.das.web.controller",
        "za.co.discovery.das.web.exception",
        "za.co.discovery.das.web.config"
})
public class WebConfig {
}
