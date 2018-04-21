package com.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableConfigServer
@SpringBootApplication
@RestController
public class ConfigServer {
    public static void main(String[] arguments) {
        SpringApplication.run(ConfigServer.class, arguments);
    }

    @RequestMapping("test")
    public String test() {
        return "ceva";
    }
}

