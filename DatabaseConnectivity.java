package dmr_testing;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnectivity {

	public static void main(String[] args) throws SQLException {
	
		Connection conn = DriverManager.getConnection("","","");
		
		Statement stm = conn.createStatement();
		
		String query = "SELECT * FROM TABLE1 WHERE TABELE1.NAME";
		
		ResultSet rs = stm.executeQuery(query);
		
		while(rs.next()) {
			
			rs.getString("uname");
			rs.getString("passwrd");
		}
		
		conn.close();
		
		
	}

}
