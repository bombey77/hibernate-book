package com.hibernate.motovilov.demo19_polymorphism_type;

import com.hibernate.motovilov.HibernateUtil;
import com.hibernate.motovilov.entity.Phone;
import com.hibernate.motovilov.entity.Watch;
import org.hibernate.Session;

public class Start {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Phone phone = new Phone();
        phone.setModel("Galaxy S22");
        session.save(phone);

        Watch watch = new Watch();
        watch.setSize(4);
        session.save(watch);

        // in case Phone = @Polymorphism(type = PolymorphismType.EXPLICIT)
        // result = 1
        // in case Phone = @Polymorphism(type = PolymorphismType.IMPLICIT)
        // result = 2
        System.out.println("result = " + session.createQuery("select g from com.hibernate.motovilov.entity.Gadget g").getResultList().size());

        session.getTransaction().commit();
        session.close();
    }
}
