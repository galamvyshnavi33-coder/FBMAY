package abstraction2;

public class Demo extends Test{
	 void display()
	 {
		 System.out.println("demo class");
	 }
	 void show()
	 {
		 System.out.println("show method");
	 }
	 public static void main(String[] args) {
		 Test t=new Demo();
		 t.display();
		 t.show();
		 
		
	}

}
