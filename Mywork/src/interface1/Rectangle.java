package interface1;

public class Rectangle implements Shape{
	int l=5;
	 int b=4;
	  public void area()
	  {
		  System.out.println("area of rectangle="+(l*b));
	  }

	public static void main(String[] args) {
		Circle c=new Circle();
		Rectangle r=new Rectangle();
		c.area();
		r.area();

	}

}
