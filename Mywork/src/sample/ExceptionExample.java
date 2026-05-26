package sample;

import java.util.ArrayList;
import java.util.List;

public class ExceptionExample {

	public static void main(String[] args) {
		handleException();
	}

	public static void handleException() {
		List<String> list=new ArrayList<>();
		list.size();
		try {
			int a = 10;
			int b = 0;

			int result = a / b; // ArithmeticException
			System.out.println(result);

		} catch (ArithmeticException e) {
			System.out.println("Cannot divide by zero!");
		}

		System.out.println("Program continues...");
	}
}