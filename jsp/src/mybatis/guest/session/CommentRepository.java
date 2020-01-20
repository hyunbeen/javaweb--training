package mybatis.guest.session;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import board.model.BoardRec;
import mybatis.guest.model.Comment;

public class CommentRepository {
	private String namespace = "mapper.BoardMapper";
	
	SqlSessionFactory getSqlSessionFactory(){
		InputStream in = null;
		try {
		in = Resources.getResourceAsStream("mybatis-config.xml");
		}catch(Exception ex) {
			System.out.println("마이바티즈 설정 실패:"+ex.getMessage());
		}
		SqlSessionFactory sessFac = new SqlSessionFactoryBuilder().build(in);
		return sessFac;
	}
	
	
	public int getGroupId() {
		SqlSession sess = getSqlSessionFactory().openSession();
		//JDBC의 연결 객체 -> SqlSession
		try {
		int result = sess.selectOne(namespace+".getGroupId");
		if(result > 0) {
			sess.commit();
		}else {
			sess.rollback();
		}
		return result;
		
		}finally {
			sess.close();
		}
	}

	public int insert(BoardRec rec) {
		SqlSession sess = getSqlSessionFactory().openSession();
		//JDBC의 연결 객체 -> SqlSession
		try {
		int result = sess.insert(namespace+".insert",rec);
		if(result > 0) {
			sess.commit();
		}else {
			sess.rollback();
		}
		return result;
		
		}finally {
			sess.close();
		}
	}

	public List<BoardRec> selectList(int firstrow, int endrow) {
		// TODO Auto-generated method stub
		return null;
	}

	public BoardRec selectById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	

	public Object increaseReadCount(String article_id) {
		// TODO Auto-generated method stub
		return null;
	}

	public int update(BoardRec rec) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(int article_id, String password) {
		// TODO Auto-generated method stub
		return 0;
	}

	public String selectLastSequenceNumber(String maxSeqNum, String minSeqNum) {
		// TODO Auto-generated method stub
		return null;
	}

	public int getTotalCount() {
		// TODO Auto-generated method stub
		return 0;
	}
}
