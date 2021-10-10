package com.hibernate.motovilov.demo16_inheritance_mapped_super_class;

import com.hibernate.motovilov.HibernateUtil;
import com.hibernate.motovilov.entity.CreditAccount;
import org.hibernate.Session;

import java.math.BigDecimal;

public class Start {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        CreditAccount creditAccount = new CreditAccount();
        creditAccount.setBalance(new BigDecimal(120));
        creditAccount.setCreditLimit(new BigDecimal(100));

        session.save(creditAccount);

        session.getTransaction().commit();
        session.close();
    }
}
