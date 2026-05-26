package inheritance;

public class Puppy extends Dog{
	void weep()
	{
		System.out.println("puppy is weeping");
	}

	public static void main(String[] args) {
		Puppy p= new Puppy();
		p.eat();
		p.bark();
		p.weep();
		

	}

}
