package za.co.discovery.das.web.sb.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import za.co.discovery.das.logic.config.LogicConfig;

@Import({LogicConfig.class})
@Configuration
@ComponentScan(basePackages = {"za.co.discovery.das.web.sb.controller",
                               "za.co.discovery.das.web.sb.exception"})
public class WebConfig {
}
