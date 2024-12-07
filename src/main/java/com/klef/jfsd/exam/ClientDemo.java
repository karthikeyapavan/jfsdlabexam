package com.klef.jfsd.exam;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientDemo 
{
	public static void main(String args[])
	  {
		  Configuration cfg = new Configuration();
	  	  cfg.configure("hibernate.cfg.xml");
	  	
	  	  SessionFactory sf = cfg.buildSessionFactory();
	  	  Session session = sf.openSession();
	  	
	  	  Transaction t = session.beginTransaction();
	  	  
	  	  Vehicle v = new Vehicle();

	  	  v.setName("AUDI");
	  	  v.setType("TRUCK");
	  	  v.setMaxspeed(250);
	  	  v.setColor("Blue");
	  	  
	  	  Car c = new Car();
	  	  c.setNoofdoors(5);
	  	  
	  	  
	  	  Truck truck = new Truck();
	  	  truck.setLoadcapacity(210);
	  	  
	  	  session.persist(v);
	  	  session.persist(c);
	  	  session.persist(truck);
	  	 
	  	   t.commit();
	  	   System.out.println("SUCCESS....");
	  	
	  	 session.close();
	  	 sf.close();
	  }
}
