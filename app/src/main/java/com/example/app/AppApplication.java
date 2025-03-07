package com.example.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class AppApplication {
    public static void main(String[] args) {
        SpringApplication.run(AppApplication.class, args);  
    }

    @RestController
@RequestMapping("/api")
class HelloController {

    @Value("${server.instance:unknown}")
    private String instanceId;

    @GetMapping("/hello")
    public String sayHello() {
        return "Merhaba, Docker! (Server: " + instanceId + ")";
    }

}
}