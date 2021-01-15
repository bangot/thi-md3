package sevice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {


	public static Connection CreateConnection(){
		Connection conn= null;

		String url="jdbc:mysql://localhost:3306/product?useSSL=false";
		String username="root";
		String password="1234567";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url,username,password);
			System.out.println("Connected successfully");
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException ex){
			ex.printStackTrace();
			System.out.println("Error connection " + ex);
		}

		// create connection
		return conn;
	}
	public static void main(String[] args)
	{
		Database.CreateConnection();
	}

}
