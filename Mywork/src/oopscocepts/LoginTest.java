package oopscocepts;

public class LoginTest extends BaseTest{
	void login()
	{
		System.out.println("login test executed");
	}

	public static void main(String[] args) {
		LoginTest l=new LoginTest();
		l.setup();
		l.login();

	}

}
