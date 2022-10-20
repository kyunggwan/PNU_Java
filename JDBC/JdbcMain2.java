package comm;

//데이터 베이스를 읽어서 저장, 출력하기
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcMain2 {

	//BoardDTO에 있는 정보들을 밑에서 getData형태로 저장했으니까 getData메소드 선언.
	//여기서 수정 작업해서 list로 저장.
	private static List<BoardDTO> getData(ResultSet rs) throws SQLException {
		List<BoardDTO> list = new ArrayList<>();
			while (rs.next()) {		
				list.add(new BoardDTO(rs.getInt("num"),
				rs.getString("title"),
				rs.getString("content"),
				rs.getString("id")));		
			}
		return list;
	}

	// 출력부분 메소드
	private static void printData(List<BoardDTO> list) {
		for (BoardDTO b : list) {
			System.out.println(b.toString());
		}
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		//데이터 베이스 접속, 데이터 불러옴
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/musthave";
		String sql = "select * from board";

		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, "musthave", "tiger");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);

		//불러온 데이터 베이스를 저장하고 싶다.
		//공부할 것 DTO는 일반 클래스가 아님.  DAO DTO 공부해보기 NTT
		//BoardDTO라는 클래스를 데이터화 시킴 <BoardDTO>.
		//getdata메소드에 rs 값들을 넣어서 list로 만듦. 
		//예외 발생시 printStackTrace()
		List<BoardDTO> list = null;
		try {
			list = getData(rs);

		} catch (SQLException e) {
			e.printStackTrace();
		}

		rs.close();
		st.close();
		con.close();
		
		//printData메소드로 출력
		printData(list);
	}

}
