package work;

public class Rectangle extends Shape{
	void area()
	{
      int l=4;
      int b=7;
      System.out.println("area of rectangle="+(l*b));
	}
	public static void main(String[] args) {
		Shape s=new Circle();
		Shape s1=new Rectangle();
		s.area();
		s1.area();
	}
}

	

	