package chapter2;

import java.util.ArrayList;
import java.util.List;

public class ListSample {
	public static void main(String[] args) {
		// リストコレクション生成
		List<String> list = new ArrayList<String>();

		// リストへの値格納
		list.add("りんご");
		list.add("ごりら");
		list.add("らっぱ");

		// リストへのサイズ取得
		System.out.println("コレクションのサイズ :" + list.size());

		//リストへの出力
		System.out.println(list);


		// for文による取り出し
		for(String s : list) {
			System.out.print(s);
			System.out.print("→");
		}
	}
}
