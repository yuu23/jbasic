package fundamentals.chapter4.sec2_class;
/*
 * No004クラスとは別に以下内容で本クラスを作成してください
 * また、mainメソッドから本クラスのオブジェクトを1つ生成してそれぞれの本の情報を表示するプログラムを作成してください。
 *
 * <フィールド>
 * ・本のタイトル
 * ・著者
 * ・価格
 *
 * <メソッド>
 * ・本のタイトル取得
 * ・著者情報取得
 * ・価格取得
 *
 */
class Book {
	String title;
	String writer;
	int price;

	public String title(String title) {
		this.title = title;
		return title;
	}
	public String writer(String writer) {
		this.writer = writer;
		return writer;
	}
	public int price(int price) {
		this.price = price;
		return price;
	}
}
class No004 {
	public static void main(String[] args) {
		Book book = new Book();

		String title = "また同じ夢を見ていた";
		String writer = "住野よる";
		int price = 1512;

		System.out.println("本のタイトル : " + title);
		System.out.println("著者名       : " + writer);
		System.out.println("価格         : " + price + "円");
	}
}