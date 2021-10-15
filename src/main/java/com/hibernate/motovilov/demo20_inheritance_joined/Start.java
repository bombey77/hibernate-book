package com.hibernate.motovilov.demo20_inheritance_joined;

import com.hibernate.motovilov.HibernateUtil;
import com.hibernate.motovilov.entity.Instructor;
import com.hibernate.motovilov.entity.Student;
import org.hibernate.Session;

public class Start {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		Student tempStudent = new Student("Mary", "Public", "mary@gmail.com", "Hibernate");
		Instructor tempInstructor = new Instructor("John", "Doe", "john@gmail.com", 20000.00);

		session.save(tempStudent);
		session.save(tempInstructor);

		session.getTransaction().commit();
		session.close();
	}
}
