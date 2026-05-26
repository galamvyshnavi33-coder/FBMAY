package vyshnavi;

import java.util.ArrayList;

public class TestResult {

	public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList<>();
		list.add(10);
		list.add(30);
		list.add(50);
		for(int i=list.size()-1;i>=0; i--)	
		{
			System.out.println(list.get(i));
		}
	}
}