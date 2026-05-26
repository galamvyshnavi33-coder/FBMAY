package mydemo;

public class Employee {
	int employeeId;
	String name;
	double salary;
	Employee(int employeeId,String name,double salary)
	{
		this.employeeId=employeeId;
		this.name=name;
		this.salary=salary;
	}
	void display()
	{
		System.out.println("employeeId:"+employeeId);
		System.out.println("name:"+name);
		System.out.println("salary:"+salary);


	}

	

	public static void main(String[] args) {
		Employee e=new Employee(12456,"vyshu",500000.00);
		e.display();

	}

}
