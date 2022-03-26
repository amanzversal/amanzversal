package main;
import com.google.gson.Gson;
import dao.Dock;
import static spark.Spark.*;
import container.Controller;

public class Main {
	public static final Gson gson = new Gson();
	public static void main(String[] args) {
		Dock.db();
		path("/student", () -> {
			post("/insert", Controller.getcallin,gson::toJson);
			put("/update", Controller.getcallup,gson::toJson);
			delete("/delete", Controller.getcalldel,gson::toJson);
			get("/data", Controller.byid,gson::toJson);
		});
	}
}
