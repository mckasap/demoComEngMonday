package com.example.ComEngMonday.demoComEngMonday.service;

import com.example.ComEngMonday.demoComEngMonday.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeMemImplemantation implements EmployeeService {
    List<Employee> empList = new ArrayList<>();

    @Override
    public Employee save(Employee E) {
        if (E.getId() == null) {
            E.setId(UUID.randomUUID().toString());
        }
        empList.add(E);
        return E;
    }

    @Override
    public Employee getEmployeeById(String id) {
        Employee E = new Employee();
        for (Employee E1 : empList) {
            if (E1.getId().equals(id)) {
                E = E1;
                break;
            }
        }
        return E;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return empList;
    }

    @Override
    public String deleteEmp(String id) {
        Employee E = new Employee();

        for (Employee E1 : empList) {
            if (E1.getId().equals(id)) {
                E = E1;
                break;
            }
        }

            if (!E.getId().equals(null))
            {
                empList.remove(E);
                return " Employee with id " + id + "is deleted";
            }
            else
                return "No employee with id " + id + "is found";

    }
}