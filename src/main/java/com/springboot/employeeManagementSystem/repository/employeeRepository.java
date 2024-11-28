package com.springboot.employeeManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.employeeManagementSystem.model.Employee;

@Repository
public interface employeeRepository extends JpaRepository<Employee, Long> {

}
