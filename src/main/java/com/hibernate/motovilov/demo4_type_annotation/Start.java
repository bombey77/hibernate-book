package com.hibernate.motovilov.demo4_type_annotation;

import com.hibernate.motovilov.HibernateUtil;
import com.hibernate.motovilov.entity.Price;
import org.hibernate.Session;


public class Start {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Price price = new Price();
        price.setCheap(true);

        session.save(price);
        session.getTransaction().commit();
        session.close();
    }
}
