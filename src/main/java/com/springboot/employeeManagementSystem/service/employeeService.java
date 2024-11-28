package com.springboot.employeeManagementSystem.service;

import java.util.List;

import com.springboot.employeeManagementSystem.model.Employee;

public interface employeeService {

	List<Employee> getAllEmployees();
	void saveEmployee(Employee employee);
	Employee getEmployeeById(long id);
	void deleteEmployeeById(long id);
}
 