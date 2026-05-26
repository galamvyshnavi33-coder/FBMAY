package mydemo;

public class EvenAdd {
	int a=10;
	int b=5;
	void add()
	{
		if(a>b)
		{
			System.out.println("a is grater than b");
		}
		else
		{
			System.out.println("b is grater than a");
		}
	}
	public static void main(String[] args) {
		EvenAdd e=new EvenAdd();
		e.add();

	}

}
