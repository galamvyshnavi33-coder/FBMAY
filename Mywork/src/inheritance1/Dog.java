package inheritance1;

public class Dog extends Animal{
	void run()
	{
		System.out.println("dog run fastly");
	}

	public static void main(String[] args) {
		Dog d=new Dog();
		d.eat();
		d.run();

	}

}
