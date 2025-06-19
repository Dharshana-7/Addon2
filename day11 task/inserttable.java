package newproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class inserttable {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	 String url="jdbc:mysql://localhost:3306/test1";
	 String username="root";
	 String password="Dharshana07$";
	 Connection con=DriverManager.getConnection(url, username, password);
	 Statement stmt=con.createStatement();
	 String query="insert into student values(1,'Dharshana',19),(2,'Krithi',20),(3,'Deva dharshini',19);";
	 int num=stmt.executeUpdate(query);
	 System.out.println("Number of rows inserted "+num);
}

}
