package com.hibernate.motovilov.demo13_one_to_one;

import com.hibernate.motovilov.HibernateUtil;
import com.hibernate.motovilov.entity.Role1;
import com.hibernate.motovilov.entity.User1;
import org.hibernate.Session;

// С использованием общих первичных ключей
public class Start1 {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Role1 role = new Role1();
        role.setRoleName("admin");

        User1 user = new User1();
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
