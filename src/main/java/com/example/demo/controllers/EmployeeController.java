package com.example.demo.controllers;

import com.example.demo.models.Employee;
import com.example.demo.repositories.EmployeeRepository;
import com.example.demo.repositories.IRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {
    private final IRepository<Employee> employeeIRepository = new EmployeeRepository();
    @GetMapping("/employee")
    public String showEmployees(Model model){
        employeeIRepository.getAllEntities();
        return "employee";
    }
}
