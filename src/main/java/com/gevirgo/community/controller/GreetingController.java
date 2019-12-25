package com.gevirgo.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName GreetingController
 * @Description TODO
 * @Author ding.liangliang
 * @Date 2019/12/25 21:07
 */
@Controller
public class GreetingController {
    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
}
