package fundamentals.chapter4.sec1_method;
/*
 * double型を引数に取る割り算メソッド作成してください。
 * mainメソッドからそのメソッドを使っていくつかの割り算を実行させて結果を表示させるプログラムを作成してください。
 */
public class No002 {
	public static void main(String[] args) {
		div(10.0,5.0);
		div(100.8,10.1);
		div(5.5,6.8);

}
	public static void div(double x,double y) {
		System.out.println(x / y);
	}
}