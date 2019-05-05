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

    @Value("${my.uuid}")
    private String uuid;

    @Value("${my.placeholder}")
    private String placeHolder;

    @RequestMapping(value = "/uuid")
    public String uuid() {
        return uuid;
    }

    @RequestMapping(value = "/placeHolder")
    public String placeHolder() {
        return placeHolder;
    }
}
