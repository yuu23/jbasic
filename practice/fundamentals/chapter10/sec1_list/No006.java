package fundamentals.chapter10.sec1_list;

import java.util.ArrayList;

/*
 * 次の社員クラスをインスタンス化した際にコンストラクタで名前と年齢を設定して3人の社員を作成してください。
 * また、作成した社員をArrayListに格納し、for文を使用して名前と年齢を出力するプログラムを作成してください。
 */
public class No006 {
	public static void main(String[] args) {
		Employee employee1 = new Employee("田中",26);
		Employee employee2 = new Employee("佐藤",27);
		Employee employee3 = new Employee("茂野",18);

		ArrayList<Employee> array = new ArrayList<Employee>();

		array.add(employee1);
		array.add(employee2);
		array.add(employee3);

		for(Employee employee : array) {
			System.out.print("社員名:" + employee.getName() + "     ");
			System.out.println("年齢:" + employee.getAge());
		}

	}
}

class Employee {
	String name;  // 名前
	int age;         // 年齢

	// コンストラクタ
	Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// getter/setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
