package fundamentals.chapter2.sec6_if;

/*
 * int型変数x、yに対し、x÷yの演算が割り切れるかどうかを判定するプログラムを作成してください。
 */
public class No004 {
	public static void main(String[] args) {
		int x = 11;
		int y = 5;

		if(x % y == 0) {
			System.out.println("x÷yは割り切れる");
		}else {
			System.out.println("x÷yは割り切れない");
		}
	}
}
