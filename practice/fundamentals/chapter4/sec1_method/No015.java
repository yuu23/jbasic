package fundamentals.chapter4.sec1_method;

import java.util.Random;
/*
 * Randomクラスを使用してランダムな整数を返すメソッドを作成してください。
 * 作成したメソッドを使用した結果を変数に格納してください。
 * 最後に変数に格納した結果を画面に表示させるプログラムを作成してください。
 */
public class No015 {
	public static void main(String[] args) {
		int y = random(10);
		System.out.println(y);


	}
	public static int random(int x) {
		Random r = new Random();
		int randomNumber = r.nextInt(x);

		return randomNumber;
	}
}
