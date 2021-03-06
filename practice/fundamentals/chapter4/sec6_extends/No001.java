package fundamentals.chapter4.sec6_extends;
/*
 * No001クラスにBookクラスを継承してください。
 * また、No001クラス内でsetTitleメソッドを使用して本のタイトルを設定後、
 * getTitleメソッドを使用して設定した本のタイトルを出力するプログラムを作成してください。
 */
public class No001 extends Book { // サブクラス
	public void setTitle(/*String title*/) {
		this.title = "星の王子様";
	}

	public String getTitle() {
		return this.title;
	}



	public static void main(String[] args) {
		No001 book = new No001();
		book.setTitle();
		System.out.println(book.title);
	}


}

class Book { // スーパークラス
	String title;

	public String getTitle() {
		return this.title;
	}

	public void setTitle(/*String title*/) {
		this.title = title;
	}
}
