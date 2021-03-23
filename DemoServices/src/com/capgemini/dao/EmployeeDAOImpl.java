package com.capgemini.dao;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {
	List<Employee> list = new ArrayList<Employee>();

	@Override
	public void save(Employee e) {
		list.add(e);

	}

	@Override
	public void delete(Employee e) {
		list.remove(e);

	}

	@Override
	public void update(Employee e) {
		list.set(list.indexOf(e), e);

	}

	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Employee get(int empid) {
		Employee e = null;
		for (Employee x : list) {
			if (x.getEmpid() == empid) {
				e = x;
			}
			
		}
		return e;
	}

}
