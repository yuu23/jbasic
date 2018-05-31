package fundamentals.chapter0;

import java.util.ArrayList;

/*
 * 買い物リストクラスを作成し、「No」と「名称」と「価格」をメンバ変数に持たせ、コンストラクタで各メンバ変数の値を設定するようにしてください。
 * また、メソッドには各メンバの値を設定するメソッド（setter）と、取得するメソッド（getter）を作成してください。
 * No011クラスで買い物リストを完成させ、100円以上のものと100円より下のもので分けて表示するようにしてください。
 */
public class No011 {
	public static void main(String[] args) {
		ShopList shopList1 = new ShopList(1,"チョコ",216);
		ShopList shopList2 = new ShopList(2,"コーヒー",108);
		ShopList shopList3 = new ShopList(3,"うまい棒",10);
		ShopList shopList4 = new ShopList(4,"ビール",324);
		ShopList shopList5 = new ShopList(5,"チョコバット",20);
		ShopList shopList6 = new ShopList(6,"ビーフジャーキー",540);

		ArrayList<ShopList> array = new ArrayList<ShopList>(6);

		array.add(shopList1);
		array.add(shopList2);
		array.add(shopList3);
		array.add(shopList4);
		array.add(shopList5);
		array.add(shopList6);

//		System.out.println(array.get(0).getNumber());

		System.out.println("---100円以下の商品---");
		for(int i = 0; i < array.size(); i++) {
			if(array.get(i).getPrice() <= 100) {
				System.out.print("【No】:" + array.get(i).getNumber());
				System.out.print("  【名称】:" + array.get(i).getName());
				System.out.print("  【価格】:" + array.get(i).getPrice() + "円");
				System.out.println();
			}
		}

		System.out.println("---100円以上の商品---");
		for(int i = 0; i < array.size(); i++) {
			if(array.get(i).getPrice() >= 100) {
				System.out.print("【No】:" + array.get(i).getNumber());
				System.out.print("  【名称】 :" + array.get(i).getName());
				System.out.print("  【価格】:" + array.get(i).getPrice() + "円");
				System.out.println();
			}
		}
	}
}
	class ShopList{
		private int number;
		private String name;
		private int price;

		public ShopList(int number,String name,int price){
			this.number = number;
			this.name = name;
			this.price = price;


	}

	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}