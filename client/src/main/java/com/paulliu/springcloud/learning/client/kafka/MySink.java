package com.paulliu.springcloud.learning.client.kafka;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * Created by liusonglin
 * Date:2017/11/14
 * Description:
 */
public interface MySink {
        String INPUT = "output";

        @Input("output")
        SubscribableChannel input();
}
