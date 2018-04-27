package fundamentals.chapter10.sec1_list;

import java.util.ArrayList;

/*
 * ArrayListに数値を代入し、出力するプログラムを作成してください。
 */
public class No002 {
	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<Integer>(3);

		array.add(2);
		array.add(3);
		array.add(4);

		for(int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}
	}
}
