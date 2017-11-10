package com.paulliu.springcloud.learning.client.controller;

import com.paulliu.springcloud.learn.api.moudle.User;
import com.paulliu.springcloud.learn.api.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping(value = "/index")
    public User index() {
        User result = userService.generateUserById(1);
        log.info("index date {}:", result);
        return result;
    }
}
