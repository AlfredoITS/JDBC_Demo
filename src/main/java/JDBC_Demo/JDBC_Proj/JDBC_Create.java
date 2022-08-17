package JDBC_Demo.JDBC_Proj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Create {
	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql:///movies", "root", "rootSys#97");
			Statement st = con.createStatement();
			String query = "insert into movie values('Mortal Kombat', 'Action', 'Paul W. S. Anderson', 1998)";
			st.execute(query);
			
			System.out.println("The record was created successfully.");
			
			con.close();
		}
		catch(SQLException ex) {
			System.out.println(ex);
		}
	}
}
