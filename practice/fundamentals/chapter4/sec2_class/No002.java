package fundamentals.chapter4.sec2_class;
/*
 * No002とは別に「車」を表すクラスを定義してください。
 * フィールドやメソッドは任意に必ず1つ以上は定義するようにしてください。
 * また、No002クラスのmainメソッド内で車クラスをインスタンス化し、定義したメソッドを使用してみてください。
 */
class Car {
	String name;
	int age;
		void Disp() {
			System.out.println(name + "は" + age + "年代の車です。");
		}
}
class No002 {
	public static void main(String[] args) {
		Car c = new Car();
		c.name = "RX-7 FD";
		c.age = 90;
		c.Disp();
	}
}
