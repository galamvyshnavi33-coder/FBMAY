package abstraction1;

public class Bike extends Vehical1{
	void start()
	{
		System.out.println("bike start with self/kick");
	}

	public static void main(String[] args) {
		Car1 c=new Car1();
		c.start();
		c.fuelType();
		Bike b=new Bike();
		b.start();
		b.fuelType();
	}
}