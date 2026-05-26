package vyshnavi;

public class MethodPrcatice {
	int a=30;
	int b=40;
	void add()
	{
		System.out.println(a+b);
	}
	int sum(int a, int b)
	{
		return a+b;
	}
	static void sub()
	{
		int a=50;
		int b=20;
		System.out.println(a-b);

	}
	void mul()
	{
		int a=2;
		int b=3;
		System.out.println(a*b);
	}
	int div(int a, int b)
	{
		return a/b;
	}
	

	public static void main(String[] args) {
		MethodPrcatice mp=new MethodPrcatice();
		mp.add();
		int a=mp.sum(50,60);
		System.out.println(a);
        sub();
		mp.sub();
		mp.mul();
	int b=mp.div(50,2);
	System.out.println(b);
	}

}
