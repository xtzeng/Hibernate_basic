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
import com.immutable.alias.model.StudentPK;
import com.immutable.alias.model.Teacher;
import com.immutable.alias.model.TeacherPK;
import com.immutable.alias.util.HibernateUtil;

public class HibernateIDTest {

	private static SessionFactory sessionFactory;
	
	@SuppressWarnings("deprecation")
	@BeforeClass
	public static void beforeClass() {
		sessionFactory = new Configuration().configure().buildSessionFactory();
	}
	
	@AfterClass
	public static void afterClass() {
		sessionFactory.close();
	}
	

	@Test
	public void testStudentSave() {
		StudentPK pk = new StudentPK();
		pk.setId(1);
		pk.setName("zhangsan");
		Student s = new Student();
		s.setPk(pk);
		s.setAge(8);
		s.setLastUpdateTime(new Date());
		s.setGood(true);
		
		
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.save(s);
		session.getTransaction().commit();
	}
	
	@Test
	public void testTeacherSave() {
	
/*		TeacherPK pk = new TeacherPK();
		pk.setId(1);
		pk.setName("helloTeacher");*/
		Teacher t = new Teacher();
//		t.setPk(pk);
//		t.setId(2);
		t.setName("lisa");
		t.setLength("5 fitch");
		t.setTitle("middle");
		t.setLastUpdateTime(new Date());
		t.setYourWifeName("小三");
		t.setLength("5 fitch");
		t.setGender(Gender.FEMALE);
		
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.save(t);
		session.getTransaction().commit();
	}
	
	public static void main(String[] args) {
		beforeClass();
	}

	
}
