package com.gevirgo.community.model;

import lombok.Data;

/**
 * @ClassName Question
 * @Description TODO
 * @Author ding.liangliang
 * @Date 2020/1/14 21:11
 */
@Data
public class Question {
    private Integer id;
    private String title;
    private String description;
    private Long gmtCreate;
    private Long gmtModified;
    private Integer creator;
    private Integer commentCount;
    private Integer viewCount;
    private Integer likeCount;
    private String tag;
}
