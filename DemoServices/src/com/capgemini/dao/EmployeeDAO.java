package com.capgemini.dao;

import java.util.List;

import com.capgemini.model.Employee;

public interface EmployeeDAO {
	public abstract void save(Employee e);

	public abstract void delete(Employee e);

	public abstract void update(Employee e);

	public abstract List<Employee> getAll();

	public abstract Employee get(int empid);

}
