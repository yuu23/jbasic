package la.java;

public class Sample {

	public static void main(String[] args) {
		int x = add(3,4);
		int y = sub(9,3);

		System.out.println("x=" + x);
		System.out.println("y=" + y);
	 }

	public static int add(int a,int b) {
		return a + b;
	}

	public static int sub(int a,int b) {
		return a / b;
	}
}
