package mybatis.board.service;

import java.util.List;

import board.model.BoardRec;
import mybatis.guest.model.Comment;
import mybatis.guest.session.CommentRepository;

public class BoardService {
	private static BoardService service;
	
	public static BoardService getInstance() {
		if(service == null)service = new BoardService();
		return service;
	}
	
	private BoardService() {
		
	}
	
	CommentRepository repo = new CommentRepository();
	
	public int getGroupId(){
		return repo.getGroupId();
	}
	
	public int insert( BoardRec rec ) {
		return repo.insert( rec );
	}
	
	public List<BoardRec> selectList(int firstrow,int endrow) {
		return repo.selectList(firstrow,endrow);
	}
	
	public BoardRec selectById(int id){
		return repo.selectById(id);
	}
	public void increaseReadCount( String article_id ){
		repo.increaseReadCount(article_id );
	}
	public int update( BoardRec rec ){
		return repo.update(rec);
	}
	public int delete( int article_id, String password ){
		return repo.delete(article_id,password );
	}
	public String selectLastSequenceNumber( String maxSeqNum, String minSeqNum ){
		return repo.selectLastSequenceNumber(maxSeqNum,minSeqNum );
	}
	
	public int getTotalCount(){
		return repo.getTotalCount();
	}
}
