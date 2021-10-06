package com.hibernate.motovilov.demo15_many_to_many;

import com.hibernate.motovilov.HibernateUtil;
import com.hibernate.motovilov.entity.Role5;
import com.hibernate.motovilov.entity.User5;
import org.hibernate.Session;

import java.util.Arrays;

// Bidirectional
public class Start {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Role5 adminRole = new Role5();
        adminRole.setRoleName("admin");

        Role5 userRole = new Role5();
        userRole.setRoleName("user");

        User5 user1 = new User5();
        user1.setUserName("roman");
        user1.setRoles(Arrays.asList(adminRole, userRole));

        User5 user2 = new User5();
        user2.setUserName("kathy");
        user2.setRoles(Arrays.asList(adminRole, userRole));

        adminRole.setUsers(Arrays.asList(user1, user2));
        userRole.setUsers(Arrays.asList(user1, user2));

        session.save(user1);
        session.save(user2);
        session.save(adminRole);
        session.save(userRole);

        session.getTransaction().commit();
        session.close();
    }
}
