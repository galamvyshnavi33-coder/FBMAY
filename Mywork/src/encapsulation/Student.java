package encapsulation;

public class Student {
	private String name;
	private int age;
	public void setName(String name)
	{
		this.name=name;
	}
	public void setAge(int age)
	{
		this.age=age;
		
	}
	public String getName()
	{
		return name;
		
	}
	public int getAge()
	{
		return age; 
	}
	

	public static void main(String[] args) {
		Student s1=new Student ();
		s1.setName("vyshnavi");
		s1.setAge(24);
		
		System.out.println("student Name="+s1.getName());
		System.out.println("student Age="+s1.getAge());
		

	}

}
