package overriding1;

public class Car extends Bike{
	void start()
	{
		System.out.println("car starts with key");
	}

	public static void main(String[] args) {
		Vehical v1=new Bike();
		Vehical v2=new Car();
		v1.start();
		v2.start();
		

	}

}
