package interface1;

public class Child {
	public void showFather()
	{
		System.out.println("father'method");
	}
	public void showMother()
	{
		System.out.println("mother's method");
	}

	public static void main(String[] args) {
		Child c=new Child();
		c.showFather();
		c.showMother();
		

	}

}
