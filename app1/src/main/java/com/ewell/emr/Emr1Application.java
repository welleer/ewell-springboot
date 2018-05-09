package com.ewell.emr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ewell.emr.infrastructure.dao.mysql")
public class Emr1Application {

	public static void main(String[] args) {
		SpringApplication.run(Emr1Application.class, args);
	}
}
