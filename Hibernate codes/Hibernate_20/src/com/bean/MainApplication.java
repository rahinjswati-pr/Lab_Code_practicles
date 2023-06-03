package com.bean;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class MainApplication {

	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Employee Details\nName,Designation,Salary::");
		
		String n=br.readLine();
		String d=br.readLine();
		float s=Float.parseFloat(br.readLine());
		
		Employee e1=new Employee();
		e1.setName(n);
		e1.setDesig(d);
		e1.setSalary(s);
		
		System.out.println("Employee class=>"+e1);
		Configuration cf=new AnnotationConfiguration().configure();
		SessionFactory sf=cf.buildSessionFactory();
		
		Session s2=sf.openSession();
		Transaction t1=s2.beginTransaction();
		
		int i=(int)s2.save(e1);
		if(i>0)
		{
			t1.commit();
			System.out.println("Done succesfully!!!!");
		}
		else
		{
			System.out.println("Try again!!!");
		}
	}

}
