package com.huangguang.cloud.controller;

import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * <p>
 * Description:
 * User : huangguang
 * DATE : 2018-01-19 11:19
 */
@Component
public class HelloServiceHystrix implements HelloService {
    @Override
    public String hello(String name) {
        return "hello" +name+", this messge send failed ";
    }
}
