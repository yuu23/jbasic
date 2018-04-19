package fundamentals.chapter4.sec1_method;
/*
 * キーボード入力により受け取った値が負であれば「-1」を返し、
 * 0であれば「0」、正であれば「1」を返すメソッド「signOf」を作成してmainメソッド内で使用してください。
 */
public class No007 {
	public static void main(String[] args) {

		System.out.println(signOf(10));

	}
	public static int signOf(int x) {
		if(x <= 0) {
			x = -1;
		}else if(x == 0) {
			x = 0;
		}else {
			x = 1;
		}
		return x;
	}
}
