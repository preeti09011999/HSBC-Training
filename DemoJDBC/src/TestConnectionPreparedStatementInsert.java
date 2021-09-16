import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// this package contains API which helps us to talk to underlying database
//import java.sql.*;

public class TestConnectionPreparedStatementInsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
//		Step 1 => Load the driver
		Class.forName("com.mysql.jdbc.Driver"); // Driver is a class, com.sql.jdbc is a package 
//		Class.forName("Fully qualified driver class name"); //forName is a static method of class Name
//		Fully qualified driver class name => driver className given by database vendor for connecting to that database
//		Talking to different databases this case name would change
//		ClassName is given by vendor only
//		Step 2 => Obtain the connection
//		Connection con = DriverManager.getConnection("JDBC URL", "DB Username", "DB Password"); // Connection is an interface
//		JDBC URL Syntax => jdbc:dbname://ip_of_database_server:port_of_database/schema_name
//		For us => jdbc:mysql://localhost:3306/emppayroll
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emppayroll", "root", "root");
		System.out.println("Connection Established");
//		Step 3 => obtain the statement object
		PreparedStatement stmt = con.prepareStatement("INSERT INTO tbl_employee(id, name, salary, no_of_projects) VALUES(?,?, ?, ?)"); // Statement is an interface
		stmt.setInt(1, 3); // first argument indicates the '?' index in the argument (in above command) 
		stmt.setString(2, "Tarun");
		stmt.setInt(3, 1233);
		stmt.setInt(4, 7);
//		Step 4 => Fire the Query
//		ResultSet res = stmt.executeQuery("SELECT * FROM tbl_employee");	// This method returns ResultSet 
//		System.out.println(res);
		int recordsUpdated = stmt.executeUpdate();
//		int deleteRecords = stmt.executeUpdate("DELETE FROM tbl_employee WHERE id = 1");
//		int updatedRecords = stmt.executeUpdate("UPDATE tbl_employee SET name = 'Preet' WHERE id = 2");
//		Step 5 => Fetch the result
//		System.out.println(updatedRecords); // for update query
		System.out.println("No of rows updated : " + recordsUpdated ); // for insert query
//		System.out.println("No of rows deleted : " + deleteRecords);
//		while(res.next()) { // for select query
//			System.out.print(res.getInt(1) + " | ");
//			System.out.print(res.getString(2) + " | ");
//			System.out.print(res.getInt(3) + " | ");
//			System.out.println(res.getInt(4));
//		}
//		Step 6 => Display the results
//		Step 7 => Close the resources
//		res.close();
		stmt.close();
		con.close();
	}

}
