package com.onetwonet.contoller;

import com.onetwonet.dto.Bets;
import com.onetwonet.jpa.model.Bet;
import com.onetwonet.kafka.ProducerService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RequiredArgsConstructor
@RestController
@RequestMapping("msg")
@Slf4j
public class MsgController {


    @Autowired
    private ProducerService producerService;

    @PostMapping("/generate")
    public String generate(@RequestBody Bets message) {

        producerService.produce(message);
        log.info("bet's details have been sent via Kafka");
        return "OK";
    }
}
