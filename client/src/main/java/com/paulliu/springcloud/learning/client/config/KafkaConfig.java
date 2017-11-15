package com.paulliu.springcloud.learning.client.config;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.context.annotation.Configuration;

/**
 * Created by liusonglin
 * Date:2017/11/14
 * Description:
 */
@Configuration
@EnableBinding(Source.class)
public class KafkaConfig {


}
