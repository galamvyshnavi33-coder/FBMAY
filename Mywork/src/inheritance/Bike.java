package inheritance;

public class Bike extends Vehical{
	void run()
	{
		System.out.println("bike is running safely");
	}

	public static void main(String[] args) {
    Bike b= new Bike();
    b.run();
	}

}
