package overloading;

public class V1 {
	public static void main(String[] args) {
		int x=10;
		int b=20;
		int z=x++;
		System.out.println(x);//11
		System.out.println(++x);//12
		System.out.println(x--);//12,11
		System.out.println(x--);//11,10
		System.out.println(x++);//10,11
		System.out.println(b++);//21
		System.out.println(b);//21
		System.out.println(b++);//21,22
		System.out.println(b--);//22,21
		System.out.println(--b);//20
		System.out.println(z);//10
		System.out.println(x++ + ++b + ++b + b++ +x--);//11+21+22+22+12=88
		System.out.println(z);//10
		System.out.println(z);//10















	}

}
