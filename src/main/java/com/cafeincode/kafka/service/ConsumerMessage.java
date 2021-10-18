package com.cafeincode.kafka.service;

import com.cafeincode.kafka.constant.Constant;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ConsumerMessage {

    @KafkaListener(topics = Constant.KAFKA.TOPIC_SEND_MESSAGE, groupId = Constant.KAFKA.GROUP_ID)
    public void consume(String jsonData) {
        log.info(String.format("#### -> Consumed message-> %s", jsonData));
    }
}
