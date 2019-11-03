package com.lzb.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by luzhibin on 2019/11/3 16:28
 */
@Controller
public class MyController {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello springboot";
    }
}
