package com.hanming.elib.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hanming.xiao
 * @date 2019-09-30
 */
@RestController
public class HelloWorldController {

    /**
     * 测试用
     * @param string
     * @return
     */
    @RequestMapping("/hello/{string}")
    @ResponseBody
    public String helloWorld(@PathVariable("string")String string){
        return string;

    }
}
