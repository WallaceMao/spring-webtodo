package com.wallace.projectservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@MapperScan("com.wallace.projectservice.mapper")
public class ProjectserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectserviceApplication.class, args);
	}

}
