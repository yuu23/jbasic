package chapter2;

class StaffTs{
	StaffTs(){ // 引数なしコンストラクタ
		this("佐藤"); // コンストラクタのすぐ下に書かなければならない
	}
	StaffTs(String name) { // 引数ありコンストラクタ
		System.out.println("名前 : " + name);
	}
	void methodM1() {
		System.out.println("メソッドM1");
	}
	void methodM2() {
		this.methodM1();
		System.out.println("メソッドM2"); // thisというのは、このクラスという意味
	}
}
class Sample3_15 {
	public static void main(String[] args) {
		System.out.println("-----コンストラクタ呼び出し-----");
		StaffTs s1 = new StaffTs();
		System.out.println("----メソッド呼び出し----");
		s1.methodM2();
	}
}