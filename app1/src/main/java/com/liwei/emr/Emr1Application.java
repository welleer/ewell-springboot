package com.liwei.emr;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableDubboConfiguration
public class Emr1Application {

	public static void main(String[] args) {
		SpringApplication.run(Emr1Application.class, args);
	}
}
