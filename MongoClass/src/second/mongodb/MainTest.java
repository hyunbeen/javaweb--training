package second.mongodb;

import org.bson.types.ObjectId;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

import second.mongodb.domain.entity.Member;
import second.mongodb.service.MemberService;

public class MainTest {

	MemberService memberService = new MemberService();
	
	//--------------------- 입력하기
	void insert(){
		Member m = new Member("홍홍홍",99);
		memberService.insertMember(m);
	}
	
	//------------------- 컬렉션 목록 조회
	void findAll(){

		
		memberService.findMembers();
		
	}
	
	void findById(){
	
	} 
	
	void update(){
		
		Member m = new Member("59f80f34e6a29f88328895d2","김길동",88);
		memberService.updateMember(m);
	}
	
	void delete(){

	}
	
	public static void main(String[] args) {
		MainTest test = new MainTest();
		//test.insert();
		//test.findAll();
		//test.findById();
		test.update();
		//test.delete();
	}

}