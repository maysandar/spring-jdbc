package com.techfun.jdbc.model;

public class Employee {
	
	private Integer id;
	private String name;
	private int age;
	private String address;
	
	public String getAdress() {
		return address;
	}
	
	public Integer getAge() {
		return age;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}

}
