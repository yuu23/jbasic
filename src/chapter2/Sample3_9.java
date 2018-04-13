package chapter2;

class OLTest { // OLTestの中に3つのメソッドが入っている

	void metTest(int a,int b) {
		System.out.println("metTest(int a,int b) = " + a + "&" + b);
	}

	void metTest(int a) {
		System.out.println("metTst(int a) = " + a);
	}

	void metTest(double a,double b) {
		System.out.println("metTest(double a,double b) = " + a + "&" + b);
	}
}
public class Sample3_9 {
	public static void main(String[] args) {
		OLTest ot = new OLTest();

		ot.metTest(25,45); // 参照変数.メソッド名
		ot.metTest(123); // どのデータ型、引数の数はいくらか、によって上から呼び出されるものが決まる
		ot.metTest(2.5,4.5);
	}
}
