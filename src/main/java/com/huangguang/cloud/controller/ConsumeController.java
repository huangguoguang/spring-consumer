package com.huangguang.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * <p>
 * Description:
 * User : huangguang
 * DATE : 2018-01-18 17:42
 */
@RestController
public class ConsumeController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return helloService.hello(name);
    }
}
