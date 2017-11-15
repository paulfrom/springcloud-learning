package com.paulliu.springcloud.learning.client.kafka;

import com.paulliu.springcloud.learn.api.moudle.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;

/**
 * Created by liusonglin
 * Date:2017/11/14
 * Description:
 */
@EnableBinding(Source.class)
@Slf4j
public class KafkaProducer {

        @Autowired
        private Source source;

        public void sendMessage(User user) {
            try {
                boolean flag = source.output().send(MessageBuilder.withPayload(user).build());
                log.info("has success {}",flag);
            } catch (Exception e) {
                log.error("send exception====>{}",e);
            }
        }
}
