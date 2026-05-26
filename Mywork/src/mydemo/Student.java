package mydemo;

public class Student {
	String name;
	int rollno;
	Student(String name,int rollno) {

		this.name=name;
		this.rollno=rollno;
	}
	void display()
	{
		System.out.println("name:"+name);
		System.out.println("rollno:"+rollno);

	}

	public static void main(String[] args) {
		Student s=new Student("vyshu",101);
		s.display();
		

	}

}
