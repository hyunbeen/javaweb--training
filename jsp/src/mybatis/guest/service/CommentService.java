package mybatis.guest.service;

import java.util.List;

import mybatis.guest.model.Comment;
import mybatis.guest.session.CommentRepository;

public class CommentService {
	private static CommentService service;
	
	public static CommentService getInstance() {
		if(service == null)service = new CommentService();
		return service;
	}
	
	private CommentService() {
		
	}
	
	CommentRepository repo = new CommentRepository();
	
	public List<Comment> selectComment(){
		return repo.selectComment();
	}
	
	public Integer insertComment(Comment c) {
		return repo.insertComment(c);
	}
	
	public Comment selectCommentByPrimaryKey(Long cId) {
		return repo.selectCommentByPk(cId);
	}
	
	public int update(Long cId,String UserId,String CommentContent,String RegDate ) {
		return repo.update(cId,UserId,CommentContent,RegDate);
	}
}
