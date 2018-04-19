package fundamentals.chapter4.sec1_method;
/*
 * 九九のひとつの段を表示するメソッドを作成しなさい。何の段（ 1 ～ 9 ）であるかを引数とします。
 * このメソッドを使用して、九九表を作成してください。
 */
public class No014 {
	public static void main(String[] args) {
	kuku(1);
	kuku(2);
	kuku(3);
	kuku(4);
	kuku(5);
	kuku(6);
	kuku(7);
	kuku(8);
	kuku(9);
	}
	public static int kuku(int x) {
		for(int i = 0; i < 9; i++) {
				int k = (i + 1) * x;
				if(k < 10) {
					System.out.print(" " + k);
				}else {
					System.out.print(" " + k);
				}
			}		System.out.println();
					return x;
	}
}