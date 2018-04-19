package fundamentals.chapter4.sec6_extends;
/*
 * Animalクラスを継承したcatクラスを作成してください。
 * また、Catクラスには、鳴き声のフィールドを作成し、ニャーとなくメソッドを定義してください。
 * mainメソッドでCatクラスをインスタンス化して、猫の名前と「ニャー」を表示させるプログラムを作成してください。
 */
public class No002 {
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.setVoice();
		cat.setName("田中");

		System.out.println(cat.getName());
		System.out.println(cat.getVoice());
	}
}

class Animal { //スーパークラス
	String name;

	String getName() {
		return this.name;
	}

	void setName(String name) {
		this.name = name;
	}
}
class Cat extends Animal { // サブクラス

	String voice;

	String getVoice() {
		return this.voice;
	}
	void setVoice() {
		this.voice = "ニャー";
	}
}