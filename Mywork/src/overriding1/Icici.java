package overriding1;

public class Icici extends Bank{
	void rateofInterest()
	{
		System.out.println("icici bank interest");
	}
	public static void main(String[] args) {
		Bank b1=new Sbi();
		Bank b2=new Hdfc();
		Bank b3=new Icici();
		b1.rateofInterest();
		b2.rateofInterest();
		b3.rateofInterest();


		
		
		

	}

}
