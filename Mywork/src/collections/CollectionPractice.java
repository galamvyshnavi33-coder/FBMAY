package collections;

import java.util.*;

public class CollectionPractice {

	public static void main(String[] args) {
    List<String>fruits=new ArrayList<>();
    fruits.add("banana");
    fruits.add("manago");
    fruits.add("apple");
    for(String fruit:fruits)
    {
    	System.out.println(fruit);
   }
    System.out.println(fruits.get(0));
    fruits.remove("banana");
    System.out.println("after remove:"+fruits);
    fruits.set(1, "watermelon");
    System.out.println(fruits.contains("manago"));
    System.out.println(fruits);
    
   
    
	}

}
