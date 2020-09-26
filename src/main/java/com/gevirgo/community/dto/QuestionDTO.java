package com.gevirgo.community.dto;

import com.gevirgo.community.model.User;
import lombok.Data;

/**
 * @Description :
 * @Author : dingliangliang
 * @Date: 2020-09-20 16:30
 */
@Data
public class QuestionDTO {
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
    private User user;
}
