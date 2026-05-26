package oopscocepts;

public class LoginPage {
	private String username;
	private String password;
	public void setUsername(String usesrname)
	{
		this.username=username;
	}
	public String setPassword()
	{
		return username;
	}
	public String getUsername() {
		return username;
	}
	public void setPassword(String password)
	{
		this.password=password;
		
	}
	public String getPassword()
	{
		return password;
	}

	
	public static void main(String[] args) {
		LoginPage l=new LoginPage();
		l.setUsername("tester@12");
		l.setPassword("Galamvysh@12");
		System.out.println("username:"+l.getUsername());
		System.out.println("password:"+l.getPassword());

		

	}

}

