package com.cikezxy.springbootsandbox.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.UUID;

@PropertySource(value = "classpath:my.properties")
@Component
public class ExternalConfiguration {

    private static Logger log = LoggerFactory.getLogger(ExternalConfiguration.class);

    @Value("${my.secret.password}")
    private String password;

    @Value("${my.secret.intValue}")
    private Integer intValue;

    @Value("${my.secret.intValueRange}")
    private Integer intValueRange;

    @Value("${my.secret.longValue}")
    private Long longValue;

    @Value("${my.secret.longValueRange}")
    private Long longValueRange;

    @Value("${my.secret.uuid}")
    private UUID uuid;

    @Autowired
    private MyConfiguration myConfiguration;

    @PostConstruct
    private void init() {
        log.info("Configure Random Property Values using Spring Boot");
        log.info("password: " + password);
        log.info("intValue: " + intValue);
        log.info("intValueRange: " + intValueRange);
        log.info("longValue: " + longValue);
        log.info("longValueRange: " + longValueRange);
        log.info("uuid: " + uuid);
        log.info("myConfiguration:{}", myConfiguration.toString());
    }
}
