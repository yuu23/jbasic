package fundamentals.chapter10.sec1_list;

import java.util.ArrayList;

/*
 * ArrayListクラスに値を代入し、サイズを出力するプログラムを作成してください。
 */
public class No003 {
	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<Integer>(4);

		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);

		System.out.println(array.size());
	}
}
