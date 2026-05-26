package mydemo;

public class MathOperations {
	void add(int a ,int b)
	{
		System.out.println(a+b);
	}
	void add(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		MathOperations m=new MathOperations();
		m.add(50,60);
		m.add(60,70,80);
	}
}
		
	