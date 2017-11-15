package com.paulliu.springcloud.learning.client.controller;

import com.paulliu.springcloud.learn.api.moudle.User;
import com.paulliu.springcloud.learn.api.service.UserService;
import com.paulliu.springcloud.learning.client.kafka.KafkaProducer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * Created by liusonglin
 * Date:2017/11/10
 * Description:
 */
@RestController
@Slf4j
public class DemoClientController {

    @Autowired
    UserService userService;

    @Autowired
    KafkaProducer kafkaProducer;

    @GetMapping(value = "/index")
    public User index(Integer id) {
        User result = userService.generateUserById(id);
        log.info("index date {}:", result);
        kafkaProducer.sendMessage(result);
        return result;
    }
}
