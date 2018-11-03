package com.example.cybersport.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Employer")
public class Employer {
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(name="firtname")
	private String firtName;
	@Column(name="lastname")
	private String lastName;
	private String email;
	@Column(name="password")
	private String passWord;
	private Integer age;
	@Column(name="nickname")
	private String nickName;
	private String gender;
	//private String image;
	@ManyToMany(fetch=FetchType.LAZY,mappedBy="listEmployer")
	private List<Coupons> listCoupons=new ArrayList<>();
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirtName() {
		return firtName;
	}
	public void setFirtName(String firtName) {
		this.firtName = firtName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public List<Coupons> getListCoupons() {
		return listCoupons;
	}
	public void setListCoupons(List<Coupons> listCoupons) {
		this.listCoupons = listCoupons;
	}

	
	

}
