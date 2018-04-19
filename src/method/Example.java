package method;

public class Example {
	public static void main(String[] args) {
		人間 人 = new 人間();
		人.喉乾いた();
	}
}
class 自動販売機{
	String drink;

	void setDrink(String drink) {
		this.drink = drink;
	}

	String buy() {     // 買ってくれたらdrinkを返す
		return drink;

	}
}
class 人間 {
	void 喉乾いた() {							// 自動販売機が欲しい
		自動販売機 自販機 = new 自動販売機();  // 自動販売機を見つけた
		自販機.setDrink("コーラ");     // 自動販売機で何かしらのdrinkが出てくる（retrun drink;）and boxに入れてあげる

	}

}