package fundamentals.chapter0;
/*
 * mainメソッド内にローカルクラスを作成し、その中に「Hello」を画面に表示させるプログラムを作成してください。
 */
public class No005 {
	public static void main(String[] args) {
		class Hello{
			private String hello = Hello.class.getSimpleName();
			public Hello(){
				System.out.println(hello);
			}
		}
		new Hello();
	}
}