package fundamentals.chapter5.sec2_arraylist;

import java.util.ArrayList;
/*
 * 次のデータをArrayListに格納してください。
 * 格納後に、田中二郎をremoveメソッドを使用して削除してください。
 * 最後に拡張for文を使用して「名前：○○○○」と表示されるプログラムを作成してください。
 * ・山田太郎
 * ・田中二郎
 * ・松下花子
 */
public class No002 {
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>(3);

		array.add("山田太郎");
		array.add("田中二郎");
		array.add("松下花子");

		array.remove(1);

		for(int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}
	}
}
