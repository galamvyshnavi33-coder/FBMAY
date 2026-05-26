package interface1;

public class Bike1 implements Vehical1{
	public void start()
	{
		System.out.println("bike starts with self or key");
	}

	public static void main(String[] args) {
		Vehical1 v=new Car1();
		Vehical1 v1=new Bike1();
		v.start();
		v1.start();
	}

}
