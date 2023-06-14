package com.formacionbdi.springboot.app.items2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class SpringbootServicioItems2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServicioItems2Application.class, args);
	}

}
