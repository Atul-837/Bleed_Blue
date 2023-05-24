package com.cricket_application.bleed_blue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
public class BleedBlueApplication {

    public static void main(String[] args) {
        SpringApplication.run(BleedBlueApplication.class, args);
    }

}
