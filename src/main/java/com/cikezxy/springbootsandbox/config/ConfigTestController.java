package com.cikezxy.springbootsandbox.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PropertySource(value = "classpath:my.properties")
public class ConfigTestController {

    @Autowired
    private YmlEnvironmentConfig ymlEnvironmentConfig;

    @Value("${environments.url}")
    private String url;

    @Value("${my.uuid}")
    private String uuid;

    @GetMapping(value = "/ymlConfig")
    public YmlEnvironmentConfig ymlEnvironmentConfig() {
        return ymlEnvironmentConfig;
    }

    @GetMapping(value = "/environmentsUrl")
    public String environmentsUrl() {
        return url;
    }

    @RequestMapping(value = "/uuid")
    public String uuid() {
        return uuid;
    }
}
