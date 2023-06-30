package org.example.beans.daos.employees;

import org.example.entities.Employee;
import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
}
