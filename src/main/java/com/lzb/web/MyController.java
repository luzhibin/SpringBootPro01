package com.lzb.web;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

/**
 * Created by luzhibin on 2019/11/3 16:28
 */
@RestController
public class MyController {

    @Autowired
    private DataSource dataSource;

    @RequestMapping("/hello")
    public String hello(){
        System.out.println(dataSource);
        return "Hello SpringBoot,First init";
    }
}
