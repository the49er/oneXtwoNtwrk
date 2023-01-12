package com.onetwonet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;

@EnableKafka
@SpringBootApplication
public class OneTwoNetworkApplication {

    public static void main(String[] args) {
        SpringApplication.run(OneTwoNetworkApplication.class, args);
    }
}
