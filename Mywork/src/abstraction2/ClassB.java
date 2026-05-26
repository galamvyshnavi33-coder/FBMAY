package abstraction2;

public class ClassB extends ClassA{
	void show()
	{
		System.out.println("classb extends classa");
	}

	public static void main(String[] args) {
		ClassA obj=new ClassB();
		obj.show();

	}

}
