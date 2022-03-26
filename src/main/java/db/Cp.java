package db;
import java.sql.Connection;
import java.sql.DriverManager;

public class Cp {
	static Connection con;
	 
public static Connection create()
{
try
{
	//load the driver
	Class.forName("com.mysql.jdbc.Driver");
	// create the connection
	String user = "root";
	String password = "aman123";
	String url = "jdbc:mysql://localhost:3306/sample";
	con = DriverManager.getConnection(url,user,password);
}
catch(Exception e)
{
	e.printStackTrace();
}
return con;
}


}
