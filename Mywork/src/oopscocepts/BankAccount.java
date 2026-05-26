package oopscocepts;

public class BankAccount {
	private double balance;
	public void setBalance(double balance)
	{
	if(balance>0)
	{
		this.balance=balance;
	}
	else
	{
		System.out.println("invalid balance");
	}
	}
	public double getBalance()
	{
		return balance;
	}

	public static void main(String[] args) {
		BankAccount b=new BankAccount();
		b.setBalance(50000);
		System.out.println("balance:"+b.getBalance());

	}

}
