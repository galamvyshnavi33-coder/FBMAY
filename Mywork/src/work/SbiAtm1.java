package work;

public class SbiAtm1 extends Atm1{
	void withdraw()
	{
		System.out.println("withdraw money from SbiAtm1");
	}
	void deposit()
	{
		System.out.println("deopsit money in SbiAtm1");
	}

	public static void main(String[] args) {
		Atm1 a=new SbiAtm1();
		a.welcome();
		a.withdraw();
		a.deposit();
		
	}

}
