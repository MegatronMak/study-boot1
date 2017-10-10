package com.zccoder.mybootch1033;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @title 启动类
 * @describe 基于Docker部署
 * @author zc
 * @version 1.0 2017-10-10
 */
@SpringBootApplication
@RestController
public class Mybootch1033Application {

	@RequestMapping("/")
	public String home(){
		return "Helo Docker!";
	}

	public static void main(String[] args) {
		SpringApplication.run(Mybootch1033Application.class, args);
	}
}
