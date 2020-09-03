package com.finalproject.sheeks;

import com.finalproject.sheeks.repositories.RoleRepository;
import com.finalproject.sheeks.services.ApplicationService;
import com.finalproject.sheeks.services.IApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SheeksApplication {

	@Autowired
	IApplicationService applicationService;

	public static void main(String[] args) {
		SpringApplication.run(SheeksApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {
			applicationService.insertData();
		};
	}

}
