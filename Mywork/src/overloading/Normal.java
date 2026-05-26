package overloading;

import interface1.Inter2;
import interface1.Inter3;
import interface1.Inter4;

public abstract class Normal implements Inter4{
	public static void main(String[] args) {
		Inter3.reset();
		Inter2.cancel();
		Inter3.cancel();
	}
}
		
		
	

	