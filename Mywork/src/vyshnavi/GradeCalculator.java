package vyshnavi;

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter marks");
        int marks=sc.nextInt();
        if(marks>=90)
 		{
			System.out.println("grade A");
		}else if(marks>=85)
		{
			System.out.println("grade B");
		}else if(marks>=70)
		{
            System.out.println("grade c");
		}else if(marks>=60)
		{
			System.out.println("grade d");
		}else
		{
			System.out.println("fail");
		}

	}

}
