package fundamentals.chapter2.sec5_for;
/*
 * 次のように画面に表示するプログラムをfor文を使って作成してください。
 *  *
 *  **
 *  ***
 *  ****
 *  *****
 */
public class No007 {
	public static void main(String[] args) {
		String[] ar = {"*","**","***","****","*****"};
		for(String s : ar) {
			System.out.println(s) ;
		}
	}
}

