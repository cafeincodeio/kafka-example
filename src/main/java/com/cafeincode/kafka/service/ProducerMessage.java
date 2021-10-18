package com.cafeincode.kafka.service;

import com.cafeincode.kafka.constant.Constant;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ProducerMessage {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String smsJsonData) {
        log.info(String.format("#### -> Producing message -> %s", smsJsonData));
        this.kafkaTemplate.send(Constant.KAFKA.TOPIC_SEND_MESSAGE, smsJsonData);
    }
}
