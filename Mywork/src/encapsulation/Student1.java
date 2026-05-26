package encapsulation;

public class Student1 {
	private  int rollno;
	private String name;
	private int age;
	public void setRollno(int rollno)
	{
		this.rollno=rollno;
	}
	
		

	public void setAge(int age)
	{
		this.age=age;
	}
	public  int getRollno() 
	{
		return rollno;
		
	}public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}

	public static void main(String[] args) {
		Student1 s1=new Student1();
		s1.setRollno(567);
		s1.setAge(24);
		System.out.println("student rollno="+s1.getRollno());
		System.out.println("student rollno="+s1.getName());
		System.out.println("student rollno="+s1.getAge());


		

	}

}
