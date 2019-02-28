package com.accenture.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.springboot.demo.cruddemo.DAO.EmployeeDAO;
import com.accenture.springboot.demo.cruddemo.entitiy.Employee;

@RestController
//@RequestMapping("/api")
public class controller {

	private EmployeeDAO dao;
	
	@Autowired
	public controller(EmployeeDAO dao) {
		super();
		this.dao = dao;
	}

	@GetMapping("/list")
	public List<Employee> listofemployee() {
		List<Employee> list = dao.findAll();
		return list;
	}
	
	@PostMapping("/update/{employee}")
	public Employee update(@RequestBody Employee employee)
	{
		dao.save(employee);
		return employee;
	}
	
	@DeleteMapping("/update/{id}")
	public void delete(@PathVariable int id)
	{
		dao.deleteEmployeeById(id);
		
	}
}
