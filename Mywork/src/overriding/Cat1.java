package overriding;

public class Cat1 extends Animal{
	void eat()
	{
		System.out.println("cat eats well");
	}

	public static void main(String[] args) {
	 	 Dog1 d=new Dog1();
	 	 d.eat();
	 	 Cat1 c=new Cat1();
	 	 c.eat();

	}

}
