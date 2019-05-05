package com.cikezxy.springbootsandbox;

import com.cikezxy.springbootsandbox.listener.GenericListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringBootSandboxApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(SpringBootSandboxApplication.class).listeners(new GenericListener()).run(args);
    }
}
