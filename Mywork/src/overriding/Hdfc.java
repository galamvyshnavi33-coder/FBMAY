package overriding;

public class Hdfc extends Bank{
	 void interest()
	 {
		 System.out.println("hdfc gives 10% interest");
	 }

	public static void main(String[] args) {
		Bank b1=new Sbi();
		Bank b2=new Hdfc();
		b1.interest();
		b2.interest();

	}

}
