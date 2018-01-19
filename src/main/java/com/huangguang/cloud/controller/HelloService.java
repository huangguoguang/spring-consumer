package com.huangguang.cloud.controller;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created with IntelliJ IDEA.
 * <p>
 * Description:
 * User : huangguang
 * DATE : 2018-01-18 17:38
 */
@FeignClient(value = "spring-cloud-producer")
public interface HelloService {

    @RequestMapping(value = "hello")
    public String hello(@RequestParam("name") String name);
}

