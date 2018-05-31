package javasample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertTest {
	public static void main(String[] args) {
		try {
			// 1.JDBCドライバの登録
			Class.forName("com.mysql.jdbc.Driver");
			// 2.データベースへの接続
			String url = "jdbc:mysql://localhost/sample?serverTimezone=UTC";
			String user = "student";
			String pass = "himitu";
			Connection con = DriverManager.getConnection(url,user,pass);
			// 3.Statementオブジェクトの取得
			String sql = "INSERT INTO emp (code,name,age,tel) VALUES(8,'近藤',29,'09-9999-9999')";
			PreparedStatement st = con.prepareStatement(sql);
			// 4.SQLの実行
			int rows = st.executeUpdate();
			// 5.結果の取得
			System.out.println(rows + "件、データベースに追加しました。");
			// 6.データベースの接続を開放
			st.close();
			con.close();

		} catch (ClassNotFoundException e) {
			System.out.println("JDBCドライバが見つかりません");
		} catch (SQLException e) {
			System.out.println("データベースへ接続できません");
		}
	}
}
