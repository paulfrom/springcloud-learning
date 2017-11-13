//package com.paulliu.springcloud.learn.api.errorimpl;
//
//import com.paulliu.springcloud.learn.api.moudle.User;
//import com.paulliu.springcloud.learn.api.service.UserService;
//import org.springframework.web.bind.annotation.RequestParam;
//
///**
// * Created by liusonglin
// * Date:2017/11/10
// * Description:
// */
//public class UserErrorImpl implements UserService {
//
//    @Override
//    public User generateUserById(@RequestParam(value = "id") int id) {
//        return User.builder()
//                .name("no one")
//                .address("secret")
//                .age(99)
//                .build();
//    }
//}
