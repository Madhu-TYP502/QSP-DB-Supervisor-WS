package com.tyss.dashboard.supervisor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SupervisorServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SupervisorServiceApplication.class, args);
	}

}
