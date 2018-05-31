package fundamentals.chapter8.sec1_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/*
 * cドライブのtrainingディレクトリ内に任意の文字列を記述した「test1.txt」ファイルを作成し、
 * No001クラス内でtest1.txtないに記載された内容をバイト単位で読みこんで画面に表示するプログラムを作成してください。
 */
public class No001 {
	public static void main(String[] args) throws IOException {


		File file = new File("c://training//chapter8_no1.txt");
		FileInputStream fis = new FileInputStream(file);
		byte[] buff = new byte[20];

		fis.read(buff,0,10);

		for(int i=0; i < buff.length; i++) {
			System.out.println(i + "番目" + buff[i]);
		}
	}
}
