package com.bean;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class MainApplication {

	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter book details:\nBook name,author name,price");
		String bn=br.readLine();
		String an=br.readLine();
		float bp=Float.parseFloat(br.readLine());
		
		Book b=new Book();
		b.setBook_name(bn);
		b.setAuthor_name(an);
		b.setPrice(bp);
		
		Configuration cf=new AnnotationConfiguration().configure();
	}

}
