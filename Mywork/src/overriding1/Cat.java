package overriding1;

public class Cat extends Animal{
	void sound()
	{
		System.out.println("cat makes sound");
	}

	public static void main(String[] args) {
		Animal a1=new Dog();
		Animal a2=new Cat();
		a1.sound();
		a2.sound();

	}

}
