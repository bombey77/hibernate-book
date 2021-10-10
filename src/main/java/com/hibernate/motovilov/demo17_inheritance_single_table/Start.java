package com.hibernate.motovilov.demo17_inheritance_single_table;

import com.hibernate.motovilov.HibernateUtil;
import com.hibernate.motovilov.entity.CreditAccount1;
import org.hibernate.Session;

import java.math.BigDecimal;

public class Start {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        CreditAccount1 creditAccount = new CreditAccount1();
        creditAccount.setBalance(new BigDecimal(120));
        creditAccount.setCreditLimit(new BigDecimal(100));

        session.save(creditAccount);

        session.getTransaction().commit();
        session.close();
    }
}
