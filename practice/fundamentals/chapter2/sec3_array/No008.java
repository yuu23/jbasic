package fundamentals.chapter2.sec3_array;
/*
 * 7,12,37,24,2,92,51を要素に持つ配列を生成し、
 * for文を使用してすべての要素を表示させるプログラムを作成してください。
 */
public class No008 {
	public static void main(String[] args) {
		int[] array = {7,12,37,24,2,92,51};

		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
