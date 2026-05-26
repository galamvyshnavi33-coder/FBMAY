package abstraction2;

public class HDFC extends Bank{
	void rateofintereset()
	{
		System.out.println("hdfc gives 6% rateofinterest");
	}
	void bonus()
	{
		System.out.println("hdfc given 7000 bonus");
	}
	public static void main(String[] args) {
		Bank b=new SBI();
		Bank b1=new HDFC();
		b.rateofintereset();
		b.bonus();
		b1.rateofintereset();
		b1.bonus();
	}

}
