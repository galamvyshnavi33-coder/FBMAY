package inheritance1;

public class Student1 {
	String colour;
	int height;
	Student1(String colour, int height)
	{
		this.colour=colour;
		this.height=height;
	}
	void show()
	{
		System.out.println("colour:"+colour);
		System.out.println("height:"+height);
	}
	public static void main(String[] args) {
		Student1 s=new Student1("white",5);
		s.show();
	}
		
	}