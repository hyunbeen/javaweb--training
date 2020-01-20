package board.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.model.*;
import mvc.guest.command.CommandException;
import mvc.guest.model.MessageDao;
import mvc.guest.model.MessageException;

public class ServiceDelete implements Service {
	
	private String next;

	public ServiceDelete( String _next ){
		next = _next;
	}
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response  ) throws BoardException{
		
	
			// DB delete
			String id = request.getParameter("mid");
			String password = request.getParameter("password");
			int article_id = 0;
			if( id!=null ) article_id = Integer.parseInt( id );
			int resultCnt;
			resultCnt = BoardDao.getInstance().delete(article_id, password);
			request.setAttribute("removecnt", resultCnt);
		
		
		return next;			
	}
}
