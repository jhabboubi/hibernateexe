package org.perscholas.services;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.perscholas.MainRunner;
import org.perscholas.dao.IEmployee;
import org.perscholas.models.Employee;

import java.util.List;

public class EmployeeServices implements IEmployee {
    @Override
    public List<Employee> getAllEmployees() {
        Session session = MainRunner.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        List<Employee> emp = session.createQuery("from Employee").list();

        tx.commit();

        session.close();
        return emp;
    }

    @Override
    public void createEmployee(Employee e) {

    }

    @Override
    public void updateEmployee(Employee e) {

    }

    @Override
    public void deleteEmployee(int id) {

    }
}
