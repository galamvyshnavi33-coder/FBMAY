package mydemo;

public class Student1 extends Person{
	int rollno;
	Student1(String name,int age,int rollno)
	{
		super(name,age);
		this.rollno=rollno;
	}
	void displayStudent1()
	{
		System.out.println("rollno:"+rollno);
	}
	public static void main(String[] args) {
		Student1 s=new Student1("vyshu",24,101);
		s.displayStudent1();
		
	}
	

}
