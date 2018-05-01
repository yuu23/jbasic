package fundamentals.chapter0;
/*
 * 電話の抽象クラスを作成し、それを継承したiPhoneクラスとAndroidクラスを作成してください。
 * 電話の抽象クラス内で1つ以上のabstractメソッドを定義し、iPhone、Android側でオーバーライドしてください。
 * また、iPhone、Androidクラスでそれぞれ1つ以上オーバーライドしたメソッドを定義してください。
 * 最後にmainメソッドでそれぞれに定義したメソッドを使用して画面に出力するプログラムを作成してください。
 */
public class No003 {
	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		Android android = new Android();

		System.out.print("iphoneのが「" + iphone.price + "」であるのに対し、");
		System.out.print("Andoroidのは「" + android.price + "」である。");
	}
}

abstract class AbsPhone{
	abstract String getPrice();
}

class Iphone extends AbsPhone{
	String price = "高価格";
	String getPrice() {
		price = "高価格";
		return price;
	}
}

class Android extends AbsPhone{
	String price = "低価格";
	String getPrice() {
		return price;
	}
}