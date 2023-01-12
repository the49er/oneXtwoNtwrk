package com.onetwonet.kafka;

import com.onetwonet.dto.Bets;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class ConsumerService {

    @KafkaListener(topics = "bet_detail", groupId = "message_group_id")
    public void consume (Bets message){
        System.out.println("CONSUMER: All bets with return value \">= 1500\": ");
        message.getBets().stream()
                .filter(x -> x.getReturns().compareTo(BigDecimal.valueOf(1500L)) >= 0)
                .forEach(System.out::println);
    }


}
