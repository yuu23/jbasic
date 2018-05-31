package fundamentals.chapter4.sec1_method;

import java.util.Random;
import java.util.Scanner;
/*
 * じゃんけんを行うクラスを作成してください。
 * キーボード入力に対して、じゃんけんで「勝ち、負け、あいこ」を表示するプログラムを作成してください。
 */
public class No018 {
	public static void main(String[] args) {
		System.out.println("じゃんけんをします");
		System.out.println("「グー」「チョキ」「パー」のどれかを入力してください");

		// キーボード入力機能
		Scanner scan = new Scanner(System.in);
		String str = scan.next();

		// 見やすいように改行
		System.out.println();

		// CPU(1,グー　2,チョキ　3,パー)
		Random rand = new Random();
        int cpu = rand.nextInt(2);

		// じゃんけん判定
		switch(str) {

		case "グー":
			if(cpu == 0) {
				System.out.println("相手は「グー」を出しました");
				System.out.println("よって、あいこです");
			}else if(cpu == 1) {
				System.out.println("相手は「チョキ」を出しました");
				System.out.println("よって、あなたの勝ちです");
			}else if(cpu == 2) {
				System.out.println("相手は「パー」を出しました");
				System.out.println("あなたの負けです");
			}
			break;

		case "チョキ":
			if(cpu == 0) {
				System.out.println("相手は「グー」を出しました");
				System.out.println("よって、あなたの負けです");
			}else if(cpu == 1) {
				System.out.println("相手は「チョキ」を出しました");
				System.out.println("よって、あいこです");
			}else if(cpu == 2) {
				System.out.println("相手は「パー」を出しました");
				System.out.println("よって、あなたの勝ちです");
			}
			break;

		case "パー":
			if(cpu == 0) {
				System.out.println("相手は「グー」を出しました");
				System.out.println("よって、あなたの勝ちです");
			}else if(cpu == 1) {
				System.out.println("相手は「チョキ」を出しました");
				System.out.println("よって、あなたの負けです");
			}else if(cpu == 2) {
				System.out.println("相手は「パー」を出しました");
				System.out.println("よって、あいこです");
			}
			break;
		}
	}
}
