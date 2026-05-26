package vyshnavi;

import java.util.ArrayList;
import java.util.List;

public class CollectionPractice {

	public static void main(String[] args) {
		List<String>usernames=new ArrayList<>();
		usernames.add("user1");
		usernames.add("user2");
		usernames.add("user3");
		for(String user:usernames)
		{
			System.out.println("testing login with:"+user);
		}


		

	}

}
