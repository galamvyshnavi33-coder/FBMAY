package abstraction;

public abstract class AB1 {
	AB1()
	{
		System.out.println("default constrcutor");
	}
	AB1(int x)
	{
		System.out.println("parameterized constrcutor");
	} 
	public static void submit()
	{
		System.out.println("submit for non abstract code");
	}

	public static void main(String[] args) {
		//AB1 a=new AB1();
		
	}

}
