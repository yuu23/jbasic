package fundamentals.chapter10.sec2_map;

import java.util.HashMap;

/*
 * HashMapを使用してキーと値を代入し、キーに対応して値を1つ取得して表示するプログラムを作成してください。
 */
public class No001 {
	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<String,String>();

		map.put("コーヒー","美味しい");

		System.out.println(map.get("コーヒー"));

	}

}
