package abstraction1;

public class Teacher extends Person{
	void work()
	{
		System.out.println("teacher is teaching");
	}

	public static void main(String[] args) {
		Student s=new Student();
		s.work();
		s.sleep();
		Teacher t=new Teacher();
		t.work();
		t.sleep();
		
		

	}

}
