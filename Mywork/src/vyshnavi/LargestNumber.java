package vyshnavi;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter   size");
		int n=sc.nextInt();
		int[]arr=new int[n];
		int even=0;int odd=0;
		System.out.println("enter  elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(arr[i]%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		}
		System.out.println("even count="+even);
		System.out.println("odd count="+odd);
	}
}

			
			


		