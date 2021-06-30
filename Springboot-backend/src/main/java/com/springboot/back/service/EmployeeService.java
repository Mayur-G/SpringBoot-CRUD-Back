package com.springboot.back.service;

import java.util.List;

import com.springboot.back.model.Employee;

public interface EmployeeService {
Employee saveEmployee(Employee employee);
List<Employee> getAllEmployees();
Employee getEmployeeById(long id);
Employee updateEmployee(Employee employee,long id);
void deleteEmployee(long id);
}
