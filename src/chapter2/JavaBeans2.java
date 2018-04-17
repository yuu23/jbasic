package chapter2;

public class JavaBeans2 {
	public static void main(String[] args) {
		Pojo data  = new Pojo();
		data.setName("田中");


		String name = data.getName();
		System.out.println(name);
	}
}