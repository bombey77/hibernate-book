package com.hibernate.motovilov.demo13_one_to_one;

import com.hibernate.motovilov.HibernateUtil;
import com.hibernate.motovilov.entity.Role2;
import com.hibernate.motovilov.entity.User2;
import org.hibernate.Session;

// C использованием таблицы отношений
public class Start2 {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Role2 role = new Role2();
        role.setRoleName("admin");

        User2 user = new User2();
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
