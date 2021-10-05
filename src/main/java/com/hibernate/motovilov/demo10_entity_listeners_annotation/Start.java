package com.hibernate.motovilov.demo10_entity_listeners_annotation;

import com.hibernate.motovilov.HibernateUtil;
import com.hibernate.motovilov.entity.User;
import org.hibernate.Session;


public class Start {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        User user = new User();
        user.setName("roman");
        user.setEmail("test@gmail.com");
        session.save(user);

        System.out.println(session.contains(user));

        session.getTransaction().commit();
        session.close();
    }
}
