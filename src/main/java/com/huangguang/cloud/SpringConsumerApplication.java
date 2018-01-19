package com.huangguang.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients//启用feign进行远程调用
public class SpringConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringConsumerApplication.class, args);
	}
}
