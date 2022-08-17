package JDBC_Demo.JDBC_Proj;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


public class JDBC_Fetch {
	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql:///movies", "root", "rootSys#97");
			Statement st = con.createStatement();
			String query = "select * from movie";
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next()) {
				System.out.println(rs.getString(1) + " " + rs.getString(2));
			}
			con.close();
		}
		catch(SQLException ex) {
			System.out.println(ex);
		}
	}
}
