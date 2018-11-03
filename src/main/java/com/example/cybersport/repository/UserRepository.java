package com.example.cybersport.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.cybersport.entities.Employer;

@Repository
public interface UserRepository extends CrudRepository<Employer, Integer> {

}
