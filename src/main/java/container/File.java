package container;
import java.util.Properties;
import com.zaxxer.hikari.HikariDataSource;
import java.io.FileInputStream;
import java.io.InputStream;
public class File {
	
	public static void main (String[]args) throws Exception
	{
		try
		{
		Properties ps = new Properties();
		HikariDataSource dataSource = new HikariDataSource();
		InputStream op = new FileInputStream("C:\\Users\\SONY\\eclipse-workspace\\crud op\\lib\\src\\main\\java\\crud\\op\\aman1.property");
		ps.load(op);
		//System.out.println(ps.getProperty("user"));
		//ps.list(System.out);
		dataSource.setJdbcUrl(ps.getProperty("url"));
		dataSource.setUsername(ps.getProperty("user"));
		dataSource.setPassword(ps.getProperty("password"));
		dataSource.setMinimumIdle(100);
		dataSource.setMaximumPoolSize(10000);
		dataSource.setAutoCommit(false);
		dataSource.setLoginTimeout(3);
		}
		catch(Exception s)
		{
		s.printStackTrace();
		}	
	}

}
