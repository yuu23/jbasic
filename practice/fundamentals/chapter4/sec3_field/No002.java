package fundamentals.chapter4.sec3_field;
/*
 * クラス内でint型のインスタンス変数、static変数、ローカル変数を定義し、
 * メソッド内でそれぞれ定義した変数の和を表示させるプログラムを作成してください。
 */
public class No002 {
	int x = 1;

	static int y = 1;

	static void method() {
		int i = 1;
		No002 z = new No002();

		System.out.println(z.x + y + i);
	}
	public static void main(String[] args) {
		method();
	}
}
