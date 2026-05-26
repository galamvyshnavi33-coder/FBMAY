package inheritance;

public class C2 extends C1{
	public  void sum(int a, int b)
	{
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		C2 c=new C2();
		c.add(40,50);
		c.sum(50,50);;

	}

}
