package abstraction;

public class normal extends AB2{
	

	public static void main(String[] args) {
		normal obj=new normal();
		obj.login();
		obj.cancel();

	}
	public void login()
	{
		System.out.println("login code");
	}
	public void cancel()
	{
		System.out.println("cancel code");
	}

}
