package PracticeJavaPrograms;

public class LargestInArray {

	public static void main(String[] args) {
		int arr[]= {10,20,60,70,80,90};
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}		
	}
		System.out.println(max);
}
}
		