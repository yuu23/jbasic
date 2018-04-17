package fundamentals.chapter4.sec2_class;
/*
 * No003クラスとは別に、四角形を表すクラスを定義してください。
 * フィールドに縦と横の長さをint型で持つようにします。
 * メソッドとして面積を返すメソッドを定義してください。
 * No003クラスのmainメソッドで四角形クラスをインスタンス化し、面積を表示させるプログラムを作成してください。
 */
class  Quadrangle {
	int length;
	int side;

	void Disp() {
		System.out.println(length * side);
	}
}
public class No003 {
	public static void main(String[] args) {
		Quadrangle q = new Quadrangle();
		q.length = 5;
		q.side = 5;
		q.Disp();
	}
}