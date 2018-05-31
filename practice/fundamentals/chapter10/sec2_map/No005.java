package fundamentals.chapter10.sec2_map;

import java.util.HashMap;

/*
 * Mapクラスを使用してキーに国名（日本語）、対応する値に国名（英語）を入れてください。
 * その後、キーに対する値を取得して表示させるプログラムを作成してください。
 */
public class No005 {
	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<String,String>();

		map.put("日本", "Japan");

		System.out.println(map.get("日本"));
	}
}