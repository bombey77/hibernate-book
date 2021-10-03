package com.hibernate.motovilov.demo8_updatetimestamp_annotation;

import com.hibernate.motovilov.HibernateUtil;
import com.hibernate.motovilov.entity.Rower;
import org.hibernate.Session;


public class Start {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Rower rower = new Rower();
        rower.setName("BMX");
        session.save(rower);

//        Rower rower = session.get(Rower.class, 1L);
//        rower.setName("mmm");
//        session.update(rower);
        session.getTransaction().commit();
        session.close();
    }
}
