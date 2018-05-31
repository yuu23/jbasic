package fundamentals.chapter10.sec2_map;

import java.util.HashMap;

/*
 * 2つの引数（int key , String value）を持つメソッドputMapを作成してください。
 * 引数で受け取った値は、HashMapクラスを使用して格納して戻り値として返すようにしてください。
 * mainメソッド内でそのメソッドを使用し、最後に値を表示するプログラムを作成してください。
 */
public class No006 {
	public static void main(String[] args) {

		// 引数に渡す値
		int key = 1;
		String value = "いち";

		// 引数を渡して返ってくる処理
		putMap(key,value);

		// 返ってきた値を使えるようにする処理
		HashMap<Integer,String> map2 = putMap(key,value);

		// 返されたHashMapを使用し、表示
		System.out.println(map2.get(1));
	}


	public static HashMap<Integer,String> putMap(Integer key,String value) {

		// メインメソッドから値を受け取り、HashMapに格納
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(key, value);

		return map;
	}
}

