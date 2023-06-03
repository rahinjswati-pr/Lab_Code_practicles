package com.bean;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MainApplication {

	public static void main(String[] args) {
		Session s=new AnnotationConfiguration().configure().buildSessionFactory().openSession();
		Transaction t=s.beginTransaction();
		
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter team count::");
		int tno=Integer.parseInt(b.readLine());
		for(int j=0;j<tno;j++)
		{
			System.out.println("Enter team Details::team name,owner name==>");
			String tn=b.readLine();
			String on=b.readLine();
			System.out.println("Enter player count??");
			int pn=Integer.parseInt(b.readLine());
			Map<String,Player>m=new HashMap<>();
			
			for(int k=0;k<pn;k++)
			{
				System.out.println("Enter player Details::name,jersey number,cost,countryname==>");
				String n=b.readLine();
				int jno=Integer.parseInt(b.readLine());
				float c=Float.parseFloat(b.readLine());
				String cn=b.readLine();
				
				Player p=new Player();
				p.setjno(jno);
				p.setPlayerName(n);
				p.setPlayer_sold_value(c);
				m.put(cn, p);
				
				IPL_Team ipl=new IPL_Team();
				ipl.setTeamName(tn);
				ipl.setOwnerName(on);
				ipl.setPlayer(m);
				
				s.save(ipl);
				t.commit();
			}
		}
	}

}
