package chapter2;

class Trainer {
	String name;
	int age;

	Trainer() { //コンストラクタの定義
		name = "名無し";
		age = 0;
	}
	Trainer(String n,int a) { // コンストラクタのオーバーロード
		name = n;
		age = a;
	}
}
class Sample3_10 {
	public static void main(String[] args) {

		// 名無しオブジェクトをインスタンス化
		Trainer s1 = new Trainer();

		// 田中さんオブジェクトをインスタンス化
		Trainer s2 = new Trainer("田中さん",30);

		// 名前を表示
		System.out.println("名前 : " + s1.name +  " 年齢 : " + s1.age);
		System.out.println("名前 : " + s2.name +  " 年齢 : " + s2.age);
	}
}
