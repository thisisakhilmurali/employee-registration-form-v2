package com.example.employeeregistrationangular.controller;

import com.example.employeeregistrationangular.model.Employee;
import com.example.employeeregistrationangular.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp/registration")
@CrossOrigin("*")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/addemp")
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.createEmployee(employee);
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployee() {
        return employeeService.getEmployees();
    }

    @GetMapping("/employees/{email}")
    public Employee getEmployeeByEmailId(@PathVariable String email) {
        return employeeService.getEmployeeByEmail(email);
    }

    @DeleteMapping("/deleteemployee/{id}")
    public String deleteEmployee(@PathVariable int id) {
        return employeeService.deleteEmployeeById(id);
    }
}
