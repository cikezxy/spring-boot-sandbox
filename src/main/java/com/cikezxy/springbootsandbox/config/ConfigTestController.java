package com.cikezxy.springbootsandbox.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigTestController {

    @Autowired
    private YmlEnvironmentConfig ymlEnvironmentConfig;

    @Value("${environments.url}")
    private String url;

    @GetMapping(value="/ymlConfig")
    public YmlEnvironmentConfig ymlEnvironmentConfig(){
        return ymlEnvironmentConfig;
    }

    @GetMapping(value="/environmentsUrl")
    public String environmentsUrl(){
        return url;
    }
}
