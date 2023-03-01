package com.example.springboot_app.service;

import com.example.springboot_app.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getEmployees();
    Employee getEmployeeById(int id);
    void addEmployee(Employee employee);
    void updateEmployee(Employee employee);
    void deleteEmployee(int id);

}