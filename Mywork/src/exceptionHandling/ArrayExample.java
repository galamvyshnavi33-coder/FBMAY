package exceptionHandling;

public class ArrayExample {
	static String data="abc";
	public static void main(String[] args) {
		try
		{
           int data=Integer.valueOf("data");
		}
		catch(NumberFormatException e)
		{
			System.out.println("error:"+e);
		}
		finally
		{
			System.out.println("this finally block executed");
		}
		System.out.println("this program continues");
	}
}
		        