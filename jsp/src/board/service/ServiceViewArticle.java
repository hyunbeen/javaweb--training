package board.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.model.BoardDao;
import board.model.BoardException;
import board.model.BoardRec;

public class ServiceViewArticle implements Service {
	
	
	private String next;

	public ServiceViewArticle( String _next ){
		next = _next;
	}
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response  ) throws BoardException{
		
		int article_id = 0;
		String id = request.getParameter("aId");
		System.out.println("aid : "+id);
		if( id != null ) article_id = Integer.parseInt(id);
		BoardDao dao = BoardDao.getInstance();
		BoardRec rec = dao.selectById(article_id);		
		dao.increaseReadCount(id);
		request.setAttribute("record", rec);
			
		
		
		
		return next;			
	}
		
}

