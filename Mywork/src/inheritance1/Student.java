package inheritance1;

public class Student {
	String name="vyshnavi";
	int  rollno=24;
	void showdetials()
	{
		System.out.println("name:"+name);
		System.out.println("rollno:"+rollno);

	}
	public static void main(String[] args) {
		Student s=new Student();
		s.showdetials();

	}

}
