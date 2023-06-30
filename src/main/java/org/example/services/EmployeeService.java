package org.example.services;

import org.example.entities.Employee;

import java.util.List;
public interface EmployeeService {

    List<Employee> findAll();
}
