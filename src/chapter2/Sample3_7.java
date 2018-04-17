package chapter2;

abstract class AbsStaff { //abstractクラス宣言
	String name = "名無し"; // 通常のメソッドの定義も可能
	String getName() {
		return name; // this.nameでもok
	}
	abstract int getSalary(); // abstractメソッド
}
class ManagerAbs extends AbsStaff { //abstractクラスを継承したサブクラス
	int salary = 5000000;
	@Override
	int getSalary() { // abstractメソッドを実装
		return salary;
	}
	@Override
	String getName() {
		return"【マネージャー】" + super.getName(); // 上のスーパークラスのgetNameを返している
	} // ここは抽象クラスとは関係ないので、オーバーライドしなくても可
}
class Sample3_7{
	public static void main(String[] args) {
		ManagerAbs m1 = new ManagerAbs(); // インスタンス化（引数無しのコンストラクタが呼ばれる）
		System.out.println("名前 : " + m1.getName()); // 18行目を指している
		System.out.println("給与 : " + m1.getSalary());
	}
}