package com.abc.oservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableFeignClients
public class OserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OserviceApplication.class, args);
	}

}
