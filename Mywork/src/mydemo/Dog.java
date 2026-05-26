package mydemo;

public class Dog extends Animal{
	void bark()
	{
		System.out.println("dog barks");
	}

	public static void main(String[] args) {
		Dog s=new Dog();
		s.sound();
		s.bark();
		

	}

}
