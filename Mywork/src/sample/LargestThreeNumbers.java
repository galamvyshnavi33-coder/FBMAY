package sample;

public class LargestThreeNumbers {

	public static void main(String[] args) {
    String str="I love testing and testing is good";
    for(int i=0; i<str.length();i++)
    {
    	char ch=str.charAt(i);
    	if(str.indexOf(ch)==str.lastIndexOf(ch))
    	{
    		System.out.println("first  repeating:"+ch);
    		break;
    	}
 

    }
	}
}