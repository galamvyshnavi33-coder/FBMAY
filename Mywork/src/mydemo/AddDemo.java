package mydemo;

public class AddDemo {
	void add(int a, int b)
	{
		System.out.println(a+b);
	}
	void add(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
	void add(double a, double b)
	{
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		AddDemo a=new AddDemo();
		a.add(50,60);
		a.add(60,30,40);
		a.add(5.5,7.8);
		
	}

}
