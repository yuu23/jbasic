package fundamentals.chapter4.sec1_method;
/*
 * 1からnまでの全整数の和を求めて返却するメソッドを作成し、
 * mainメソッド内で使用するプログラムを作成してください。
 * ※nはキーボード入力により取得すること
 */
public class No010 {
	public static void main(String[] args) {
		sum(100);

	}
	public static int sum(int n){
		int x = 0;
		for(int i = 1; i <= n; i++) {
		x += i;

		}
		System.out.println(x);
		return n;
	}
}
