package com.liwei.emr;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class Emr2Application {

	public static void main(String[] args) {
		SpringApplication.run(Emr2Application.class, args);
	}
}
