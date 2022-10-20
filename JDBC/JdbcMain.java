package comm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

public class JdbcMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// 로드할 드라이버 주소 : 안바꿈, Reference 라이브러리 내용임
		String driver = "com.mysql.cj.jdbc.Driver";
		// url, 우리가 바꿀꺼는 musthave이 부분
		String url = "jdbc:mysql://localhost:3306/musthave";
		// world 안의 table 중에 어떤 데이터를 볼 건지
		String sql = "select * from board";

		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, "musthave", "tiger");
		//쿼리를 날리는 객체
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		//날짜 출력 포맷 정의
		//yyyy/MM/dd hh:mm:ss
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		//숫자 출력 포맷 정의
		DecimalFormat df = new DecimalFormat("#,###");		

		while(rs.next()) {
		System.out.println(String.format("%d|%s|%s|%s|%s",
			rs.getInt("num"),
			rs.getString("title"),
			rs.getString("content"),
			rs.getString("id"),
			sf.format(rs.getDate("postdate")),
			df.format(rs.getInt("visitcount"))));

		}
		rs.close();
		st.close();
		con.close();

	}

}
