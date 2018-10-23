package com.cikezxy.springbootsandbox.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@ConfigurationProperties(prefix = "environments")
@Component
@Data
public class YmlEnvironmentConfig {
    private String url;
    private String name;
    private List<String> servers;
}
