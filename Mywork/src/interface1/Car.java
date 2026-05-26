package interface1;

public class Car implements Vehical{
	public void start()
	{
		System.out.println("car starts with key");
	}

	public static void main(String[] args) {
		Vehical v;
		v=new Bike();
		v.start();
		v=new Car();
		v.start();
		

	}

}
