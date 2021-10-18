package com.cafeincode.kafka.controller;

import com.cafeincode.kafka.service.ProducerMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class TestRestController {

    @Autowired
    private ProducerMessage producerMessage;

    @GetMapping(value = "/send-message")
    public String sendSMSToKafka() {
        System.out.println("----------------START SEND-----------");
        String mes = "Sending message to kafka topic by cafeincode:" + new Random().nextInt(100);
        producerMessage.sendMessage(mes);
        System.out.println("----------------END SEND-------------");
        return "OK";
    }
}
