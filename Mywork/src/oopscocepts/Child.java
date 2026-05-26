package oopscocepts;

public class Child extends Parent{
	void car()
	{
		System.out.println("child car");
	}

	public static void main(String[] args) {
		Child c=new Child();
		c.land();
		c.house();
		c.car();

	}

}
