package collections;

import java.util.*;

public class MPractice {

	public static void main(String[] args) {
		Map<Integer,String>m=new Hashtable<>();
		m.put(50072, "hyderabad");
		m.put(50070, "chennai");
		m.put(123234, "kavali");
		
		Set<Integer>key=m.keySet();
		/*for(Integer key:keys)
		{
			System.out.println(key);
		}
		Collection<String>Values=m.Values();
		for(String Value:Values)
		{
			System.out.println(Values);
			
		}*/
		
		System.out.println(m.get(123234));
		System.out.println(m);
		m.remove(123234);
		System.out.println(m);
		System.out.println(m.containsKey(50072));
		System.out.println(m.containsKey(1232346));
		System.out.println(m.containsValue("kavali"));
		System.out.println(m.containsValue("nellore"));
		

	}

}
