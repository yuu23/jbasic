package fundamentals.chapter5.sec1_multiarray;
/*
 * int型の2次元配列を作成し、それぞれ任意の値を代入してください。
 * また、配列中の任意の値を表示させるプログラムを作成してください。
 * ※2次元配列の要素数は任意とする。
 */
public class No001 {
	public static void main(String[] args) {
		int [][] array;
		array = new int[2][3];

		array[0][0] = 5;
		array[0][1] = 20;
		array[0][2] = 13;
		array[1][0] = 6;
		array[1][1] = 7;
		array[1][2] = 50;

		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.println("array[" + i + "][" + j + "] =" + array[i][j]);
			}
		}


	}
}
