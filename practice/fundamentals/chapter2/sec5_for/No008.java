package fundamentals.chapter2.sec5_for;
/*
 * 3の倍数の時に「hoge」、5の倍数の時に「huga」と表示するプログラムを作成してください。
 */
public class No008 {
	public static void main(String[] args) {
		for(int i = 0; i <= 10; i++) {
			if(i % 3 == 0) {
				System.out.println("hoge");
			}else if(i % 5 == 0) {
				System.out.println("huga");
			}
		}
	}
}
