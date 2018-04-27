package fundamentals.chapter10.sec1_list;

import java.util.ArrayList;

/*
 * 次のBookをインスタンス化した際にコンストラクタでタイトルと価格を設定して3冊の本を作成してください。
 * ただし、今回はArrayListのaddメソッド内でコンストラクタを呼び出すようにしてください。
 * その後、3冊のタイトルと価格を出力するプログラムを作成してください。
 */
public class No005 {
	public static void main(String[] args) {
		ArrayList<Book> array = new ArrayList<Book>(3);

		array.add(new Book("また同じ夢を見ていた",1512));
		array.add(new Book("君のために今は回る",1512));
		array.add(new Book("人間失格",302));

		for(Book b : array) {
			System.out.print(b.getTitle() + ":");
			System.out.println(b.getPrice() + "円");
		}
	}
}

class Book {
	String title;    // タイトル
	int price;       // 価格

	// コンストラクタ
	Book(String title, int price) {
		this.title = title;
		this.price = price;
	}

	// getter/setter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}