package interface1;

public interface Inter4 extends Inter2,Inter3{
	public static void main(String[] args) {
		Inter2.cancel();
		Inter3.cancel();
	}
	

}
