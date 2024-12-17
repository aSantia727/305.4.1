

package com.test.hib.controller;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.test.hib.model.User; // Corrected import

public class CreateUserTable {
    public static void main(String[] args) {
        SessionFactory factory = null;
        Session session = null;
        Transaction t = null;
        try {
            factory = new Configuration().configure().buildSessionFactory();
            session = factory.openSession();
            t = session.beginTransaction();

            User uone = new User();

            t.commit();
            System.out.println("successfully created user table");
        } finally {
            if (session != null) {
                session.close();
            }
            if (factory != null) {
                factory.close();
            }
        }
    }
}