package abstraction1;

public class Car extends Vehical{
	void start()
	{
		System.out.println("car starts with key");
	}
	public static void main(String[] args) {
		Car c=new Car();
		c.fuel();
		c.start();
		
		
	}

}
