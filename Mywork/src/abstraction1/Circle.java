package abstraction1;

public abstract class Circle extends Shape{
	int r=7;
	void atrea()
	{
		System.out.println("area of rectangle="+(3.14*r*r));
	}

	public static void main(String[] args) {
		Rectangle r=new Rectangle();
		
		r.area();
		
	}

}
