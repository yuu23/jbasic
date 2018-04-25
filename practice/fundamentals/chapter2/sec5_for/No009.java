package fundamentals.chapter2.sec5_for;
/*
 * int型の配列に値1~5を代入し、拡張for文を使用して1から順番に表示させるプログラムを作成してください。
 */
public class No009 {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};

		for(int x:array) {
			System.out.println(x);
		}
	}
}
