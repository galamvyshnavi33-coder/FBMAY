package abstraction2;

public class Cat extends Animal{
	 void sound()
	 {
		 System.out.println("cat makes sound");
	 }

	public static void main(String[] args) {
		Animal obj=new Dog();
		Animal obj1=new Cat();
		obj.sound();
		obj1.sound();
		
		

	}

}
