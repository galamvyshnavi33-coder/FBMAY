package vyshnavi;

public class Exception {
	static int data;
	public static void add()
	{
		System.out.println("addition");
	}

	public static void main(String[] args) {
		try
		{
		data=100/0;
		System.out.println(data);
		}
		catch(ArithmeticException E)
		{
			System.out.println(E);
			data=100/10;
			System.out.println(data);
		}
		finally
		{
			System.out.println("this code will executed ");
		}
		add();
		
	}
}
			
		