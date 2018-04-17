package fundamentals.chapter4.sec4_constractor;
/*
 * No001クラスとは別に下記のような車クラスを作成してください。
 *
 * <フィールド>
 * ・ガソリン
 *
 * <メソッド>
 * ガソリンを使用して走る機能
 * 現在の残ガソリンを確認する機能
 * 給油する機能
 *
 * <コンストラクタ>
 * ・ガソリンの初期値を指定する
 */
class Car{
    int gas; //ガソリン

    // gasを消費して走る
    public void drive(int gas){
        this.gas -= gas;
        System.out.println(gas * 10 + "km走りました");
    }

    // 現在のgasの値を出力する
    public void checkGas(){
        System.out.println("ガソリンは残り" + this.gas + "リットルです");
    }

    // gasを補給する
    public void putGas(int gas){
        this.gas += gas;
        System.out.println("ガソリンを" + gas + "リットル補給しました");
    }
    Car(){
    	gas = 60;
    }
}

class No001 {
	public static void main(String[] args) {
		Car car = new  Car();

		car.drive(20);
		car.putGas(10);
		car.checkGas();
	}
}