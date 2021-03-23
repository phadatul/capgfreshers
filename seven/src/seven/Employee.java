package seven;

public class Employee {
	public int empid;
	public String ename;
	public int salary;

	public static int count = 1200;

	public Employee() {

	}

	public Employee(String ename, int salary) {
		count = count + 1;
		this.empid = 11;
		this.ename = ename;
		this.salary = salary;
	}

	public void printEmployee() {
		System.out.println("ID:" + empid);
		System.out.println("NAME:" + ename);
		System.out.println("SALARY:" + salary);

	}

}
