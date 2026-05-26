package abstraction1;

public class Creditcard implements Pyment{
	public void Pay()
	{
		System.out.println("payment done using the creditcard");
	}

	public static void main(String[] args) {
		UPT u=new UPT();
		u.pay();
		Creditcard c=new Creditcard();
		c.Pay();
		
	
		

	}

	@Override
	public void pay() {
		
	}

}
