package com.ashokit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER_DETAILS")
public class UserEntity {
@Id
@Column(name="USER_ID")

private Integer userId;
@Column(name="USER_NAME")
private String name;
@Column(name="USER_EMAIL")
private String email;
@Column(name="USER_AGE")
private Integer age;
@Column(name="USER_SALARY")
private double salary;
public Integer getUserId() {
	return userId;
}
public void setUserId(Integer userId) {
	this.userId = userId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Integer getAge() {
	return age;
}
public void setAge(Integer age) {
	this.age = age;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "UserEntity [userId=" + userId + ", name=" + name + ", email=" + email + ", age=" + age + ", salary="
			+ salary + "]";
}



}
