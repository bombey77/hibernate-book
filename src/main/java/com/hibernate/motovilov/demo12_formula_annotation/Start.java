package com.hibernate.motovilov.demo12_formula_annotation;

import com.hibernate.motovilov.HibernateUtil;
import com.hibernate.motovilov.entity.Shape;
import org.hibernate.Session;


public class Start {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Shape rectangle = new Shape();
        rectangle.setX(2);
        rectangle.setY(3);
        session.save(rectangle);
        session.getTransaction().commit();
        session.refresh(rectangle);

        Shape dbRectangle = session.find(Shape.class, 1L);
        System.out.println(dbRectangle); // result = 6

        session.close();
    }
}
