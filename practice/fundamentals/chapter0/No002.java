package fundamentals.chapter0;
/*
 * 以下のフィールドを保持したユーザクラスを作成し、getter/setterを定義してください。
 * また、mainメソッド内で各フィールドに任意の値をセットして画面へ出力するプログラムを作成してください。
 * <フィールド>
 *  ・ユーザID
 * ・ユーザ名
 * ・パスワード
 */
public class No002 {
	public static void main(String[] args) {
		User user = new User();

		user.setId(1);
		user.setName("織田");
		user.setPw(49);

		System.out.println("ユーザーID:" + user.getId());
		System.out.println("ユーザー名:" + user.getName());
		System.out.println("パスワード:" + user.getPw());
	}
}
class User {
	private int id;
	private String name;
	private int pw;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPw() {
		return pw;
	}
	public void setPw(int pw) {
		this.pw = pw;
	}
}
