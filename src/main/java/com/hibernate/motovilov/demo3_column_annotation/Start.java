package com.hibernate.motovilov.demo3_column_annotation;

import com.hibernate.motovilov.HibernateUtil;
import com.hibernate.motovilov.entity.Material;
import org.hibernate.Session;


public class Start {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Material plastic = new Material();
        plastic.setType("plastic");

        session.save(plastic);
        session.getTransaction().commit();
        session.close();
    }
}
