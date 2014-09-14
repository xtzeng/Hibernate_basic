package com.immutable.alias.hibernate;


import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.immutable.alias.constant.Gender;
import com.immutable.alias.model.Student;
import com.immutable.alias.model.Teacher;
import com.immutable.alias.util.HibernateUtil;

public class HibernateTest {

	private static SessionFactory sessionFactory;
	
	@SuppressWarnings("deprecation")
	@BeforeClass
	public static void beforClass() {
		sessionFactory = new Configuration().configure().buildSessionFactory();
	}
	
	@AfterClass
	public static void afterClass() {
		sessionFactory.close();
	}
	
   @Test
   public void testNormal() {
	   
	   	Student s = new Student();
		s.setName("zhangsan_basic");
		s.setAge(28);
		s.setLastUpdateTime(new Date());
		
	   Session session = sessionFactory.getCurrentSession();
	   session.beginTransaction();
	   session.save(s);
	   session.getTransaction().commit();
	
   }

   
   @Test
   public void testAnnotation() {
	  
		for(int i=0;i<=100;i++) {
		  	Teacher teacher = new Teacher();
		   	teacher.setName("lili");
		   	teacher.setTitle("professor");
		   	teacher.setGood(true);
		   	teacher.setGender(Gender.FEMALE);
		   	teacher.setLastUpdateTime(new Date());
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			session.save(teacher);
			session.getTransaction().commit();
		}
	 
   }
	
}
