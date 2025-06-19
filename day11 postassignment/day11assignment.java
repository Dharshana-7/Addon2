package post_assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class day11assignment {
	public static void createtable() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		 String url="jdbc:mysql://localhost:3306/test1";
		 String username="root";
		 String password="Dharshana07$";
		 Connection con=DriverManager.getConnection(url, username, password);
		 Statement stmt=con.createStatement();
		 String query="create table student(id int,name varchar(20),age int)";
		 stmt.executeUpdate(query);
		 System.out.println("table created successfully");
	}
	
	public static void inserttable() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		 String url="jdbc:mysql://localhost:3306/test1";
		 String username="root";
		 String password="Dharshana07$";
		 Connection con=DriverManager.getConnection(url, username, password);
		 Statement stmt=con.createStatement();
		 String query="insert into student values(1,'Dharshana',19),(2,'Krithi',20),(3,'Deva dharshini',19)";
		 int num=stmt.executeUpdate(query);
		 System.out.println("Number of rows inserted "+num);
	}

	
	public static void retrivetable() throws ClassNotFoundException, SQLException
	{

		Class.forName("com.mysql.cj.jdbc.Driver");
		 String url="jdbc:mysql://localhost:3306/test1";
		 String username="root";
		 String password="Dharshana07$";
		 Connection con=DriverManager.getConnection(url, username, password);
		 Statement stmt=con.createStatement();
		 String query="select * from student";
		
		 ResultSet rs=stmt.executeQuery(query);
		 
		 while(rs.next()) {
		 System.out.println(rs.getInt(1)+rs.getString(2)+rs.getInt(3));
		 }
	}
	
	
	public static void deletetable() throws ClassNotFoundException, SQLException
	{

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
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner s=new Scanner(System.in);
		int choice;
		
		while(true)
		{
		System.out.println("  Enter the choices  ");
		System.out.println("1. Createtable");
		System.out.println("2. Inserttable");
		System.out.println("3. Retrivetable");
		System.out.println("4. Deletetable");
		
		
		choice=s.nextInt();
		
		switch(choice)
		{
		case 1:
			createtable();
			break;
			
			
		case 2:
			inserttable();
			break;
			
			
		case 3:
			retrivetable();
			break;
			
		case 4:
			 deletetable();
			 break;
			 
		default:
			System.out.println("Invalid");
			break;
		}
		
		 
	}
}
}
