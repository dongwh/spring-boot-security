package com.drpeng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by dongwh on 17/4/19.
 */
@Controller
public class HelloController {

    //test start
    @RequestMapping("/test")
    public String index(Model model){
        return "test";
    }

    @RequestMapping("/place")
    public String place(Model model){
        return "/placeorder/place";
    }
    //test end

    //login
    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    //home index
    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    //hello
    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
}
