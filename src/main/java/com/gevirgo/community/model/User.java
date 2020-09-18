package com.gevirgo.community.model;

import lombok.Data;

/**
 * @ClassName User
 * @Description TODO
 * @Author ding.liangliang
 * @Date 2019/12/29 20:54
 */
@Data
public class User {
    private Integer id;
    private String accountId;
    private String name;
    private String token;
    private Long gmtCreate;
    private Long gmtModified;
    private String avatarUrl;
}
