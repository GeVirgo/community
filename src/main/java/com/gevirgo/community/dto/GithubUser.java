package com.gevirgo.community.dto;

import lombok.Data;

/**
 * @ClassName githubUser
 * @Description TODO
 * @Author ding.liangliang
 * @Date 2019/12/28 22:17
 */
@Data
public class GithubUser {
    private String name;
    private long id;
    private String bio;
    private String avatar_url;
}
