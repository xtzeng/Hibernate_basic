package com.xiaoti.hibernate;

import static org.junit.Assert.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import com.xiaoti.model.Student;
import com.xiaoti.model.Teacher;
import com.xiaoti.util.HibernateUtil;

public class HibernateTest {

   @Test
   public void testNormal() {
	   
	   	Student s = new Student();
		s.setName("zhangsan");
		s.setAge(8);
		
	   SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	   Session session = sessionFactory.getCurrentSession();
	   session.beginTransaction();
	   session.save(s);
	   session.getTransaction().commit();
	
   }

   @Test
   public void testAnnotation() {
	  
		
	   	Teacher teacher = new Teacher();
	   	teacher.setName("lili");
	   	teacher.setTitle("professor");
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.save(teacher);
		session.getTransaction().commit();
   }
	
}
