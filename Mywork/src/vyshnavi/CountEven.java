package vyshnavi;

public class CountEven {
	static int counteven(int a, int b, int c)
	{
		int count=0;
		if(a%2==0) count++;
		if(b%2==0) count++;
		if(c%2==0) count++;
		return count;
	}
	public static void main(String[] args) {
		System.out.println(counteven(2,5,8));
	}
}
