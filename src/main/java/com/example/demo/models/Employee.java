package com.example.demo.models;

public class Employee {
    private int id;
    private String name;
    private String job;
    private int manager;
    private String hireDate;
    private int salary;
    private int commission;
    private int departmentNr;

    public Employee(int id, String name, String job, int manager, String hireDate, int salary, int commission, int departmentNr) {
        this.id = id;
        this.name = name;
        this.job = job;
        this.manager = manager;
        this.hireDate = hireDate;
        this.salary = salary;
        this.commission = commission;
        this.departmentNr = departmentNr;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public int getManager() {
        return manager;
    }

    public String getHireDate() {
        return hireDate;
    }

    public int getSalary() {
        return salary;
    }

    public int getCommission() {
        return commission;
    }

    public int getDepartmentNr() {
        return departmentNr;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setManager(int manager) {
        this.manager = manager;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setCommission(int commission) {
        this.commission = commission;
    }

    public void setDepartmentNr(int departmentNr) {
        this.departmentNr = departmentNr;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", manager=" + manager +
                ", hireDate=" + hireDate +
                ", salary=" + salary +
                ", commission=" + commission +
                ", departmentNr=" + departmentNr +
                '}';
    }
}
