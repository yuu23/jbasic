package fundamentals.chapter10.sec2_map;

import java.util.HashMap;

/*
 * HashMapを使用してキーに文字列、値に数値を代入してコレクションを作成してください。
 * その後、任意のキーを指定して値を取得して表示するプログラムを作成してください。
 */
public class No003 {
	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<String,Integer>();

		map.put("いち", 1);

		System.out.println(map.get("いち"));
	}
}
