package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetBasic {

	public static void main(String[] args) {
	    String str="programming";

		Set<Character>set=new HashSet<>();
		for(char c:str.toCharArray())
		{
			set.add(c);
		}
		System.out.println("count:"+set.size());
	}
}