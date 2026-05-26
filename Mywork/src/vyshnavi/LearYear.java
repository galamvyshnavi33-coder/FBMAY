package vyshnavi;

import java.util.Scanner;

public class LearYear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter year");
		int year=sc.nextInt();
		if(year%4==0)
		{
			System.out.println("leapyear");
		}
		else
		{
			System.out.println("not a leapyear");
		}

	}

}

