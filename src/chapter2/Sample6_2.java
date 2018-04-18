package chapter2;

public class Sample6_2 {
	public static void main(String[] args) {
		int x = 15;
		int y = 0;
		try {
			System.out.println("x / y:" + x / y); //ArthmeticExceptionが発生します。
			System.out.println("x * y:" + x * y);
		}catch (ArrayIndexOutOfBoundsException oe) {
			System.out.println("An exception occured:" + oe);
		}finally {
			System.out.println("finallu block must be executed!");
		}
		System.out.println("x - y:" + (x - y));
	}
}
