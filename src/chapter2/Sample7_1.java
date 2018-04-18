package chapter2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Sample7_1 {
	public static void main(String[] args) {
		Path p = Paths.get("C:\\training\\test.txt");


		try {
			FileInputStream s = new FileInputStream(p.toFile());

			int contents;
			while((contents = s.read()) != -1) {
//			while((contents) = s.read()) != -1) {
				System.out.println(contents);
			}


		s.close();
		}catch(FileNotFoundException e) {
			// TODO 自動生成された catchブロック
		e.printStackTrace();
		}catch(IOException e) {
			// TODO 自動生成された catchブロック
		e.printStackTrace();
		}finally {
	}
}
}