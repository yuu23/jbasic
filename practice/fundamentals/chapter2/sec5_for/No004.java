package fundamentals.chapter2.sec5_for;
/*
 * 1から10までの整数を足した結果を表示させるプログラムをfor文を使って作成してください。
 */
public class No004 {
	public static void main(String[] args) {
		int x = 0;
		for(int y = 1;y <= 10; y++) {
			x += y;
		}
		System.out.println(x);
	}
}
