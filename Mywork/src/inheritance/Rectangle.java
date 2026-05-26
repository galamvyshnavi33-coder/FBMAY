package inheritance;

public class Rectangle extends Circle{
	void drawRectangle()
	{
		System.out.println("draw the rectangle");
	}

	public static void main(String[] args) {
		Circle c= new Circle();
		c.display();
		c.drawCircle();
		Rectangle r=new Rectangle();
		r.display();
		r.drawRectangle();

	}

}
