package fundamentals.chapter0;

import java.util.ArrayList;

/*
 * クラス SeitoScore をつくり、名前と、点数をメンバー変数に持たせてください。
 * メソッドには名前と点数を返すメソッドを作り、コンストラクタで生徒名と点数を設定するようにしてください。
 * No010を使って５人の生徒の情報を管理し、５０点以上の生徒だけを表示するプログラムを作成してください。
 * ※Listクラスを必ず使用すること
 */
public class No010 {
	public static void main(String[] args) {
		System.out.println("-50点以上の生徒一覧-");
		System.out.println();
		System.out.println("【生徒名】　【点数】");

		SeitoScore seito1 = new SeitoScore("川田",60);
		SeitoScore seito2 = new SeitoScore("渋谷",80);
		SeitoScore seito3 = new SeitoScore("里崎",45);
		SeitoScore seito4 = new SeitoScore("高島",60);
		SeitoScore seito5 = new SeitoScore("滝口",30);

		ArrayList<SeitoScore> array = new ArrayList<SeitoScore>(5);

		array.add(seito1);
		array.add(seito2);
		array.add(seito3);
		array.add(seito4);
		array.add(seito5);

		for(SeitoScore seitoScore : array) {
			if(seitoScore.getScore() >= 50) {
				System.out.println("　　" + seitoScore.getName() +  "　　　" + seitoScore.getScore() + "点");
			}
		}
	}
}
class SeitoScore{
	String name;
	int score;

	SeitoScore(String name,int score){
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return this.score;
	}
	public void setScore(int score) {
		this.score = score;
	}
}