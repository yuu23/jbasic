package fundamentals.chapter5.sec1_multiarray;
/*
 * int型の2次元配列の作成と初期化をまとめて行い、
 * 配列中の任意の値を表示させるプログラムを作成してください。
 */
public class No002 {
	public static void main(String[] args) {
		int[][] array = {
						{100,200,300},
						{400,500,600},
						{700,800,900}};
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.println("array[" + i + "][" + j + "] = " + array[i][j]);
			}
		}

	}
}