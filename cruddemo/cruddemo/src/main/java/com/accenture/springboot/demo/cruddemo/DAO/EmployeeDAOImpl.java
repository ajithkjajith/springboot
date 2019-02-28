package com.accenture.springboot.demo.cruddemo.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.accenture.springboot.demo.cruddemo.entitiy.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	
	private EntityManager entityManager;
	@Autowired
	public EmployeeDAOImpl(EntityManager entityManager) {
		// TODO Auto-generated constructor stub
		super();
		this.entityManager = entityManager;
	}

	@Transactional
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Employee> theQuery = currentSession.createQuery("from Emplpoyee",Employee.class);
		List<Employee> employees = theQuery.getResultList();
		return employees;
	}
	
	@Transactional
	public void save(Employee employee)
	{
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(employee);
	}

	@Transactional
	public void deleteEmployeeById(int theId)
	{
		Session currentSession = entityManager.unwrap(Session.class);getClass();
		Query<Employee> theQuery = currentSession.createQuery("delete from Emplpoyee where Id=:",Employee.class);
	}

	@Transactional
	public Employee findById(int theId) {
		// TODO Auto-generated method stub
		return null;
	}
}
