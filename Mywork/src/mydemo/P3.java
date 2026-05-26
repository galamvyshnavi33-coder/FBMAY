package mydemo;

public class P3 extends P2{
	int a=5;
	public void add(int a ,int b)
	{
		System.out.println(a+b);
	}

	public static void main(String[] args) {
    P3 p= new P3();
    p.add(50,50);
    p.sum();
    p.add(40,50);
   

	}

}
