package com.example.cybersport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.cybersport.service.UserService;
import com.example.cybersport.service.UserServiceInterface;

@SpringBootApplication
public class CyberSportApplication implements CommandLineRunner {

	@Autowired
	UserServiceInterface us;
	
	public static void main(String[] args) {
		SpringApplication.run(CyberSportApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(us.getAllEmployer().get(0).getFirtName());
		
	}

	
}
