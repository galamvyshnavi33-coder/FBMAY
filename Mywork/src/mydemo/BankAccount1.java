package mydemo;

public class BankAccount1 {
	int accountnumber;
	String accountholderName;
	double balance;
	BankAccount1(int accountnumber,String accountholderName,double balance)
	{
		this.accountnumber=accountnumber;
		this.accountholderName=accountholderName;
		this.balance=balance;
		
	}
	void display()
	{
		System.out.println("accountnumber:"+accountnumber);
		System.out.println("accountholderName:"+accountholderName);
		System.out.println("balance:"+balance);	
	}

	public static void main(String[] args) {
		BankAccount1 b=new BankAccount1(3556788,"vyshnavi",59000000.00);
		b.display();

	}

}
