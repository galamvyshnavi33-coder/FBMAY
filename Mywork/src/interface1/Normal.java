package interface1;

public class Normal  implements Inter1{

	public static void main(String[] args) {
		Inter1.cancel();
		Normal n= new Normal();
		n.login();
	}
	public void login()
	{
		System.out.println("login code");
		
		

	}

}
