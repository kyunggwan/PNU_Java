package comm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcPractice {

	public static void main(String[] args) throws ClassNotFoundException, SQLException  {

		// 로드할 드라이버 주소 : 안바꿈
		String driver = "com.mysql.cj.jdbc.Driver";
		// url주소, world를 보겠다.
		String url = "jdbc:mysql://localhost:3306/world";
		// world 안의 table 중에 어떤 데이터를 볼 건지
		String sql = "select * from country";

		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, "musthave", "tiger");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);

		while (rs.next()) {
			System.out.println(rs.getString("Name"));
		}
		rs.close();
		st.close();
		con.close();
	}

}
