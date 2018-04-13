package fundamentals.chapter4.sec1_method;
/*
 * int型の「年」「月」「日」を受け取り「XXXX年XX月XX日」という形式の日付を出力するメソッドを定義してください。
 * mainメソッドからそのメソッドを使用していくつか日付を表示させてください。
 */
public class No003 {
	public static void main(String[] args) {
	int year,month,day;

	ymd(2018,1,6);
	ymd(2017,12,1);
	ymd(2001,4,2);
}
	public static void ymd(int year,int month,int day) {

		System.out.println(year + "年" + month + "月" + day + "日");
	}
}
