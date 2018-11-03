package com.example.cybersport.service;

import java.util.List;

import com.example.cybersport.entities.Employer;

public interface UserServiceInterface {
	public List<Employer> getAllEmployer();
	public Employer getEmployer(Integer  id);
	public void deleteEmployer(Employer empl);
	public void updateEmpler(Employer empl);
	public void saveEmployer(Employer empl);
}
