package com.accenture.springboot.demo.cruddemo.DAO;

import java.util.List;

import com.accenture.springboot.demo.cruddemo.entitiy.Employee;

public interface EmployeeDAO {

	List<Employee> findAll();
	Employee findById(int theId);
	void save(Employee employee);
	void deleteEmployeeById(int id);
}
