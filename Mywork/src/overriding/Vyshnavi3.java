package overriding;

public class Vyshnavi3 extends Vyshnavi1{
	void sleep()
	{
		System.out.println("she enjoyed sleep time");
	}
	

	public static void main(String[] args) {
		Vyshnavi2 v1=new Vyshnavi2();
		v1.sleep();
		Vyshnavi3 v=new Vyshnavi3();
		v.sleep();
		
		

	}

}
