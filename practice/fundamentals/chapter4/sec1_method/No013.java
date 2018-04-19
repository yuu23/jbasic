package fundamentals.chapter4.sec1_method;
/*
 * ２つの整数の平均を計算するメソッドを作成しなさい。２つの int 型引数を取り、結果を int 型の戻り値として返すこと。
 * また、メソッドの動作を検証できるようにプログラムを作成してください。
 * ※平均の計算は整数で行うこと
 */
public class No013 {
	public static void main(String[] args) {
		int ave = average(10,20);

		System.out.println(ave);
	}

	public static int average(int x,int y) {
		return (x + y) / 2;
	}
}
