package bean;
import java.sql.Connection;
import java.sql.DriverManager;


public class Bean {
	static Connection con;

	public  static void  load ()
	{
	String url =  "jdbc:mysql://localhost:3306/sample";
	String user ="root";
	String password = "aman123";
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection( url,user,password);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		//return ;
	}
	

}
