package fundamentals.chapter2.sec7_switch;
/*
 * 0~6の数字を入力すると、その数字に対応した曜日が出力されるプログラムを作成してください。
 * 0~6のどの数字にどの曜日が対応するかは任意とする。
 */
public class No002 {
	public static void main(String[] args) {
		int day = 5;

		switch(day) {

		case 0:
			System.out.println("日曜日");
			break;

		case 1:
			System.out.println("月曜日");
			break;

		case 2:
			System.out.println("火曜日");
			break;

		case 3:
			System.out.println("水曜日");
			break;

		case 4:
			System.out.println("木曜日");
			break;

		case 5:
			System.out.println("金曜日");
			break;

		case 6:
			System.out.println("土曜日");
			break;
		}
	}
}
