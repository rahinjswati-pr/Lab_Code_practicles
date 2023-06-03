package com.bean;

import java.io.BufferedReader;


import java.io.IOException;
import java.io.InputStreamReader;



public class MainApplication {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int ch,i;
		String bn,an;
		float p;
		Book b;
		do
		{
			System.out.println("1:Insert\2:update\nEnter your choice:");
			ch=Integer.parseInt(br.readLine());
			
			
			switch(ch)
			{
			case 1://Insert
				System.out.println("Enter book details:\nBook name,author name,price");
				b=new Book();
				b.setBname(br.readLine());
				b.setBname(br.readLine());
				b.setBprice(Float.parseFloat(br.readLine()));
				
				i=BookDao.insertBook(b);
				if(i>0);
				{
					System.out.println("Record added succesfully....");
				}
				
				{
					System.out.println("Try again!!!");
				}
				break;
				
			case 2://update
				System.out.println("Enter Book details:\nBook name,price==>");
				b=new Book();
				bn=br.readLine();
				p=Float.parseFloat(br.readLine());
				i=BookDao.updateBook(bn, p);
				if(i>0)
				{
					System.out.println("Records update succesfully...");
					
				}
				else
				{
					System.out.println("Try again!!!");
				}
				break;
				
				default:
					System.out.println("Please Enter Proper choice 1/2");
			}
		}
		while(true);
	}
}
