package abstraction2;

public class Vamsi1 extends Anjamma1{
	void eat()
	{
		System.out.println("vamsi eat lookes like anjamma");
	}
	void sleep()
	{
		System.out.println("vamsi sleep lokks like anjamma");
	}
	void talk()
	{
		System.out.println("vamsi talk looks like anjamma");
	}
	public static void main(String[] args) {
		Anjamma1 a= new Vyshnavi1();
		Anjamma1 a1=new Vamsi1();
		a.eat();
		a.sleep();
		a.talk();
		a1.eat();
		a1.sleep();
		a1.talk();
	}

}
