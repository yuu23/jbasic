package fundamentals.chapter4.sec7_override;

/*
 * ユーザクラスを継承した一般ユーザクラスと管理者クラスを作成し、showメソッドをオーバーライドしてください。
 * また、オーバーライドしたshowメソッド内でidとnameに任意の値を代入するように修正してください。
 * 最後に、mainメソッド内でそれぞれのクラスをインスタンス化し、showメソッドを実行するプログラムを作成してください。
 */
public class No003 {
	public static void main(String[] args) {
		GeneralUser g = new GeneralUser();
		Manager1 m = new Manager1();

		g.show();
		m.show();
	}
}

class User {
	String name;
	int id;
	void show() {
		System.out.println("ユーザID：" + id + "ユーザ名：" + name);
	}
}
class GeneralUser extends User {
	void show() {
		name = "田中";
		id = 002;
		System.out.println("ユーザID：" + id + "ユーザ名：" + name);
	}
}
class Manager1 extends User {
	void show() {
		name = "佐藤";
		id = 001;
		System.out.println("ユーザID：" + id + "ユーザ名：" + name);
	}
}