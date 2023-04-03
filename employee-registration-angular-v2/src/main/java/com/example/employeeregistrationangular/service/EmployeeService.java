package com.example.employeeregistrationangular.service;

import com.example.employeeregistrationangular.model.Employee;
import com.example.employeeregistrationangular.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    // POST Mapping -- > ALL OK
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    // GET Mapping -- All Records --> ALL OK
    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    // GET Mapping -- Single Record --> ALL OK
    public Employee getEmployeeByEmail(String email) {
        return employeeRepository.findByEmail(email);
    }

    // Delete Mapping --> ALL OK
    public String deleteEmployeeById(int id) {
        employeeRepository.deleteById(id);
        return "Employee Deletion Successful";
    }
}
