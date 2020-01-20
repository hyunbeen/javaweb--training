package guest.service;

import guest.model.Message;
import guest.model.MessageDao;
import guest.model.MessageException;

import java.util.List;

public class ListMessageService {

	//-------------------------------------------------------------------
	private int totalRecCount;		// 전체 레코드 수	
	private int pageTotalCount;		// 전체 페이지 수
	private int countPerPage = 3;	// 한페이지당 레코드 수
	
	private static ListMessageService instance;
	
	public static ListMessageService	getInstance() throws MessageException
	{
		if( instance == null )
		{
			instance = new ListMessageService();
		}
		return instance;
	}
	
	private ListMessageService()
	{
		
	}
	
	
	public List <Message> getMessageList(String pageNum) throws MessageException
	{
		int pNum;
		if(pageNum == null) {
			pNum = 1;
		}else {
			pNum = Integer.parseInt(pageNum); 
		}
		
		int firstRow = (pNum-1)*countPerPage + 1;
		int endRow = pNum*countPerPage;;
		
		// 전체 레코드를 검색해 온다면
		List <Message> mList = MessageDao.getInstance().selectList(firstRow,endRow);			
		return mList;
	}
	
	public int getTotalCount() throws MessageException {
		totalRecCount = MessageDao.getInstance().getTotalCount();
		//totalRecCount pageTotalCount
		// 9  3
		// 10 4
		// 11 4
		// 12 4
		pageTotalCount = totalRecCount / countPerPage;
		if(totalRecCount % countPerPage>0)pageTotalCount++;
		return pageTotalCount;
	}
	
	
}
