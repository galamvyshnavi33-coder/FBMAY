package oopscocepts;

public class LoginPage1 {
	private String username;
	private String password;
	public void setUsername(String username)
	{
		this.username=username;
	}
	public String getUsername()
	{
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
		LoginPage1 l=new LoginPage1();
		l.setUsername("vyshnavi");
		l.setPassword("vydshu@123");
		System.out.println("username:"+l.getUsername());
		System.out.println("password:"+l.getPassword());

		

	}

}
