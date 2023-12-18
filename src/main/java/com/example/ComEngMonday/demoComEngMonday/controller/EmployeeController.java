package com.example.ComEngMonday.demoComEngMonday.controller;

import com.example.ComEngMonday.demoComEngMonday.model.Employee;
import com.example.ComEngMonday.demoComEngMonday.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import javax.print.DocFlavor;
import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    @Qualifier("employeeMemImplemantation")
    EmployeeService employeeService;

   @PostMapping
   public Employee saveEmployee(@RequestBody Employee E){

      return employeeService.save(E);
  }

  @GetMapping
  public List<Employee> getEmployees(){
      return employeeService.getAllEmployees();
  }

  @GetMapping("/{id}")
  public Employee getEmployeeByID(@PathVariable(name = "id") String id){
       return employeeService.getEmployeeById(id);
  }

  @DeleteMapping("/{id}")
    public String deleteById(@PathVariable(name = "id") String id){
      return employeeService.deleteEmp(id);
  }
}
