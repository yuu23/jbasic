package fundamentals.chapter4.sec1_method;
/*
 * キーボード入力により受け取った整数を引数に取り、
 * その中央値を求めるメソッド「med」を作成してmainメソッド内で使用するプログラムを作成してください。
 */
public class No009 {
	public static void main(String[] args) {
		med(1,10,100);

	}
	public static void med(int a,int b,int c) {
		if(a <= b && a >= c) {
			System.out.println(a);

		}else if(b <= a && b >= c) {
			System.out.println(b);

		}else if(c <= a && c >= b) {
			System.out.println(c);

		}else if(a <= c && a >= b) {
			System.out.println(a);

		}else if(b <= c && b >= a) {
			System.out.println(b);

		}else if(c <= b && c >= a) {
			System.out.println(c);
		}
	}
}
