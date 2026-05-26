package vyshnavi;

import java.util.Scanner;

public class PassFail {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your marks");
		int marks=sc.nextInt();
		if(marks>=35)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}

	}

}
