package vyshnavi;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int a=0,b=1;
		System.out.println("FibonacciSeries");
		for(int i=1;i<=n;i++)
		{
			System.out.println(a+"");
			int next=a+b;
			
			a=b;
			b=next;
		}
		sc.close();
	}
}

		