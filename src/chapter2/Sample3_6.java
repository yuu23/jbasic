package chapter2;

class FinTest {
	final int a = 15; // final指定のインスタンス変数
	static final int b = 25; // final指定のstatic変数
	static int c = 35; // static変数（変更可能）
	int d = 45; // インスタンス変数
	int e; // インスタンス変数（デフォルト値で初期化）

	void method() { // ここからmethodメソッド
		int f; // ローカル変数（初期化されていない）、値を入れて初期化してあげないといけない
		System.out.println("a" + a);
		System.out.println("b" + b);
		System.out.println("c" + c);
		System.out.println("d" + d);
		System.out.println("e" + e);
		//System.out.println("f" + f);
	}
}
public class Sample3_6 {
	public static void main(String[] args) {
		// FinTest.b=50; // bはfinalなので変更不可
		FinTest.c = 50; // cは変更可能

		FinTest f = new FinTest();
		f.method();
	}
}