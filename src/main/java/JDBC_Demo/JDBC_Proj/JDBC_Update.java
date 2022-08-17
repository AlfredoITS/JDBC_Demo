package JDBC_Demo.JDBC_Proj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Update {
	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql:///movies", "root", "rootSys#97");
			Statement st = con.createStatement();
			String query = "update movie SET genre='Horror' where title like 'Resident Evil'";
			st.executeUpdate(query);
			
			System.out.println("The record updated successfully.");
			
			con.close();
		}
		catch(SQLException ex) {
			System.out.println(ex);
		}
	}
}
