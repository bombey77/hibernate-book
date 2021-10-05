package com.hibernate.motovilov.demo11_embeddable;

import com.hibernate.motovilov.HibernateUtil;
import com.hibernate.motovilov.entity.Tire;
import com.hibernate.motovilov.entity.Wheel;
import org.hibernate.Session;


public class Start {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Wheel wheel = new Wheel();
        wheel.setModel("buggy");
        wheel.setCalibre(19);
        Tire tire = new Tire();
        tire.setMaterial("caoutchouc");
        tire.setType("drug");
        wheel.setTire(tire);

        session.save(wheel);
        session.getTransaction().commit();
        session.close();
    }
}
