package fundamentals.chapter4.sec1_method;
/*
 * 2つの整数の足し算を行うメソッドと引き算を行うメソッドを作成してください。
 * 足し算を行った結果と任意の数値を引き算メソッドに使用して、結果を表示させるプログラムを作成してください。
 */
public class No017 {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		addMethod(x,y);

		// 足し算メソッドの結果
		int add = addMethod(x,y);
		// 引き算メソッドに結果を渡す
		subMethod(add);
	}

	public static int addMethod(int add1,int add2) {
		int add3 = add1 + add2;
		return add3;
	}

	public static void subMethod(int addReceive) {
		int sub = 12;
		System.out.println(addReceive - sub);
	}

}
