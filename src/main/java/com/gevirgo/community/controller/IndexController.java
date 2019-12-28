package com.gevirgo.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName indexController
 * @Description TODO
 * @Author ding.liangliang
 * @Date 2019/12/28 20:23
 */
@Controller
public class IndexController {
    @GetMapping("/")
    public String index(){
        return "index";
    }
}
