package fundamentals.chapter7.sec2_throw;
/*
 * int型変数「int a = 0」を定義し、
 * 値が0の場合に「ArithmeticException」の例外を発生させるプログラムを作成してください。
 */
public class No001 {
	public static void main(String[] args) {
		int a = 0;

		try {
			if(a == 0) {
				throw new ArithmeticException("例外が発生しました");
			}

		}catch(ArithmeticException ae) {
			System.out.println("An exception occurred.");
			System.out.println(ae);
		}
	}
}