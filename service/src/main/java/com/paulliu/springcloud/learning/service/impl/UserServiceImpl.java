package com.paulliu.springcloud.learning.service.impl;

import com.paulliu.springcloud.learn.api.moudle.User;
import com.paulliu.springcloud.learn.api.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liusonglin
 * Date:2017/11/10
 * Description:
 */
@RestController
public class UserServiceImpl implements UserService {

    public User generateUserById(int id){
        return User.builder()
                .id(id)
                .name("yes")
                .address("Wastion town")
                .age(20)
                .build();
    }
}

