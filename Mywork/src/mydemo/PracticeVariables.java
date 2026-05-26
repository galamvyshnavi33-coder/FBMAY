package mydemo;

public class PracticeVariables {
	 int age=24;
	 public void age()
	{
		if(age>=18)
		{
			System.out.println("elisible for vote");
		}
		else
		{
			System.out.println("not elisible for vote");
		}
	}

	public static void main(String[] args) {
		PracticeVariables p=new PracticeVariables();
		p.age();

	}

}
