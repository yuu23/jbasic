package fundamentals.chapter2.sec6_if;

/*
 * double型変数xに対し、xに代入された数字が整数か少数か判定するプログラムを作成してください。
 */
public class No006 {
	public static void main(String[] args) {
		double x = 20.1;

		if(x == (int) (x)) {
			System.out.println("xは整数です");
		}else {
			System.out.println("xは少数です");
		}
	}
}
