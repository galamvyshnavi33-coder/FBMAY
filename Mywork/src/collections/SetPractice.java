package collections;

import java.util.*;

public class SetPractice {

	public static void main(String[] args) {
		TreeSet<Integer>ts=new TreeSet<>();
		ts.add(10);
		ts.add(30);
		ts.add(50);
		ts.add(60);
		ts.add(45);
		ts.add(30);
		ts.add(50);
		//ts.add(null);
		//ts.remove(30);
		//ts.remove(45);
		System.out.println(ts);
		System.out.println(ts.contains(60));
		System.out.println(ts.contains(5));
		System.out.println(ts.remove(10));
		System.out.println(ts);
		for(Integer element:ts)
		{
			System.out.println(element);
		}
		System.out.println(ts);
		ts.clear();
		System.out.println(ts);
		System.out.println(ts.size());
		System.out.println(ts.isEmpty());
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println(ts);
		System.out.println(ts.pollFirst());
	
}
}
		