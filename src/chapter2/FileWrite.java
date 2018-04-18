package chapter2;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileWrite {
	public static void main(String[] args) throws IOException{
		// ファイル取得
		Path path = Paths.get("c:\\training\\write.txt");
		BufferedWriter bw = Files.newBufferedWriter(path);

		// ファイルへ文字列の書き出し
		bw.write("こんにちは");
		bw.close();

		// この書き方でもOK
		BufferedWriter writer = Files.newBufferedWriter(Paths.get("c:\\training\\write2.txt"));

		writer.write("あいうえお");
		writer.newLine(); // 改行
		writer.write("かきくけこ");
		writer.close();

	}
}
