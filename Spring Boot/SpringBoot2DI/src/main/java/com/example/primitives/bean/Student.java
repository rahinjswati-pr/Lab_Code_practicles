package com.example.primitives.bean;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("${Sid}")
	private int id;
	//@value("${Student.name}")
	private String name;
	//@value("${Student.per}")
	private float per;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPer() {
		return per;
	}
	public void setPer(float per) {
		this.per = per;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", per=" + per + "]";
	}
	
	

}
