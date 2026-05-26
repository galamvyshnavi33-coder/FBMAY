package inheritance1;

public class Puppy extends Dog{
	void sleep()
	{
		System.out.println("puppy sleep cute");
	}
	public static void main(String[] args) {
		Puppy p=new Puppy();
		p.eat();
		p.run();
		p.sleep();

	}

}
