package abstraction1;

public class Circle1 extends Shape{
	double radius=5;
	void area()
	{
		double result=3.14*radius*radius;
		System.out.println("area of circle ="+result);
	}

}
