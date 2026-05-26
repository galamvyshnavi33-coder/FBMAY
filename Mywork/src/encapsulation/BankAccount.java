package encapsulation;

public class BankAccount {
	private String accountHolder;
	private double balance;
	public void setAccountHolder(String AccountHolder)
	{
		this.accountHolder=accountHolder;	
	}
	public String getAccountHolder()
	{
		return accountHolder;
		
	}
	public void setBalance(double balance)
	{
		if(balance>=0)
		{
			this.balance=balance;
			
		}
		else
		{
			System.out.println("balance cannot be negative");
		}
	}
	public double getBalance()
	{
		return balance;
		
	}

	public static void main(String[] args) {
		BankAccount b1=new BankAccount();
		b1.setAccountHolder("vyshu");
		b1.setBalance(50000);
		System.out.println("AccountHolder="+b1.getAccountHolder());
		System.out.println("AccountHolder="+b1.getBalance());

		

	}

}
