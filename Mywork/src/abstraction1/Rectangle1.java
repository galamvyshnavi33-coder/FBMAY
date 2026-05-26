package abstraction1;

public class Rectangle1 extends Shape{
	int l=10;
	int b=20;
	void area() {
		int result=l*b;
		System.out.println("area of rectangle="+result);
		
	}
	

	public static void main(String[] args) {
		Circle1 c= new Circle1();
		Rectangle1 r= new Rectangle1();
		c.area();
		r.area();
		
		

	}

}
