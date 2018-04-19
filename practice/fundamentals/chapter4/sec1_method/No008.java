package fundamentals.chapter4.sec1_method;
/*
 * 3つのint型引数a,b,cの最小値を求めるメソッド「min」を作成して、
 * mainメソッド内で結果を表示させるプログラムを作成してください。
 */
public class No008 {
	public static void main(String[] args) {

		System.out.println(min(1,2,3));

	}
	public static int min(int a,int b,int c) {
		int[] minarray = {a,b,c};
		int min = minarray[0];

		for(int i = 1; i < minarray.length; i++) {
			min = Math.min(min,minarray[i]);
		}
		return min;
	}
}
