	package fundamentals.chapter10.sec1_list;

import java.util.ArrayList;
import java.util.List;

/*
 * 次のメソッドを作成してください。
 *
 * <メソッド>
 * 引数：List<Integer>
 * 戻り値：List<String>
 * 処理：引数で受け取ったデータに任意の文字列を足す
 *
 * 作成したメソッドを使用後、コレクション内のデータを1つずつ表示するプログラムを作成してください。
 */
public class No007 {
	public static void main(String[] args) {

		// Integer型のList作成
		List<Integer> iList = new ArrayList<Integer>();
		iList.add(1);
		iList.add(2);
		iList.add(3);

		// methodメソッドに値を渡して返される処理
		method(iList);
		List<String> iList2 = method(iList);

		System.out.println(iList2.get(0));
	}

	public static List<String> method(List<Integer> iListReceive){

		ArrayList<String> list = new ArrayList<String>();
		for(Integer ilr : iListReceive) {
			list.add(ilr + "あ");
		}
		return list;
	}
}
