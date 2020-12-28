package Tinhlam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dataBaseHelper {
	public static Connection getMySQLConnection() throws ClassNotFoundException, SQLException
	{
		String hostName="localhost";
		String dbName="dack";
		String userName="root";
		String password="ductinh18110215";
		return getMySQLConnection(hostName, dbName, userName, password);	
	}
	
	public static Connection getMySQLConnection(String hostName, String dbName, String userName, String password) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String connectionURL= "jdbc:mysql://" + hostName + ":3306/" +dbName;		
		Connection conn= DriverManager.getConnection(connectionURL, userName, password);
		return conn;
	}	
}

