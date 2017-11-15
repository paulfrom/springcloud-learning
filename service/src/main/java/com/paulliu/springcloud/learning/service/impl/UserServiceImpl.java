package com.paulliu.springcloud.learning.service.impl;

import com.paulliu.springcloud.learn.api.moudle.User;
import com.paulliu.springcloud.learn.api.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liusonglin
 * Date:2017/11/10
 * Description:
 */
@RestController
@RefreshScope
@Slf4j
public class UserServiceImpl implements UserService {

//    @Value("${from}")
    private String from;

    public User generateUserById(int id){
        log.info("from ========== {}",from);
        if(id%2==0) {
            return User.builder()
                    .id(id)
                    .name("yes")
                    .address("Wastion town")
                    .age(20)
                    .build();
        }
        throw new RuntimeException("not even");
    }
}

