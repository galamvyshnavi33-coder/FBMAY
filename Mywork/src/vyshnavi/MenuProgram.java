package vyshnavi;

import java.util.Scanner;

public class MenuProgram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.add");
		System.out.println("2.substract");
		int choice=sc.nextInt();
		int a=10,b=5;
		switch(choice)
		{
		case 1:System.out.println("sum="+(a+b));
		break;
		case 2:System.out.println("difference="+(a-b));
		break;
		default:
			System.out.println("invalid choice");
		}
		
	}

}
