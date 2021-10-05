package com.hibernate.motovilov.demo9_id_class_annotation;

import com.hibernate.motovilov.HibernateUtil;
import com.hibernate.motovilov.entity.Currency;
import com.hibernate.motovilov.entity.CurrencyId;
import org.hibernate.Session;


public class Start {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Currency dollar = new Currency("United States", "dollar", 28);
        session.save(dollar);

        Currency dol = session.find(Currency.class, new CurrencyId("United States", "dollar"));
        System.out.println(dol.getCurrency()); // United States
        System.out.println(dol.getSign()); // dollar
        System.out.println(dol.getValue()); // 28

        session.getTransaction().commit();
        session.close();
    }
}
