package PracticeJava;

public class Methods {
	public void sum()
	{
		System.out.println("hello");
	}
	public static int add(int a,int b)
	{
		return a+b;
	}
	public void sub()
	{
		int a=50;
		int b=60;
		System.out.println(a-b);
	}
	public static int mul(int a,int b)
	{
		return a*b;
		
	}

	public static void main(String[] args) {
		Methods m=new Methods();
		m.sum();
		int sum=m.add(30,50);
		System.out.println(sum);
		m.sub();
		int mul=m.mul(2, 6);
		System.out.println(mul);
		

	}

}
