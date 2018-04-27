package fundamentals.chapter10.sec1_list;

import java.util.ArrayList;

/*
 * ArrayListクラスに文字列を代入し、出力するプログラムを作成してください。
 */
public class No001 {
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>(5);

		array.add("りんご");
		array.add("ごりら");
		array.add("らっぱ");
		array.add("ぱせり");
		array.add("陸");

		for(int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}
	}
}
