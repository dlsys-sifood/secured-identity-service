package com.dlsys.sifood.sis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SecuredIdentityServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecuredIdentityServiceApplication.class, args);
	}

}
