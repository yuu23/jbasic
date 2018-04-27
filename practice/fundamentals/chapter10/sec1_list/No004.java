package fundamentals.chapter10.sec1_list;

import java.util.ArrayList;

/*
 * ArrayListを使用して値を代入後、拡張for文を使用して値を順番に表示するプログラムを作成してください。
 */
public class No004 {
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>(5);

		array.add("なす");
		array.add("さつまいも");
		array.add("ぶどう");
		array.add("源氏物語");
		array.add("唐辛子");

		for(String m : array) {
			System.out.println(m);
		}
	}
}
