package vyshnavi;

public class VariablesPractice {
	String name="vyshnavi";
	String colour="white";
    static int age=24;
    int rollno=1234356;
    double height=4.5;
    boolean grade=true;

	public static void main(String[] args) {
		int a=40;
		int b=50;
		int c=35;
		System.out.println(a+b+c);
		VariablesPractice vp=new VariablesPractice();
		System.out.println("a:"+a);
		System.out.println(vp.name);
		System.out.println(vp.colour);
		System.out.println(age);
		System.out.println(vp.rollno);
		System.out.println(vp.height);
		System.out.println(vp.grade);
		System.out.println(b);

	}

}
