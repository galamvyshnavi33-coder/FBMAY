package collections;

import java.util.*;

public class LLPractice {

	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<>();
		al.add("s1");
		al.add("s2");
	LinkedList<String>ll=new LinkedList<>();
	ll.add("y1");
	ll.add("y2");
	ll.add("y3");
	ll.add(1,"yy");
	ll.add("y3");
	ll.addAll(0,al);
	ll.add(null);
	ll.add("y3");
	ll.add(null);
	//ll.remove(1);
	//ll.remove("yy");
	//ll.removeAll(al);
	ll.set(2, "y4");
	System.out.println(ll);
	//System.out.println(al.get(1));
	//System.out.println(ll.get(3));
	//System.out.println(ll.contains("yy"));
	
		

	}
	public static void processArray() {
		Integer[] arr = new Integer[] { 1, 5, 7, 8, 9, 4 };
		ArrayList<Integer> all = new ArrayList<>(Arrays.asList(arr));

		all.add(80);
		all.remove(4);

		System.out.println(all); // print list
		System.out.println(all.get(3)); // get element at index 3

		all.set(2, 40); // update index 2
		System.out.println(all);

		for (int i = 0; i < all.size(); i++) {
			System.out.println(all.get(i));
		}
	}

}
