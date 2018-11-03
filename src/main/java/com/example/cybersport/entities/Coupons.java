package com.example.cybersport.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Coupons")
public class Coupons {

	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(name="discount")
	private Integer disCount;
	
	@ManyToMany
	@JoinTable(name="User_Coupons", joinColumns= { @JoinColumn(name = "Coupons_id")}, inverseJoinColumns= { @JoinColumn(name = "User_id")})
	List<Employer> listEmployer =new ArrayList<>();
//	private Company company;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getDisCount() {
		return disCount;
	}

	public void setDisCount(Integer disCount) {
		this.disCount = disCount;
	}

	public List<Employer> getListEmployer() {
		return listEmployer;
	}

	public void setListEmployer(List<Employer> listEmployer) {
		this.listEmployer = listEmployer;
	}
	
	
}
