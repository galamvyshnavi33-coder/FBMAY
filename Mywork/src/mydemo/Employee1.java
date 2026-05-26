package mydemo;

public class Employee1 extends Person{
	int empId;
	double salary;
	Employee1(String name,int age,int empId,double salary)
	{
		super(name,age);
		this.empId=empId;
		this.salary=salary;
	}
	void display()
	{
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println("empId:"+empId);
		System.out.println("salary:"+salary);
	}

	public static void main(String[] args) {
		Employee1 e=new Employee1("vyshnavi",24,1999,45000.00);
		e.display();
		

	}

}
