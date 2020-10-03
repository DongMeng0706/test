package com.example.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author:dm
 * @Date:2020/10/3 10:46
 * @Description:
 */
@Controller
public class HelloController {

    @RequestMapping("/index")
    public String sayHello(){
        return "index";
    }

}
