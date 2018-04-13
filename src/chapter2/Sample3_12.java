package chapter2;

class Staff0v { // スーパークラス
	String name = "名無し";
	String getName() {
		return name;
	}
}
class Manager0v extends Staff0v { //サブクラス
	int salay = 5000000;
	int getSalay() {
		return salay;
	}
	String getName() { // オーバーライド
		return "【マネージャー】" + name;
	}
}
class Sample3_12 {
	public static void main(String[] args) {
		Staff0v s1 = new Staff0v();
		System.out.println("----- スーパークラス -----");
		System.out.println("名前 : " + s1.getName()); // スーパークラスで定義したメソッド

		System.out.println();
		Manager0v m1 = new Manager0v();
		System.out.println("----- サブクラス -----");
		System.out.println("名前 : " + m1.getName()); // サブクラスで定義したメソッド
		System.out.println("給与 : " + m1.getSalay());
	}
}