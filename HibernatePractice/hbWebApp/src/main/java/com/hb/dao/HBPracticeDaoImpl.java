package com.hb.dao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hb.model.Answer;
import com.hb.model.Contract_Employee;
import com.hb.model.Employee;
import com.hb.model.ListModel;
import com.hb.model.OOAddress;
import com.hb.model.OOEmp;
import com.hb.model.Question;
import com.hb.model.Regular_Employee;
import com.hb.model.TestingModel;

public class HBPracticeDaoImpl implements HBPracticeDao {

	Configuration cfg;
	SessionFactory factory;
	Session session;
	Transaction tx;

	/*
	 * public HBPracticeDaoImpl() { super(); // TODO Auto-generated constructor stub
	 * cfg = new Configuration(); cfg.configure("hbWebApp.cfg.xml"); factory =
	 * cfg.buildSessionFactory();
	 * 
	 * session = factory.openSession(); tx = session.beginTransaction(); }
	 */

	public boolean storeData(String name) {
		// TODO Auto-generated method stub
		TestingModel test = new TestingModel();
		test.setName(name);

		session.save(test);

		tx.commit();

		return false;
	}

	public boolean employee(String name) {
		// TODO Auto-generated method stub
		System.out.println("In Employee Dao :)");
		Configuration cfg = new Configuration();
		cfg.configure("hbWebApp.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Employee emp = new Employee();
		emp.setName(name);

		session.persist(emp);
		tx.commit();
		session.close();
		System.out.println(emp);
		return false;
	}

	public boolean regularEmployee(String name, String salary, String bonus) {
		// TODO Auto-generated method stub

		System.out.println("In Regular Employee Dao :)");
		Configuration cfg = new Configuration();
		cfg.configure("hbWebApp.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		// Employee emp = new Employee();

		Regular_Employee remp = new Regular_Employee();
		remp.setName(name);
		remp.setSalary(Float.parseFloat(salary));
		remp.setBonus(Integer.parseInt(bonus));

		// session.persist(emp);
		session.persist(remp);
		tx.commit();
		session.close();
		// System.out.println(emp);
		System.out.println(remp);
		return false;
	}

	public boolean contractEmployee(String name, String pay_per_hour, String contract_period) {
		// TODO Auto-generated method stub
		System.out.println("In Contract Employee Dao :)");
		Configuration cfg = new Configuration();
		cfg.configure("hbWebApp.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		// Employee emp = new Employee();

		Contract_Employee cemp = new Contract_Employee();
		cemp.setName(name);
		cemp.setPay_per_hour(Float.parseFloat(pay_per_hour));
		cemp.setContract_duration(contract_period);

		// session.persist(emp);
		session.persist(cemp);
		tx.commit();
		session.close();
		// System.out.println(emp);
		System.out.println(cemp);
		return false;
	}

	public boolean listDataStored(String question, String[] answer) {
		// TODO Auto-generated method stub

		ListModel lm = new ListModel();
		lm.setQuestion(question);

		// List<String> ls = new ArrayList<String>();
		HashSet<String> ls = new HashSet<String>();
		// HashMap<String, String> ls = new HashMap<String,String>();
		for (int i = 0; i < answer.length; i++) {
			if (answer[i] != "") {
				ls.add(answer[i]);
				// ls.put(question,answer[i]);
			}
		}
		System.out.println(ls);
		lm.setAnswer(ls);
		// ListModel lm = new ListModel(question,ls);
		session.save(lm);
		tx.commit();
		session.close();
		System.out.println(lm);
		return false;
	}

	public boolean oneToMany(String question, String[] answer) {
		// TODO Auto-generated method stub

		Configuration cfg = new Configuration();
		cfg.configure("hbWebApp.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();
		tx = session.beginTransaction();

		System.out.println("In OneToMany Dao Impl");
		Answer ans = new Answer();
		Answer ans1 = new Answer();
		// ans.setAnswername(answer);

		for (int i = 0; i < answer.length; i++) {

			if (answer[i] != "") {
				if (i == 0)
					ans.setAnswername(answer[i]);
				else
					ans1.setAnswername(answer[i]);

			}

		}
		System.out.println("and pojo" + ans);
		List<Answer> ls = new ArrayList<Answer>();

		ls.add(ans);
		ls.add(ans1);

		Question q = new Question();
		q.setQuestion(question);
		q.setAnswers(ls);

		session.save(q);
		session.save(ans);
		session.save(ans1);
		tx.commit();
		session.close();
		System.out.println(q);
		return false;
	}

	public boolean ooStoredData(String name, String address) {
		// TODO Auto-generated method stub
		System.out.println("In ooStoredeData Dao Impl");

		Configuration cfg = new Configuration();
		cfg.configure("/hbWebApp.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();
		tx = session.beginTransaction();

		OOEmp emp = new OOEmp();
		emp.setName(name);

		OOAddress add = new OOAddress();
		add.setAddress(address);

		emp.setAddress(add);
		add.setEmp(emp);

		session.save(emp);
		session.save(add);

		tx.commit();

		session.close();
		return false;
	}

	public List<List<Object>> displayData(OOEmp emp,OOAddress add) {
		// TODO Auto-generated method stub
		
		Configuration cfg = new Configuration();
		cfg.configure("hbWebApp.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();
		TypedQuery query=session.createQuery("from OOEmp e");
		
		List<OOEmp> list = query.getResultList();
		
		Iterator<OOEmp> itr = list.iterator();
		List<List<Object>> data = new ArrayList<List<Object>>();
 		while(itr.hasNext()) {
 			emp = itr.next();
			List<Object> result = new ArrayList<Object>();
			result.add(0,emp.getId());
			result.add(1,emp.getName());
			add = emp.getAddress();
			result.add(2,add.getAddress());
			data.add(result);
		}
 		session.close();
		return data;
	}

	public List<List<Object>> displayDataOM(Question q, Answer ans) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("hbWebApp.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();
		TypedQuery query=session.createQuery("from Question");
		
		List<Question> list = query.getResultList();
		
		Iterator<Question> itr = list.iterator();
		List<List<Object>> data = new ArrayList<List<Object>>();
 		while(itr.hasNext()) {
 			q = itr.next();
			List<Object> result = new ArrayList<Object>();
			result.add(0,q.getId());
			result.add(1,q.getQuestion());
			
			List<Answer> list2 = q.getAnswers();
			
			Iterator<Answer> itr2 = list2.iterator();
			
			while(itr2.hasNext()) {
				ans = itr2.next();
				List<Object> res = new ArrayList<Object>();
				res.add(0,ans.getAnswername());
			}
			result.add(2,list2);
			data.add(result);
		}
 		session.close();
		return data;

	}

}
