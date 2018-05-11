package com.ewell.emr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ewell.emr.infrastructure.dao.mysql")
public class Emr2Application2 {

	public static void main(String[] args) {
		SpringApplication.run(Emr2Application2.class, args);
	}
}
