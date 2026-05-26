package mydemo;

public class AreaDemo {
	void add(int a, int b)
	{
		System.out.println();
	}
	void add(int a, int b ,int c)
	{
		System.out.println(a+b+c);
	}
	void add(double a, double b)
	{
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		AreaDemo a=new AreaDemo();
		a.add(50,60);
		a.add(60,70,80);
		a.add(5.5,4.5);
		

	}

}
