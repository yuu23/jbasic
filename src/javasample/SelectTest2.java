package javasample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectTest2 {
	public static void main(String[] args) {
		if(args.length !=1) {
			System.out.println("年齢を入力してください");
			System.exit(1);
		}
		
		try {
			// 年齢を取得
			int age = Integer.parseInt(args[0]);
			// JDBCドライバの登録
			Class.forName("com.mysql.cj.jdbc.Driver");
			// URL,ユーザー名、パスワードの設定
			String url = "jdbc:mysql://localhost/sample?serverTimezone=UTC&useSSL=false";
			String user = "student";
			String pass = "himitu";
			// データベースへの接続
			Connection con = DriverManager.getConnection(url,user,pass);
			// SQL文の作成
			String sql = "SELECT * FROM emp WHERE age >=?";
			// PreparedStatementオブジェクトの取得
			PreparedStatement st = con.prepareStatement(sql);
			// プレースホルダの設定
			st.setInt(1, age);
			// SQLの実行
			ResultSet rs = st.executeQuery();
			// 結果の取得および表示
			while(rs.next()) {
				System.out.print(rs.getInt("code") + ":");
				System.out.print(rs.getString("name") + ":");
				System.out.print(rs.getInt("age") + ":");
				System.out.println(rs.getString("tel") + ":");
			}
			// リソースの開放
			rs.close();
			st.close();
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}