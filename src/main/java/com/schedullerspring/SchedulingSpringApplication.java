package com.schedullerspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SchedulingSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(SchedulingSpringApplication.class, args);
    }

}

