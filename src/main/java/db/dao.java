package db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class dao {
		public void selectRecord()
		{
		String user = "root";
		String password = "aman123";
		String url = "jdbc:mysql://localhost:3306/sample";
	
		try
		{
			// load the class 
			Class.forName("com.mysql.cj.jdbc.Driver");
			//create the connection
			Connection con = DriverManager.getConnection(url,user,password);
		//	String q = "insert into student (Sname,Sclass) values(?,?)";
		//	PreparedStatement ptst = con.prepareStatement(q);
			//ptst.setString(1,"rahul");
			//ptst.setString(2,"mca");
			//ptst.executeUpdate();
		//	System.out.println("data inserted");
		//	System.out.println("data updated");
		//	String p = "update student set Sname = ? where Sid =?";
		//	PreparedStatement rtst = con.prepareStatement(p);
		//	rtst.setString(1,"narender");
		//	rtst.setInt(2,11);
		//	rtst.executeUpdate();
		//	System.out.println("data deleted");
		//	String s = "delete from student where Sname=?";
		//	PreparedStatement qtst = con.prepareStatement(s);
		//	qtst.setString(1,"rahul");
		//	qtst.executeUpdate();
		//	con.close();
		//	System.out.println("connection close");
			}
		catch(Exception e)
		{
		e.printStackTrace();
		}
	}
}
