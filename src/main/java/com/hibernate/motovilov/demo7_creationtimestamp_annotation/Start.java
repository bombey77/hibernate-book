package com.hibernate.motovilov.demo7_creationtimestamp_annotation;

import com.hibernate.motovilov.HibernateUtil;
import com.hibernate.motovilov.entity.Bicycle;
import org.hibernate.Session;


public class Start {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Bicycle rower = new Bicycle();

        session.save(rower);
        session.getTransaction().commit();
        session.close();
    }
}
