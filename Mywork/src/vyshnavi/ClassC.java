package vyshnavi;

public class ClassC extends ClassB{
	void print()
	{
		System.out.println("c class");
	}

	public static void main(String[] args) {
		ClassA obj=new ClassC();
		obj.print();
		

	}

}
