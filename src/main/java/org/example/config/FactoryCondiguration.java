package org.example.config;

import org.example.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class FactoryCondiguration {
    private static FactoryCondiguration factoryCondiguration;
    private SessionFactory sessionFactory;

    private FactoryCondiguration(){
        Configuration configuration=new Configuration().configure().addAnnotatedClass(Student.class);
        sessionFactory=configuration.buildSessionFactory();
    }

    public static FactoryCondiguration getInstance(){
       return (factoryCondiguration==null)?factoryCondiguration=
               new FactoryCondiguration():factoryCondiguration;
    }
    public Session getSession(){
        return sessionFactory.openSession();
    }
}
