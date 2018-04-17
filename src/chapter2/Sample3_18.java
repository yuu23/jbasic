package chapter2;

interface Work {
	void met1(); // メソッド定義
}
class WorkImp implements Work { // 上のworkを実装
	@Override
	public void met1() {        // public必須
		System.out.println("事務処理");
	}
	public void met2() {
		System.out.println("外回り"); // ここの二行に関しては暗黙的な型変換はできない
	}
}
class Sample3_18 {
	public static void main(String[] args) {
		Work w1 = new WorkImp(); // workを実装したWorkImpをインスタンス化
		w1.met1();                // met1を呼んで実行(暗黙的な型変換)
		// w1.met2(); コンパイルエラー
		WorkImp wi1 = (WorkImp)w1; // 17行目のWork型のw1を、WorkImp型のw1に変換（明示的型変換）
		wi1.met2(); // 呼び出し実行
	}
}