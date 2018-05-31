package fundamentals.chapter10.sec2_map;

import java.util.HashMap;

/*
 * HashMapを作成し、任意のキーと値を代入してください。
 * その後、コレクションのサイズを取得して表示させるプログラムを作成してください。
 */
public class No004 {
	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<Integer,String>();

		map.put(1, "いち");
		map.put(2,"に");
		map.put(4,"よん");

		System.out.println(map.size());

	}
}
