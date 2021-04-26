package org.perscholas;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.perscholas.models.Employee;
import org.perscholas.services.EmployeeServices;
import org.perscholas.util.HibernateUtil;

import java.util.List;

public class MainRunner {
    public static SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    public static void main(String[] args) {

        Session session = sessionFactory.openSession();
        EmployeeServices es = new EmployeeServices();

        List<Employee> emp = es.getAllEmployees();

        for(Employee e: emp){
            System.out.println(e);
        }

    }
}

