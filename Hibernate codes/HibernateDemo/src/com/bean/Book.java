package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.*;

@Entity
@Table
public class Book {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int bid;
	@Column(name="Book_Name")
private String bname;
	@Column(name="Author_Name")
	private String aname;
	@Column(name="Book_Price")
private float bprice;

//getters and setters

public int getBid() {
	return bid;
}
public void setBid(int bid) {
	this.bid = bid;
}
public String getBname() {
	return bname;
}
public void setBname(String bname) {
	this.bname = bname;
}
public float getBprice() {
	return bprice;
}
public void setBprice(float bprice) {
	this.bprice = bprice;
}

	
}
