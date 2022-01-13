package com.Tanmay;


import com.Tanmay.Entity.Student;
import lombok.Data;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

@Data
public class CrudApp {
    public static void main(String[] args) {
        Student stud1 = new Student();
        stud1.setStudId(1);
        stud1.setName("Tanmay Sahoo");

        //configuration object reads configuration file
        // via configure method and return session factory instance
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();

        session.beginTransaction();
        session.save(stud1);
        session.getTransaction().commit();

    }
}
