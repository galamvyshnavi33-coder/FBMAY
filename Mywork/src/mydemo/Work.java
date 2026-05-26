package mydemo;

public class Work {
	void add()
	{
		int a=30;
		int b=50;
		System.out.println(a+b);
	}
	 void sub()
	{
		int c=40;
		int d=50;
		System.out.println(c-d); 
	}
	 int mul(int a, int b)
	 {
		 return a*b;
	 }
	 
	

	public static void main(String[] args) {
		Work a=new Work();
		a.add();
		a.sub();
		a.mul(30,40);

	}

}
