package com.example.demo.repositories;

import com.example.demo.models.Employee;

import java.util.List;

public class EmployeeRepository implements IRepository<Employee> {


    @Override
    public List<Employee> getAllEntities() {
        return null;
    }

    @Override
    public Employee getSingleById(int id) {
        return null;
    }

    @Override
    public boolean create(Employee entity) {
        return false;
    }
}
