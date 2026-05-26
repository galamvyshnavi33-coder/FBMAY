package encapsulation;

public class BankAccount1 {
	private double balance;
	private String getBalance;
	public void setbalance(double balance)
	{
	 if(balance>0)
	 {
		 this.balance=balance;
	 }else
	 {
		 System.out.println("invalid balance");
	 }
	}
	
	 public double getBalance()
	{
		return balance;
		
	}
	 public void deposit(double amount)
		{
			if(amount>0)
			{
				balance=balance+amount;
				System.out.println(amount+"deposite successfully");
			}
			else
			{
				System.out.println("invalid deposite amount");
				
			}
		}
	 public void withdraw(double amount)
	 {
		 if(amount>0&&amount<=balance)
		 {
			 balance=balance-amount;
			 System.out.println(amount+"withdrawn successfully");
		 }
	 }

	public static void main(String[] args) {
		
		BankAccount1 acc= new BankAccount1();
				acc.setbalance(6000);
				System.out.println("balance:"+acc.getBalance());
				acc.deposit(6000);
				System.out.println("balance after deposite:"+acc.getBalance());
				acc.withdraw(1500);
				System.out.println("balance after withdrawal:"+acc.getBalance());
	}

}
