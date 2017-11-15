package com.paulliu.springcloud.learning.client.kafka;

import com.paulliu.springcloud.learn.api.moudle.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;

/**
 * Created by liusonglin
 * Date:2017/11/14
 * Description:
 */
@EnableBinding(MySink.class)
@Slf4j
public class KafkaConsumer {

    @StreamListener(MySink.INPUT)
    public void process(Message<User> message) {
        log.info("msg is {}",message.getPayload());
        Acknowledgment acknowledgment = message.getHeaders().get(KafkaHeaders.ACKNOWLEDGMENT, Acknowledgment.class);
        if (acknowledgment != null) {
            log.info("Acknowledgment provided");
            acknowledgment.acknowledge();
        }
    }
}
