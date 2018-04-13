package chapter2;

class StaffTh{
	String name = "名無し"; // ⑥の処理が終わった段階で、ここのnameは田中になっている
	void setName(String name) {
		System.out.println("name = " + name); // ④田中引数のnameを出力
		System.out.println("this.name = " + this.name); // ⑤this.nameはクラス内のnameなので、String name = "名無し"を代入
		this.name = name; // ⑥name名無しに対して、田中引数を代入
	}
}
class Sample3_16 {
	public static void main(String[] args) {
		StaffTh s1 = new StaffTh(); //①スタッフクラスをインスタンス化、デフォルトコンストラクタが暗黙的に実行
		System.out.println("----メソッド呼び出し----"); // ②出力
		s1.setName("田中"); // ③setNameというメソッドを呼び出し、田中は引数。
							// 上のnameという変数に代入
	}
}