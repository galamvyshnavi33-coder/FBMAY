package mydemo;

public class Employee2 {
	int empId;
	String empname;
	double salary;
	Employee2(int empId,String empname,double salary)
	{
		this.empId=empId;
		this.empname=empname;
		this.salary=salary;
	}
	void displayEmployee2()
	{
		System.out.println("empId:"+empId);
		System.out.println("empname:"+empname);
		System.out.println("salary:"+salary);	
	}

	public static void main(String[] args) {
		Employee2 e= new Employee2(1234,"vyshnavi",50000.00);
		e.displayEmployee2();
		

	}

}
