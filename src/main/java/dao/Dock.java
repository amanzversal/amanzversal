package dao;
import java.util.*;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class Dock {
	static Connection con;
	public static void db()
{
	try
	{
		String url =  "jdbc:mysql://localhost:3306/sample";
		String user ="root";
		String password = "aman123";
		Class.forName("com.mysql.cj.jdbc.Driver");
		 con = DriverManager.getConnection( url,user,password);
		
             System.out.println("connection created : "+ con);	
		}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
}
public static String getinsertdata() 
{
	
	   try
	   {
			String q = "insert into student (Sname,Sclass) values(?,?)";
				PreparedStatement ptst = con.prepareStatement(q);
				ptst.setString(1,"rohit");
				ptst.setString(2,"mca");
				ptst.executeUpdate();
				System.out.println("inserted");

	   }
	   catch(Exception e)
	   {
		   e.printStackTrace();
	   }
	   return "data inserted";
	
	   }
	public static String getupdatedata()
	{
		try
		{
			String p = "update student set Sname = ? where Sid =?";
				PreparedStatement rtst = con.prepareStatement(p);
				rtst.setString(1,"aman");
				rtst.setInt(2,23);
				rtst.executeUpdate();
				System.out.println("updated");
		}
		catch(Exception ex)
		{
			 ex.printStackTrace();

		}
		return "data updated";
		
	}
	public static String getdeletedata()
	{
		try
		{
			String s = "delete from student where Sid=?";
				PreparedStatement qtst = con.prepareStatement(s);
				qtst.setInt(1,23);
				qtst.executeUpdate();
				System.out.println("deleted");
		}
		catch(Exception ey)
		{
			 ey.printStackTrace();
		}
		return "data deleted";
		
	}
	public static HashMap<String,Object>data(int id)
	{
HashMap<String,Object> getData=new HashMap<String,Object>();

		try
		{
			String r = "select* from student where Sid = ?";
			PreparedStatement stst = con.prepareStatement(r);
			stst.setInt(1,id);
			ResultSet result = stst.executeQuery();
			if(result.next())
			{
				getData.put("Sid", result.getInt("Sid"));
				getData.put("Sname",result.getString("Sname"));
				getData.put("Sclass",result.getString("Sclass"));
				return getData;
			}
		}
		catch(Exception x)
		{
			x.printStackTrace();
		}
       return getData;
	}
	

}



