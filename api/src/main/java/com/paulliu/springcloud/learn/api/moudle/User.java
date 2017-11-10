package com.paulliu.springcloud.learn.api.moudle;

import lombok.Builder;
import lombok.Data;

/**
 * Created by liusonglin
 * Date:2017/11/10
 * Description:
 */
@Data
@Builder
public class User {
    private Integer id;

    private String name;

    private Integer age;

    private String address;
}
