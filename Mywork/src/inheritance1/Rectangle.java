package inheritance1;

public class Rectangle extends Circle{
	void rectangleInfo()
	{
		System.out.println("this is a rectangle");
	}

	public static void main(String[] args) {
		Circle c=new Circle();
		c.CircleInfo();
		Rectangle r=new Rectangle();
		r.rectangleInfo();
		
		

	}

}
