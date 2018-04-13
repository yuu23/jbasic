package fundamentals.chapter4.sec1_method;
/*
 * 2つのint型を引数に取る足し算メソッドを作成してください。
 * mainメソッドからそのメソッドを使っていくつかの足し算を実行させて結果を表示させるプログラムを作成してください。
 */
public class No001 {
	public static void main(String[] args) {
		add(1,2);
		add(10,55);
		add(20,23);
	}
	public static void add(int x,int y) {
		System.out.println(x + y);
	}
}