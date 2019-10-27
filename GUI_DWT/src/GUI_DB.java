import java.sql.*;

public class GUI_DB {
	Connection conn=null;
	PreparedStatement pstmt = null;
	
	GUI_DB(){
		try {

			Class.forName("org.gjt.mm.mysql.Driver").newInstance();
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/javap", "root", "mirim2");
			System.out.println("DB 연결 완료");
			String sql = "select * from member ";
			pstmt= conn.prepareStatement(sql);
			ResultSet srs = pstmt.executeQuery();
			while(srs.next()){
				System.out.print(srs.getString("id")+" |");
				System.out.print(srs.getString("pwd")+" |");
				System.out.print(srs.getString("name"));
				System.out.println();
				}
				}catch(SQLException ex) {
				System.out.println("SQLException:" + ex);
				}catch(Exception ex) {
				System.out.println("Exception:" + ex);
				}finally{
				if(conn != null)
				try{ conn.close();
				}catch(SQLException sqle){}
				if(pstmt != null)
				try{ pstmt.close();
				}catch(SQLException sqle){}
				}

	}
}
