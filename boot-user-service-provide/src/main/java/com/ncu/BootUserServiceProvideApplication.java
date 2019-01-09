package com.ncu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.ncu.dao")
public class BootUserServiceProvideApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootUserServiceProvideApplication.class, args);
	}

}
