package mydemo;

public class Car {
	String brand;
	String model;
	int speed;
	void displayCar()
	{
		System.out.println("brand:"+brand);
		System.out.println("model:"+model);
		System.out.println("speed:"+speed+"km/h");

	}

	public static void main(String[] args) {
		Car c=new Car();
		c.brand="mahendra";
		c.model="innova";
		c.speed=130;
		c.displayCar();
		

	}

}
