package chapter2;

class Staff { // スーパークラス
	String name = "名無し"; // フィールド
	String getName() { // メソッドを定義
		return name;
	}
}

class Manager extends Staff { // サブクラス
	int salay = 5000000;
	int getSalay() {
		return salay;
	}
}
class Sample3_11 {
	public static void main(String[] args) {
		Manager m1 = new Manager(); // サブクラスのインスタンス化
		System.out.println("名前 : " + m1.getName()); // スーパークラスで定義したメソッドの呼び出し
		System.out.println("給与 : " + m1.getSalay()); // サブクラスで定義したメソッドの呼び出し
	}
}
