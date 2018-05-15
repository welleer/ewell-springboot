package com.ewell.emr;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class Emr1Application {

	public static void main(String[] args) {
		SpringApplication.run(Emr1Application.class, args);
	}
}
