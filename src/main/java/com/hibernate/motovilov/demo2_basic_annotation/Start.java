package com.hibernate.motovilov.demo2_basic_annotation;

import com.hibernate.motovilov.HibernateUtil;
import com.hibernate.motovilov.entity.Figure;
import org.hibernate.Session;


public class Start {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Figure circle = new Figure();
        circle.setType("circle");

        session.save(circle);
        session.getTransaction().commit();
        session.close();
    }
}
