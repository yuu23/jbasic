package fundamentals.chapter8.sec1_stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*
 * No001で作成した「test2.txt」を文字列として読み込んで画面に表示するプログラムを作成してください。
 */
public class No002 {
	public static void main(String[] args) throws IOException {


		File file = new File("c://training//chapter8_no1.txt");
		FileReader fileReader = new FileReader(file);
		BufferedReader br = new BufferedReader(fileReader);

		String str = br.readLine();
		System.out.println(str);
	}
}
