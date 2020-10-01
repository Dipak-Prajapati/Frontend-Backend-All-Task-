package com.hb.hbPractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.query.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws IOException {
		System.out.println("Hello World!");

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		/*
		 * System.out.println(factory); System.out.println(factory.isClosed());
		 * 
		 * StudentModel stdModel = new StudentModel(); stdModel.setStdId(7);
		 * stdModel.setFirstName("shreyansh"); stdModel.setLastName("soni");
		 * System.out.println(stdModel);
		 * 
		 * AddressModel ad = new AddressModel(); ad.setStreet("street22");
		 * ad.setCity("city12"); ad.setOpen(true); ad.setAddedDate(new Date());
		 * ad.setX(123.321);
		 * 
		 * System.out.println(ad);
		 * 
		 * FileInputStream fs = new FileInputStream("src/main/java/dips.jpg"); byte[]
		 * data = new byte[fs.available()]; fs.read(data); ad.setImage(data);
		 * fs.close();
		 * 
		 * 
		 * Transaction tx = session.beginTransaction();
		 * 
		 * session.save(stdModel); session.save(ad); tx.commit();
		 */

		// get() And load() permutation

		/*
		 * StudentModel sm = (StudentModel)session.get(StudentModel.class, 4);
		 * System.out.println(sm.getFirstName());
		 */

		/*
		 * AddressModel am = (AddressModel)session.load(AddressModel.class, 3);
		 * System.out.println(am.getCity());
		 */

		/*
		 * AddressModel am = (AddressModel)session.load(AddressModel.class, 55);
		 * System.out.println(am.getCity());
		 */

		/*
		 * AddressModel am = (AddressModel)session.get(AddressModel.class, 55);
		 * System.out.println(am.getCity());
		 */

		// HQL

		// Example of HQL to get all the records
		/*
		 * String hql = "from StudentModel"; Query query = session.createQuery(hql);
		 * List<StudentModel> results = query.list();
		 * 
		 * for (StudentModel sm : results) { System.out.println(sm.getStdId() + ":" +
		 * sm.getFirstName() + ":" + sm.getLastName()); }
		 */

		// Example of HQL to get records with pagination

		/*
		 * String hql = "from StudentModel"; Query query = session.createQuery(hql);
		 * query.setFirstResult(3); query.setMaxResults(1); List<StudentModel> results =
		 * query.list();
		 * 
		 * for (StudentModel sm : results) { System.out.println(sm.getFirstName()); }
		 */

		// Example of HQL update query

		/*
		 * Transaction tx = session.beginTransaction(); String hql =
		 * "update StudentModel set lastName=:name where stdId=:id"; Query query =
		 * session.createQuery(hql); query.setParameter("name", "Rock");
		 * query.setParameter("id", 4); int status = query.executeUpdate();
		 * System.out.println(status); tx.commit();
		 */

		// Example of HQL insert query
		/*
		 * Transaction tx = session.beginTransaction(); String hql =
		 * "insert into StudentModel(id,firstName,lastName)"
		 * +"select id,city,street from AddressModel"; Query query =
		 * session.createQuery(hql); int status = query.executeUpdate();
		 * System.out.println(status); tx.commit();
		 */

		// Example of HQL delete query
		/*
		 * Transaction tx = session.beginTransaction(); String hql =
		 * "delete from StudentModel where stdId=3"; Query query =
		 * session.createQuery(hql); int status = query.executeUpdate();
		 * System.out.println(status); tx.commit();
		 */

		// HQL with Aggregate functions

		// sum
		/*
		 * String hql = "SELECT sum(id) FROM StudentModel"; Query query =
		 * session.createQuery(hql); List<Integer> results = query.list();
		 * System.out.println(results.get(0));
		 */

		// Max
		/*
		 * String hql = "SELECT max(id) FROM StudentModel"; Query query =
		 * session.createQuery(hql); List<Integer> results = query.list();
		 * System.out.println(results.get(0));
		 */

		// Min
		/*
		 * String hql = "SELECT min(id) FROM StudentModel"; Query query =
		 * session.createQuery(hql); List<Integer> results = query.list();
		 * System.out.println(results.get(0));
		 */

		// Count
		/*
		 * String hql = "SELECT count(id) FROM StudentModel"; Query query =
		 * session.createQuery(hql); List<Integer> results = query.list();
		 * System.out.println(results.get(0));
		 */

		// Average
		/*
		 * String hql = "SELECT avg(id) FROM StudentModel"; Query query =
		 * session.createQuery(hql); List<Integer> results = query.list();
		 * System.out.println(results.get(0));
		 */

		// HQL Criteria
		/*
		 * Criteria cr = session.createCriteria(StudentModel.class); List results =
		 * cr.list(); System.out.println(results);
		 */

		//Criteria cr = session.createCriteria(StudentModel.class);

		// To get records having id more than 5
		/*
		 * cr.add(Restrictions.gt("stdId", 5)); List results = cr.list();
		 * System.out.println(results);
		 */
		// To get records having id less than 5
		/*
		 * cr.add(Restrictions.lt("stdId", 5)); List results1 = cr.list();
		 * System.out.println(results1);
		 */

		// To get records having fistName starting with Dip

		/*
		 * cr.add(Restrictions.like("firstName", "%I%")); List results1 = cr.list();
		 * System.out.println(results1);
		 */

		// Case sensitive form of the above restriction.
		/*
		 * cr.add(Restrictions.ilike("firstName", "%I%")); List results1 = cr.list();
		 * System.out.println(results1);
		 */
		// To get records having salary in between 1000 and 2000
		/*
		 * cr.add(Restrictions.between("stdId", 1, 5)); List results = cr.list();
		 * System.out.println(results);
		 */
		
		/*
		 * cr.setFirstResult(2); cr.setMaxResults(2);
		 */
		
		
		/* cr.addOrder(Order.asc("stdId")); */
		/* cr.addOrder(Order.desc("stdId")); */
		/*
		 * cr.setProjection(Projections.property("firstName")); List result = cr.list();
		 * System.out.println(result);
		 */
		
		
		//Named Queries 
		/*
		 * Query query = session.getNamedQuery("lname");
		 * //query.setParameter("firstName", "Dips"); query.setParameter("lastName",
		 * "prajapati"); List rs = query.list(); System.out.println(rs);
		 */
		
		String sq = "select * from studentmodel";
		
		NativeQuery sqlQuery = session.createSQLQuery(sq);
		
		List<Object[]> rs =sqlQuery.list();
		
		for(Object[] ob : rs)
		{
			System.out.println(Arrays.toString(ob));			
		}

		//Testing Second Level Cache
		StudentModel studentModel = session.get(StudentModel.class, 4);
		System.out.println(studentModel);
		
		
		session.close();
		
		//Testing Second Level Cache
		Session session1 = factory.openSession();
		StudentModel studentModel1 = session1.get(StudentModel.class, 4);
		System.out.println(studentModel1);
		
		session1.close();
		
		factory.close();

	}
}
