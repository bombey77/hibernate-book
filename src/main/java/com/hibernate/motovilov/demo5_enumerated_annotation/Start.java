package com.hibernate.motovilov.demo5_enumerated_annotation;

import com.hibernate.motovilov.HibernateUtil;
import com.hibernate.motovilov.entity.IceCream;
import com.hibernate.motovilov.entity.Size;
import org.hibernate.Session;


public class Start {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        IceCream plombir = new IceCream();
        plombir.setSize(Size.SMALL);

        session.save(plombir);
        session.getTransaction().commit();
        session.close();
    }
}
