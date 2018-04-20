package fundamentals.chapter4.sec6_extends;
/*
 * 好きなスーパークラスと、そのスーパークラスを継承したサブクラスを作成してください。
 * また、それぞれに好きなフィールドとメソッドを追加してください。
 * 最後にNo004クラスのmainメソッドでサブクラスをインスタンス化して処理を実行するプログラムを作成してください。
 */
public class No004 {
	public static void main(String[] args) {
		BaseBall b = new BaseBall();
		b.setName("陸上");
		b.setRun("走る");
		System.out.println(b.getName() + "は" + b.getRun() + "競技だ");

		b.setName("野球");
		b.setOffence("打撃");
		b.setDefense("守備");
		System.out.println(b.getName() + "は" + b.getRun() + "だけでなく、" + b.getOffence() + "・" + b.getDefense() + "も必要な競技だ");



	}
}
class Sports {
	String name;
	String run;

	String getName() {
		return this.name;
	}
	void setName(String name) {
		this.name = name;
	}
	String getRun() {
		return this.run;
	}
	void setRun(String run) {
		this.run = run;
}
}
class BaseBall extends Sports{
	String offence;
	String defense;


	String getOffence() {
		return this.offence;
	}
	void setOffence(String offence) {
		this.offence = offence;
	}

	String getDefense() {
		return this.defense;
	}
	void setDefense(String defense) {
		this.defense = defense;
	}
}