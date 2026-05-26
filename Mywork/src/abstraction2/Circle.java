package abstraction2;

public class Circle extends Shape{
	void draw()
	{
		System.out.println("draw the circle");
	}

	public static void main(String[] args) {
		Shape s=new Rectangle();
		Shape s1=new Circle();
		s.draw();
		s1.draw();

	}

}
