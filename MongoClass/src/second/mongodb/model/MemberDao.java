package second.mongodb.model;



import org.bson.types.ObjectId;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

import second.mongodb.domain.entity.Member;

public class MemberDao {
	private static final  String   memberCollectionName = "members";

	public MemberDao(){}
	
	public String create(Member member) {
		DB db = MongoClientFactory.getDB();
		DBCollection coll = db.getCollection(memberCollectionName);
		BasicDBObject doc = createDocument(member);
		coll.insert(doc);
		System.out.println("입력성공");
		//차후 필요
		String id = doc.getObjectId("_id").toString();
		member.setId(id);
		return id;
	}
	
	public void findAll(){
		DB db = MongoClientFactory.getDB();
		DBCollection coll = db.getCollection(memberCollectionName);
		DBCursor cursor = coll.find();
		while(cursor.hasNext()) {
			DBObject doc = cursor.next();
			System.out.println(doc);
		}
		cursor.close();
	}
	
	public void  findById( String id){

	}
	
	public void update(Member member){
		String hobby[] = new String[3];
		hobby[0]="수영";
		hobby[1]="야구";
		hobby[2]="탁구";
		member.setFavorites(hobby);
		DB db = MongoClientFactory.getDB();
		DBCollection coll = db.getCollection(memberCollectionName);
		DBObject doc = createDocument(member);
		DBObject query = new BasicDBObject("_id",new ObjectId(member.getId()));
		BasicDBObject put = new BasicDBObject();
		put.append("hobby",member.getFavorites());
		put.append("name","가나다");
		
		
		DBObject updateDoc = new BasicDBObject("$set",put);
		coll.update(query, updateDoc);
		System.out.println("수정성공");
	
		
	}
	
	public void delete(String id){

	}
		
	//--------------------------------------------------------------------------
	private BasicDBObject createDocument(Member member) {
		
		BasicDBObject doc = new BasicDBObject(); 
		doc.put("name", member.getName());
		doc.put("age", member.getAge());
		
		// 
		return doc;
	}
}
