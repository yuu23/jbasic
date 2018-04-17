package chapter2;


import java.util.ArrayList; // インポート宣言


public class Sample4_3 {
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>(3); // 配列の宣言

		array.add("田中"); // 値の追加(addメソッド使用)
		array.add("鈴木");
		array.add("高橋");

		System.out.println(array.get(1)); // 値の取り出し
	}
}
