package oopscocepts;

public class Employee {
	private int empId;
	private String empName;
	private double salary;
	public void setempId(int empId)
	{
		this.empId=empId;
	}
	public int getEempId()
	{
		return empId;
	}
	public void setempName(String empName)
	{
		this.empName=empName;
	}
	public String getempName()
	{
		return empName;
	}
	public void setsalary(double salary)
	{
		this.salary=salary;
		
	}
	public double getsalary() {
		return salary;
		
	}
	

	public static void main(String[] args) {
		Employee e=new Employee();
		e.setempId(123456);
		e.setempName("Galamvyshnavi");
		e.setsalary(50000.00);
		System.out.println(e.getEempId());
		System.out.println(e.getempName());
		System.out.println(e.getsalary());


		

	}

}
