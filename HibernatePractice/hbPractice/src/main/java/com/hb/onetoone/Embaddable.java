package com.hb.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Embaddable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction t=session.beginTransaction();    
		
		Student s1 = new Student();
		s1.setId(12);
		Name name = new Name();
		name.setFname("DipS");
		name.setLname("Rock");
		s1.setName(name);
		
		session.persist(s1);    
        
		
	    t.commit();    
	    session.close();    
	    System.out.println("success");    
	}

}
