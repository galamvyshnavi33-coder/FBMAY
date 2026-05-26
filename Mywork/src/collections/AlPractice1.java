package collections;

import java.util.*;

public class AlPractice1 {

	public static void main(String[] args) {
    Map<Integer,Integer> map=new TreeMap<>();
    map.put(1, 10);
    map.put(2, 40);
    map.put(3, 30);
    map.put(4, 50);
    map.put(5, 70);
    //map.put(null, 90);
    //map.put(null, null);
    //map.put(null, null);
    map.put(2, 40);
    map.put(4, 50);
    System.out.println(map);
    map.remove(4);
    map.remove(5, 70);
    System.out.println(map.get(5));
    System.out.println(map.get(1));
    System.out.println(map.containsKey(5));
    System.out.println(map.containsValue(70));
    System.out.println(map.containsKey(7));
    System.out.println(map.containsValue(100));
    System.out.println(map.size());
    System.out.println(map.isEmpty());
    //map.clear();
    System.out.println(map);
    System.out.println("iterating with entry set");
    map.replace(3, 80);
    System.out.println(map);
 
	}
}
    

    
    
    