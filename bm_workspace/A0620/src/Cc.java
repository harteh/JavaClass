import java.sql.Connection;
import java.sql.DriverManager;

public class Cc {

	// 데이터베이스와 연결하기 위해 필요한 인터페이스
	public static Connection con;
	
	// Connection 객체 반환 함수
	public static Connection get() {
		Connection conn = null;		//null 값을 안주면 에러난다
		
		//연결
		try {
			String id = "BM";
			String pw= "bm0301";
			String url="jdbc:oracle:thin:@localhost:1521/xepdb1";
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// jdbc 드라이버 로딩하는 코드
			// (객체가 생성되며)jdbc 드라이버 매니저에 등록됨
			
			conn = DriverManager.getConnection(url, id, pw);
			// 드라이버매니저의 함수
			// Connection 객체를 얻음 ..conn은 실제로 데이터베이스와 연결하여
			// 작업을 수행할 수 있는 통로로 작용하는 중요한 객체 변수로 사용됨
			
			System.out.println("데이터베이스에 연결됐다");
						
		} 
		catch(Exception e) {
			System.out.println("로딩 실패");
		}
		return conn;
		
	}
	
//	public static void main(String[] args) {}

}
