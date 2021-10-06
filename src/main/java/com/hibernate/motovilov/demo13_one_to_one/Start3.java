package com.hibernate.motovilov.demo13_one_to_one;

import com.hibernate.motovilov.HibernateUtil;
import com.hibernate.motovilov.entity.Role3;
import com.hibernate.motovilov.entity.User3;
import org.hibernate.Session;

// C использованием таблицы отношений
public class Start3 {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Role3 role = new Role3();
        role.setRoleName("admin");

        User3 user = new User3();
        user.setUserName("roman");
        user.setRole(role);
        role.setUser(user);

        session.save(role);
        session.save(user);

        System.out.println(user.getRole().getRoleName()); // admin
        System.out.println(role.getUser().getUserName()); // roman

        session.getTransaction().commit();
        session.close();
    }
}
