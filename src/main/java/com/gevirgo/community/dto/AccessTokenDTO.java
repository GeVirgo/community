package com.gevirgo.community.dto;

import lombok.Data;

/**
 * @ClassName AccessToken
 * @Description TODO
 * @Author ding.liangliang
 * @Date 2019/12/28 21:47
 */
@Data
public class AccessTokenDTO {
    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri	;
    private String state;
}
