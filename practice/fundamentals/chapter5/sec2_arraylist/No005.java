package fundamentals.chapter5.sec2_arraylist;

import java.util.ArrayList;

/*
 * データ数が5以上のArrayListを作成し、もしArrayListのサイズが3より大きい場合は、
 * 要素数1~3以外に入っているデータをすべて出力するプログラムを作成してください。
 *
 */
public class No005 {
	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<Integer>(5);

		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		array.add(5);

		for(int i = 3; i < array.size(); i++) {
			System.out.println(array.get(i));

		}
	}
}
