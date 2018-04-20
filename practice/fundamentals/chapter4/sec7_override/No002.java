package fundamentals.chapter4.sec7_override;

/*
 * Bookクラスを継承した漫画クラス、小説クラス、雑誌クラスを作成してください。
 * showPriceメソッドをオーバーライドして、それぞれ以下の価格で表示されるようにメソッド内の処理を書き換えてください。
 * 最後に、mainメソッド内でそれぞれの価格を表示させてください。
 *
 * <価格設定>
 * 漫画：Bookの価格 - 200
 * 小説：Bookの価格 - 100
 * 雑誌：Bookの価格 + 100
 */
public class No002 {
	public static void main(String[] args) {
		Book book = new Book();
		System.out.println("本の価格は" + book.showPrice() + "円です");

		Manga manga = new Manga();
		System.out.println("漫画の価格は" + manga.showPrice() + "円です");

		Novel novel = new Novel();
		System.out.println("小説の価格は" + novel.showPrice() + "円です");

		Magazine magazine = new Magazine();
		System.out.println("雑誌の価格は" + magazine.showPrice() + "円です");
	}
}

class Book {
	int price = 500;  // 価格
	int showPrice() {
		return price;
	}
}
class Manga	 extends Book{
	int showPrice() {
		int mangaPrice = 300;
		price = mangaPrice;
		return mangaPrice;
	}
}
class Novel extends Book{
	int showPrice() {
		int novelPrice = 400;
		price = novelPrice;
		return novelPrice;
	}
}
class Magazine extends Book{
	int showPrice() {
		int magazinePrice = 600;
		price = magazinePrice;
		return magazinePrice;
	}
}