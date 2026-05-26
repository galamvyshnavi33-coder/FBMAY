package work;

public class Car extends Vehical{
	void start()
	{
		System.out.println("car starts with key r button");
	}

	public static void main(String[] args) {
		Vehical v1=new Bike();
		Vehical v2=new Car();
		v1.start();
		v1.fuelType();
		v2.start();
		v2.fuelType();
		

		

	}

}
