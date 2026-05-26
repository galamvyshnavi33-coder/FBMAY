package mydemo;

public class BankAccount {
	private String accountholder;
	private int accountNumber;
	private double balance;
	BankAccount(String accountholder,int accountNumber,double balance)
	{
		this.accountholder=accountholder;
		this.accountNumber=accountNumber;
		this.balance=balance;
		
	}
	public void deposit(double amount)
	{
		if(amount<=balance)
		{
			balance=balance-amount;
			System.out.println(amount+"withdrawn succefully");
		}
		else
		{
			System.out.println("insufficient balance");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
