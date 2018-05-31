package fundamentals.chapter10.sec2_map;

import java.util.HashMap;

/*
 * HashMapを使用してキーに整数、値に文字列を代入してコレクションを作成してください。
 * その後、任意のキーを指定して値を取得して表示するプログラムを作成してください。
 */
public class No002 {
	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<Integer,String>();

		map.put(1, "いち");

		System.out.println(map.get(1));
	}
}
