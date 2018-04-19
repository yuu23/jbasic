package fundamentals.chapter4.sec1_method;
/*
 * 戻り値ありのメソッドを任意に作成し、メソッドを使用した結果を変数に入れずに出力するプログラムを作成してください。
 */
public class No016 {
	public static void main(String[] args) {
		m(0);
	}
	public static int m(int x) {
		System.out.println("戻り値あり");
		return x;
	}
}
