package mydemo;

public class P1 {
	void add(int a, int b)
	{
		System.out.println(a+b);
	}
	int sub(int a,int b)
	{
		return a-b;
	}


	public static void main(String[] args) {
		P1 p1=new P1();
		 int a=p1.sub(40,20);
		 System.out.println(a);

	}

}
