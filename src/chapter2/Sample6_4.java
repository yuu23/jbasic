package chapter2;
/*
 * throwのサンプル
 */
public class Sample6_4 {
	public static void main(String[] args) {
		double x = 15.0;
		double y = 0.0;
		try {
			Sample6_4 obj = new Sample6_4(); // インスタンス化（19行目のdoubleを使いたいため）
			double z = obj.doubleDivide(x,y); // ここの段階で下のif文の処理が完了されるので
			System.out.println("x / y:" + z);  // ここの文は処理されない
		}catch (ArithmeticException ae) {
			System.out.println("An exception occurred."); // ここ実行
			System.out.println(ae);
		}
		System.out.println("x - y:" + (x - y));
	}
	double doubleDivide(double x,double y) {
		if(y == 0.0) {
			throw new ArithmeticException(
				"Integer or not, please do not divide by zero!"); // エラーメッセージを明示的に作成
		}else {
			return x / y;
		}
	}
}
