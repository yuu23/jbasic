package fundamentals.chapter4.sec5_overload;
/*
 * 2つのint型a,bの最小値、3つのint型abcの最小値を求める以下のメソッドを定義して、
 * mainメソッドで使用するプログラムを作成してください。
 * ・int min(int a,int b)
 * ・int min(int a,int b,int c)
 */
public class No001 {
	public static void main(String[] args) {
		min(1,2);
		min(10,20,30);

	}
	public static void min(int a,int b) {
		System.out.println("最小値は" + Math.min(a, b)); // Math.minは二つしか比較できない
	}

	public static void min(int a,int b,int c) {
		int[] minarray = {a,b,c};
		int min = minarray[0];

		for(int i = 1; i < minarray.length; i++) {
			min = Math.min(min,minarray[i]);
		}
		System.out.println("最小値は" + min);
	}
}

