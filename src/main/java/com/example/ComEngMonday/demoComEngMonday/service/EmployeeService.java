package com.example.ComEngMonday.demoComEngMonday.service;

import com.example.ComEngMonday.demoComEngMonday.model.Employee;

import java.util.List;

public interface EmployeeService {

    public Employee save(Employee E);
    public Employee getEmployeeById(String id);
    public List<Employee> getAllEmployees();

    public String deleteEmp(String id);


}
