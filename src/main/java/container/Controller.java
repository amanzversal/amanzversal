package container;
import dao.Dock;
import java.util.*;
import spark.Route;
public class Controller {
	public static final Route getcallin = (req,res)->{
			String rsp = Dock.getinsertdata();
			HashMap<String, String> result = new HashMap<>();
			result.put("status",rsp);
			return result;
		
		
	};
	public static final Route getcallup = (req,res)->{
		String rtp = Dock.getupdatedata();
		HashMap<String, String> result1 = new HashMap<>();
		result1.put("status",rtp);
		return result1;
		};
		public static final Route getcalldel = (req,res)->{
			String rqp = Dock.getdeletedata();
			HashMap<String, String> result2 = new HashMap<>();
               result2.put("status",rqp);
               return result2;
		};
		public static final Route byid = (req,res)->{
			HashMap<String,Object> map = new HashMap<>();
			try
			{
				String sid = req.params("Sid");
				int id=Integer.parseInt(sid);
				map = Dock.data(id);
				return map;
			}
			catch(Exception e)
			{
				e.printStackTrace();
				return map;
			}
			
		};
		
}
