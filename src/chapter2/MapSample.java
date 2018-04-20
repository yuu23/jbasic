package chapter2;

import java.util.HashMap;
import java.util.Map;

public class MapSample {
	public static void main(String[] args) {
		// マップコレクションの生成
		Map<Integer,String> map = new HashMap<Integer,String>();

		// マップへのキーと値格納
		map.put(1, "カレー");
		map.put(2, "うどん");
		map.put(1, "オムライス");

		// マップのサイズ取得
		System.out.println("コレクションのサイズ :" + map.size());
		// マップの出力
		System.out.println(map);

		// for文による取り出し(値のみ)
		for(String value : map.values()) {
			System.out.println(value);
		}

		// for文による取り出し(キーと値)
		for(Map.Entry<Integer,String> entry : map.entrySet()) {
			System.out.println("キー :" + entry.getKey() + ",値" + entry.getValue());
		}
	}
}
