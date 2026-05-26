package mydemo;

public class Person {
	String name;
	int age;
	Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	void displayPerson()
	{
		System.out.println("name:"+name);
		System.out.println("age:"+age);

	}

	public static void main(String[] args) {

	}

}
