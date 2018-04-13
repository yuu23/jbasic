package fundamentals.chapter2.sec6_if;

/*
 * int型変数xに対し、xに代入された数値が10の倍数かそうでないかを判定するプログラムを作成してください。
 */
public class No003 {
	public static void main(String[] args) {
		int x = 200;

		if(x % 10 == 0) {
			System.out.println(x + "は10の倍数である");
		}else {
			System.out.println(x + "は10の倍数ではない");
		}
	}
}
