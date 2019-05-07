package com.bigstudent.model;

public class BigStudentModel {
	private int Id;//学号
	private String name;//姓名
	private int age;//年龄
	private int sex;//性别
	private String address;//家庭地址
	
	
	
	public BigStudentModel(int id, String name, int age, int sex, String address) {
		super();
		Id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.address = address;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
