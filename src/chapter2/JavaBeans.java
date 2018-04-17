package chapter2;

public class Pojo implements java.io.Serializable { // serializable＝可能？
	private String name;				// フィールドの宣言はprivate

	public Pojo() {}					// コンストラクタ（デフォルト）
	public Pojo(String name) {			// コンストラクタ（オバーロード）
		this.name = name;
	}

	/* アクセス用関数(setter/getter) */
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
}
