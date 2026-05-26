package overriding;

public class Car extends Vehical1{
	void speed()
	{
		System.out.println("car speed is good");
	}

	public static void main(String[] args) {
		Vehical1 v1=new Bike1();
		Vehical1 v2=new Car();
		v1.speed();
		v2.speed();
		

	}

}
