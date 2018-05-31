package fundamentals.chapter5.sec2_arraylist;

import java.util.ArrayList;
/*
 * ArrayListのコンストラクタ「ArrayList(int initialCapacity) 」を使用して、要素数5の配列を作成してください。
 * 作成したArrayListに、任意の値を6個代入して、拡張for文を使用して1つづつ表示するプログラムを作成してください。
 */
public class No003 {
	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<Integer>(5);

		array.add(0);
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		array.add(5);

		for(int a : array) {
			System.out.println(a);
		}
	}
}
