package databaseTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectToMySql {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		//Class.forName("com.mysql.jdbc.Driver");

		System.out.println("Driver Loaded");

		// DriverManager.getConnection("jdbc:mysql://hostname:port/dbname","username","password");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/selenium", "root", "selenium");

		System.out.println("connected to mysql");

		Statement stm = con.createStatement();
		String s = "insert into seleniumusers values('Tanvi12','Tanvi@gmail.com');";
		int enter=stm.executeUpdate(s);
		String s1="update seleniumusers set firstname='laxmi' where email='laxmi34@gmail.com'";
		stm.executeUpdate(s1);
		
		String s2="delete from seleniumusers where firstname='Vishwa';";
		stm.executeUpdate(s2);
		ResultSet rs = stm.executeQuery("select * from seleniumusers");

		while (rs.next()) {

			String firstname = rs.getNString("firstname");
			String email = rs.getString("email");
			System.err.println("Database record is: " + firstname);
			System.err.println("Database record is: " + email);
		}
		
		 
		
		//System.out.println("program is exited");

	}
	// public void testdb() throws ClassNotFoundException, SQLException {
	// Class.forName("com.mysql.jdbc.Driver");
	// //DriverManager.getConnection("jdbc:mysql://hostname:port/dbname","username","password");
	// java.sql.Connection
	// con=DriverManager.getConnection("jdbc:mysql://localhost:3306/selenium","root","selenium");
	// System.out.println("connected to mysql");

	// }
}
