package com.example.cybersport.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.example.cybersport.entities.Employer;
import com.example.cybersport.repository.UserRepository;

@Service
public class UserService implements UserServiceInterface {
 @Autowired
 UserRepository us;
 

@Override
@Transactional

public List<Employer> getAllEmployer() {
	// TODO Auto-generated method stub
	return (List<Employer>) us.findAll();
}

@Override
public Employer getEmployer(Integer id) {
	Optional<Employer> empl=us.findById(id);
	return empl.get() ;
}

@Override
public void deleteEmployer(Employer empl) {
	// TODO Auto-generated method stub
	
}

@Override
public void updateEmpler(Employer empl) {
	// TODO Auto-generated method stub
	
}

@Override
public void saveEmployer(Employer empl) {
	// TODO Auto-generated method stub
	
}
}
