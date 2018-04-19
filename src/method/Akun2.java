package method;

public class Akun2 {
	public static void main(String[] args) {
		Bkun bkun = new Bkun();
		Ckun ckun = new Ckun();
		bkun.buy(100); 			// 100円を渡してパンをもらった状態(bkun.buy(100)は「パン」になってる。
								// String お腹 = bkun.buy(100);
		ckun.getパン(bkun.buy(100));
		}
}

class Bkun{

	String buy (int お金) {
		String パン = "焼きそばパン";
		                                   //String お腹 = パン;
		return パン;
	}
}
class Ckun{
	void getパン(String box) {
		String お腹 = box;
		System.out.println(お腹);
	}
}