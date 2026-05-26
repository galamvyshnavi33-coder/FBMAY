package PracticeJava;

public class Inheritance1 extends Inheritance{
	public static void mod(int a,int b)
	{
		System.out.println(a%b);
	}

	public static void main(String[] args) {
		Inheritance1 in=new Inheritance1();
		in.mod(20,5);
		in.add(20,30);
		int sum=in.sub(30,20);
	    System.out.println(sum);
	    in.mul(4, 5);
	    int a=in.div(50, 10);
	    System.out.println(a);
		
		

	}

}
