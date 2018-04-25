package fundamentals.chapter2.sec7_switch;

import java.util.Scanner;
/*
 * キーボード入力により、「春、夏、秋、冬」のどれかを入力し、
 * それぞれに対応する英語名が出力されるプログラムをswitch文を使用して作成してください。
 */
public class No003 {
	public static void main(String[] args) {
		System.out.println("「春、夏、秋、冬」のうち、どれか一つ入力してください");

		Scanner scan = new Scanner(System.in);
		String season = scan.next();

		switch(season) {

		case "春":
			System.out.println("Spring");
			break;

		case "夏":
			System.out.println("Summer");
			break;

		case "秋":
			System.out.println("Autumn");
			break;

		case "冬":
			System.out.println("Winter");
			break;
		}
	}
}
