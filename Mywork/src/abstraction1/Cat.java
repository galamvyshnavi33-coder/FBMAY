package abstraction1;

public class Cat extends Animal{
	void sound()
	{
		System.out.println("cat is soo cute");
	}

	public static void main(String[] args) {
		Animal a=new Dog();
		a.sound();
		a.eat();
		Animal a1=new Cat();
		a1.sound();
		a1.eat();
		

	}

}
