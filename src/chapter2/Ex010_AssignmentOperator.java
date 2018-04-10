package chapter2;

public class Ex010_AssignmentOperator {
	public static void main(String[] args) {
			// 代入演算子
			int num;
			num = 5;

			// 複合演算子
			num += 2;
			System.out.println(num); // num = 7

			num -= 3;
			System.out.println(num); // num = 4

			num *= 2;
			System.out.println(num); // num = 8

			num /= 2;
			System.out.println(num); // num = 4

			num %= 3;
			System.out.println(num); // num = 1
	}
}
