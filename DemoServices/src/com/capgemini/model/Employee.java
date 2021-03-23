package com.capgemini.model;

public class Employee implements Comparable<Employee> {
	private int empid;
	private String enmae;
	private int salary;

	public Employee(int empid, String enmae, int salary) {
		super();
		this.empid = empid;
		this.enmae = enmae;
		this.salary = salary;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEnmae() {
		return enmae;
	}

	public void setEnmae(String enmae) {
		this.enmae = enmae;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "[empid=" + empid + ", enmae=" + enmae + ", salary=" + salary + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empid;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empid != other.empid)
			return false;
		return true;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.empid - o.empid;
	}

}
