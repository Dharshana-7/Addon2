package newproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class deletetable {
	
public static void main(String[] args) throws ClassNotFoundException, SQLException {

	Class.forName("com.mysql.cj.jdbc.Driver");
	 String url="jdbc:mysql://localhost:3306/test1";
	 String username="root";
	 String password="Dharshana07$";
	 Connection con=DriverManager.getConnection(url, username, password);
	 Statement stmt=con.createStatement();
	 String query="delete from student";
	 int del=stmt.executeUpdate(query);
	 System.out.println("deleted successfully "+del);
}
}
