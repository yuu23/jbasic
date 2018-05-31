package fundamentals.chapter7.sec3_throws;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 * 	次のプログラムは例外処理がないためコンパイルエラーとなります。
 * throwsキーワードを使用して例外処理を呼び出し元に任せるようにしてください。
 */
public class No001 {
	public static void main(String[] args) throws ArithmeticException, FileNotFoundException {
		File file = new File("c:\\training\\test.txt");
		FileInputStream fs = new FileInputStream(file);
	}
}
