package com.hibernate.motovilov.demo18_table_per_class;

import com.hibernate.motovilov.HibernateUtil;
import com.hibernate.motovilov.entity.Account2;
import com.hibernate.motovilov.entity.CreditAccount2;
import org.hibernate.Session;

import java.math.BigDecimal;

public class Start {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Account2 account = new Account2();
        account.setBalance(new BigDecimal(120));
        session.save(account);

        CreditAccount2 creditAccount = new CreditAccount2();
        creditAccount.setBalance(new BigDecimal(100));
        creditAccount.setCreditLimit(new BigDecimal(130));
        session.save(creditAccount);

        session.getTransaction().commit();
        session.close();
    }
}
