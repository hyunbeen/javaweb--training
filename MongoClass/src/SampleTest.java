import java.net.UnknownHostException;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
public class SampleTest {

	public static void main(String[] args) {
		
		System.out.println("몽고디비서버 연결");
		try {
			
			//MongoDB접속
//			MongoClient mc = new MongoClient();
		
			
		MongoClient mc = new MongoClient("192.168.0.121",27017);
	
		
		//DB객체 얻어오기
		DB db = mc.getDB("test");
		
		//Collection 객체 얻어오기
		DBCollection coll = db.getCollection("members");
		
		DBCursor cursor = coll.find();
		while(cursor.hasNext()) {
			DBObject doc = cursor.next();
			System.out.println(doc);
		}
		cursor.close();
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}
		
	}

}
