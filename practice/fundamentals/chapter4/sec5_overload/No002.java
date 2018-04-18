package fundamentals.chapter4.sec5_overload;
/*
 * 同一の名前を持つメソッドを定義し、それぞれ任意の処理をするプログラムを作成してください。
 */
public class No002 {
	public static void main(String[] args) {
		fruits("リンゴ");
		fruits("バナナ","ピーチ");

}
	public static String fruits(String a) {
		System.out.println(a);
		return a;
	}
	public static String fruits(String a,String b) {
		System.out.print(a + "、");
		System.out.println(b);
		return a + b;
	}
}