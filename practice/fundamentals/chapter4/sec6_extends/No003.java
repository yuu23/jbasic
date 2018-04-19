package fundamentals.chapter4.sec6_extends;
/*
 * No002のAnimalクラスを継承したDogクラスを作成してください。
 * Dogクラスにはお座りするメソッドを追加してください。
 * mainメソッドでDogクラスをインスタンス化し、犬の名前とお座りしたことを表示させてください。
 */
public class No003 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setName("ポチ");
		dog.setSit();

		System.out.println(dog.getName());
		System.out.println(dog.getSit());

	}
}
class Dog extends Animal{
	String sit;

	String getSit() {
		return this.sit;
	}
	void setSit() {
		this.sit = "お座り";
	}
}
