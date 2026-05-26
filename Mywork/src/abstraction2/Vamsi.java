package abstraction2;

public class Vamsi extends Anjamma{
	void Sleep()
	{
		System.out.println("vamsi sleep looks like anjamma");
	}
	
	public static void main(String[] args) {
		Anjamma a=new Vyshnavi();
		Anjamma a1=new Vamsi();
		a.Sleep();
		a1.Sleep();
	
		
	}

}
