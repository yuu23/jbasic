package fundamentals.chapter2.sec6_if;

import java.util.Scanner;

/*
 * キーボード入力によって入力された数字に対して偶数か奇数を判定するプログラムを作成してください。
 */
public class No007 {
	public static void main(String[] args) {
		System.out.println("数値を入力してください");

		Scanner scan = new Scanner(System.in);
		int y = scan.nextInt();

		if(y % 2 == 0) {
			System.out.println("入力された数字は偶数です");
		}else if(y % 2 != 0) {
			System.out.println("入力された数字は奇数です");
		}
	}
}
