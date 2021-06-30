package com.springboot.back.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.back.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
