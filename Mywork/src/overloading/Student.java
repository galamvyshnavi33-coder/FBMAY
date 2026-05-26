package overloading;

public class Student {
	String name="vyshnavi";
	int age=24;
	Student()
	{
		name="unknown";
		age=0;
	}
	Student (String n)
	{
		name=n;
		age=0;
	}
	Student(String n, int a)
	{
		name=n;
		age=a;
		
	}
	void display()
	{
		System.out.println("name:"+name+",age:"+age);
	}
	public static void main(String[] args) {
		Student s1=new Student();		
		Student s2=new Student("vyshnavi");
		Student s3=new Student("vyshu",25);
		s1.display();
		s2.display();
		s3.display();
	}
}
				


		


		
		

	
