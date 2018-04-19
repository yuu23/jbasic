package fundamentals.chapter4.sec1_method;
/*
 * 整数の 2 乗を計算するメソッドを作成しなさい。１つの int 型引数を取り、結果を int 型の戻り値として返すこと。
 * また、メソッドの動作を検証できるようにプログラムを作成してください。
 */
public class No012 {
	public static void main(String[] args) {
		int s = square(7);

		System.out.println(s);

	}
	public static int square(int x) {
		x *= x;
		return x;
	}
}
