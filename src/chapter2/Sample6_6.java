package chapter2;

public class Sample6_6 {
	public static void main(String[] args) {
		int x = 15;
		DataAccess da = new DataAccess();

		assert da.dataIsAccesible():"Dara is not acceptable";

		System.out.println("Value of x:" + x);
	}
}
class DataAccess {
	public boolean dataIsAccesible() {
		return false; // trueにするとエラーは出ない
	}
}
