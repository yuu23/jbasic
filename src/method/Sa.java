package method;

public class Sa {
	public static void main(String[] args) {
		Bkun bkun = new Bkun();
		bkun.tasu(1,2); // tasuが足し算をして返してくれる(int型で)
//		int a = bkun.tasu(1,2); // 
//		System.out.println(a);
		
		System.out.println(bkun.tasu(5, 9)); // 上でいちいち値を下に与えなくても、ここで一気に処理できる
	}
	public static class Bkun{
	
		int tasu(int a,int b){
		return a + b;
		}
	}
}