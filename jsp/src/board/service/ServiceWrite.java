package board.service;

import java.text.DecimalFormat;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.model.BoardDao;
import board.model.BoardException;
import board.model.BoardRec;

public class ServiceWrite implements Service {
	
	
	private String next;

	public ServiceWrite( String _next ){
		next = _next;
	}
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response  ) throws BoardException{
		
	
		BoardDao dao = BoardDao.getInstance();
		BoardRec rec = new BoardRec();
		// 그룹번호(group_id) 지정
		int groupId = dao.getGroupId();
		rec.setWriterName(request.getParameter("writername"));
		rec.setTitle(request.getParameter("title"));
		rec.setContent(request.getParameter("content"));
		rec.setPassword(request.getParameter("password"));
		rec.setGroupId(groupId);
		
		
		// 순서번호(sequence_no) 지정
		DecimalFormat dformat = new DecimalFormat("0000000000");
		rec.setSequenceNo( dformat.format(groupId) + "999999");
		
		// DB에 insert
		int result = dao.insert(rec);
		request.setAttribute("result", result);
		
		return next;			
	}
}
