package com.paulliu.springcloud.learn.api.service;

import com.paulliu.springcloud.learn.api.moudle.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by liusonglin
 * Date:2017/11/10
 * Description:
 */
@FeignClient(value = "service")
public interface UserService {

    @GetMapping(value = "/user")
    User generateUserById(@RequestParam(value = "id")int id);
}
