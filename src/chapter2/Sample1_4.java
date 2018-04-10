package chapter2;

public class Sample1_4 {
	public static void main(String[] args) {
		int[] intArray = new int[5];

		intArray[0] = 12;
		intArray[1] = 3;
		intArray[2] = 28;
		intArray[3] = 427;
		intArray[4] = 33;

		System.out.println("intArray[0]の値は" + intArray[0] + "です。");
		System.out.println("intArray[1]の値は" + intArray[1] + "です。");
		System.out.println("intArray[2]の値は" + intArray[2] + "です。");

		String[] sarray = { "One","Two","Three" };

		System.out.println("sarray[0]の値は" + sarray[0] + "です。");
		System.out.println("sarray[1]の値は" + sarray[1] + "です。");
		System.out.println("sarray[2]の値は" + sarray[2] + "です。");

		int len = sarray.length;

		System.out.println("配列sarrayの要素の数は" + len + "です。");
	}
}
