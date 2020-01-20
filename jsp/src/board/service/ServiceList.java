package board.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.model.BoardDao;
import board.model.BoardException;
import board.model.BoardRec;
import guest.model.MessageDao;

public class ServiceList implements Service {
	private String next;
	private int countPerPage = 3;
	public ServiceList( String _next ){
		next = _next;
	}
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response  )throws ServiceException, BoardException{
		
			
			// DB delete
			int totalCount = getTotalCount();
		
			String pageNum = request.getParameter("pageno"); 
			if(pageNum==null) {
				pageNum="1";
			}
			List <BoardRec> mList = getArticleList(pageNum);
		
			request.setAttribute("mList", mList);
			request.setAttribute("total_page", totalCount);
			
		
		
		return next;			
	}
	
	public List <BoardRec> getArticleList(String pageNum) throws BoardException
	{
		int pNum;
		
		if(pageNum == null) {
			pNum = 1;
		}else {
			pNum = Integer.parseInt(pageNum); 
		}
		
		int firstRow = (pNum-1)*countPerPage + 1;
		int endRow = pNum*countPerPage;;
		
		 List <BoardRec> mList = BoardDao.getInstance().selectList(firstRow,endRow);			
		return mList;
	}
	
	public int getTotalCount() throws BoardException
	{
		// 
		int total = BoardDao.getInstance().getTotalCount();
		int pageTotalCount = total/countPerPage;
		if(total % countPerPage>0)pageTotalCount++;
		//totalRecCount pageTotalCount
		// 9  3
		// 10 4
		// 11 4
		// 12 4
		
		return pageTotalCount;
	}
}
