package newproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class createtable {
		
	
	
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.driver");
		String url="jdbc:mysql://localhost:3306/test_DB";
		String username="root";
		String password="Kgisl@123";
		Connection con=DriverManager.getConnection(url, username, password);
		Statement stmt=con.createStatement();	
		String query="create table student(id int,name varchar(20),age int)";
		stmt.executeUpdate(query);
		System.out.println("table created successfully");
		
		
	}

	
	

}
