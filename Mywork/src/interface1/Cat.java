package interface1;

public class Cat implements Animal{
	public void sound()
	{
		System.out.println("cat makes sound");
	}

	public static void main(String[] args) {
		Dog d=new Dog();
		Cat c=new Cat();
		d.sound();
		c.sound();
		

	}

}
