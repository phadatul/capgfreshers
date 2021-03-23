package seven;

public class Manager extends Employee{
	int empid=99;
	public Manager() {
		super("xyz", 15000);
		System.out.println(this.empid);
		System.out.println(super.empid);
	}
	
	

}
