package com.zhsw.springbootadminclient.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhengLiang
 * @description
 * @date 2020/3/12 10:21
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String  hello(){
        return "helloWorld";
    }
}
