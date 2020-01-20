package board.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.model.*;

public class ServiceModify implements Service {
	
	private String next;

	public ServiceModify( String _next ){
		next = _next;
	}
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response  ) throws BoardException{
		
	
			// DB updat
			
			String articleid = request.getParameter("articleid3");
			String title = request.getParameter("title");
			String password = request.getParameter("password");
			String content = request.getParameter("content");
			BoardRec rec = new BoardRec();
			
			rec.setArticleId(Integer.parseInt(articleid));
			rec.setTitle(title);
			rec.setPassword(password);
			rec.setContent(content);
			
			int result = BoardDao.getInstance().update(rec);
			request.setAttribute("update", result);
		
		return next;			
	}
	
}
