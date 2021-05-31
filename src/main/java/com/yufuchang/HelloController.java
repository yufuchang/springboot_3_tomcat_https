package com.yufuchang;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yufuchang on 2020/7/31.
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        System.out.print("欢迎来到yufuchang的springboot实验台");
        return "欢迎来到yufuchang的springboot实验台";
    }
}
