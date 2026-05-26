package abstraction1;

public class Rectangle2 extends Shape{
	int lenght=10;
	int breadth=5;
	void area()
	{
	int result=lenght*breadth;
System.out.println("area of rectangle:"+result);
	}

	public static void main(String[] args) {
		Circle12 C1=new Circle12();
				C1.area();
				Rectangle2 r1=new Rectangle2();
				r1.area();
		
	}

	}

