package fundamentals.chapter0;

/*
 * 次の従業員クラスを作成し、コンストラクタで名前と入社日を設定できるようにしてください。
 * mainメソッド内で3人の従業員を生成し、それぞれの名前と入社日を出力するプログラムを作成してください。
 * <フィールド>
 * ・名前
 * ・入社日
 */
public class No004 {
	public static void main(String[] args) {
		Staff staff1 = new Staff("前田","2018/4/2");
		Staff staff2 = new Staff("赤星","2018/5/2");
		Staff staff3 = new Staff("赤城","2018/6/2");

		System.out.println("名前:" + staff1.name + "  入社日:" +staff1.date);
		System.out.println("名前:" + staff2.name + "  入社日:" +staff2.date);
		System.out.println("名前:" + staff3.name + "  入社日:" +staff3.date);

	}
}
class Staff{
	String name;
	String date;
	Staff(String name,String date){
		this.name = name;
		this.date = date;
	}
}