import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Dd {
	public static void main(String[] args) throws SQLException {
		
		Connection conn = null;			//DB와 연결하는 인터페이스
		PreparedStatement psmt = null;	//sql문 객체
		ResultSet rs = null;			//sql에 대한 반환(쿼리 실행의 결과값 저장)
		
		try {
			String que = "select * from emp1";
			
			conn = Cc.get();	//DB연결 작업
			
			psmt = conn.prepareStatement(que);	//쿼리문 실행작업
			rs = psmt.executeQuery();			// 실행한 쿼리문을 rs에 저장		
			//select => executeQuery()
			//DML(insert, update, delete) => executeUpdate();
			
			while(rs.next()) {
				//DB에 있는 값들을 가져옴
				String empno = rs.getString(1);
				String ename = rs.getString(2);
				String job = rs.getString(3);
				int mgr = rs.getInt(4);
				
				java.sql.Date hiredate = rs.getDate(5);
				int sal = rs.getInt(6);
				int comm = rs.getInt(7);
				int deptno = rs.getInt(8);
				
				System.out.println(empno+" "+ename+" "+job);
			}
			
		} 
		catch(Exception e) {
			e.printStackTrace();
		}
		rs.close();
		psmt.close();
		conn.close();

	}
}
