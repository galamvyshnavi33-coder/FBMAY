package inheritance;

public class Dog extends Animal{
	void bark() 
	{
		System.out.println("dog is barking");
		
	}

	public static void main(String[] args) {
		Dog d=new Dog();
		d.eat();
		d.bark();

	}

}
