package oopscocepts;

public class Car extends Vehical{
	void stop()
	{
		System.out.println("car stop");
	}
	public static void main(String[] args) {
		Car c=new Car();
		c.start();
		c.stop();
		
	}

}
