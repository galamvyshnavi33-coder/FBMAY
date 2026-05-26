package vyshnavi;

import java.util.Scanner;

public class VowelsConsonant {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a charector");
		char ch=sc.next().toLowerCase().charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			System.out.println("vowels");
		}
		else
		{
			System.out.println("consonents");
		}

	}

}
