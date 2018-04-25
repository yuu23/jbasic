package fundamentals.chapter2.sec5_for;
/*
 * String型の配列を宣言し、拡張for文を使用して順番に表示させるプログラムを作成してください。
 * ※String型の配列に代入する値と数は任意とする
 */
public class No010 {
	public static void main(String[] args) {
		String[] array = {"上野","↓","御徒町","↓","秋葉原","↓","神田"};

		for(String s : array) {
			System.out.println(s);
		}
	}
}
