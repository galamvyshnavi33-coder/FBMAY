package overloading;

public class Add {
	 int sum(int a, int b)
	 {
		 return a+b;
	 }
	 int sum(int a , int b, int c)
	 {
		 return a+b+c;
	 }
	 double sum(double a, double b)
	 {
		 return a+b;
	 }

	public static void main(String[] args) {
		Add a=new Add();
		System.out.println(a.sum(30,50));
		System.out.println(a.sum(40,20,20));
		System.out.println(a.sum(50,50));
		

	}

}
