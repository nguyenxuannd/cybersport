package com.example.cybersport.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cybersport.entities.Employer;
import com.example.cybersport.service.UserServiceInterface;

@RestController
public class EmployController {
	@Autowired
	UserServiceInterface userServiceInterface;
	@GetMapping("/list")
	public List<Employer> home() {
		return userServiceInterface.getAllEmployer();
	}
	
	@GetMapping("/empl/{id}")
	public Employer empl(@PathVariable Integer id) {
		return userServiceInterface.getEmployer(id);
	}
}
