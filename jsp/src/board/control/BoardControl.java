package board.control;


import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.model.BoardException;
import board.service.Service;
import board.service.ServiceDelete;
import board.service.ServiceException;
import board.service.ServiceList;
import board.service.ServiceModify;
import board.service.ServiceNull;
import board.service.ServiceReply;
import board.service.ServiceViewArticle;
import board.service.ServiceWrite;

/**
 * Servlet implementation class GuestControl
 */
public class BoardControl extends HttpServlet {
	
	private HashMap serviceMap;
	private String	jspDir = "/04_board_class/";
	private String  error = "error.jsp";
	

    public BoardControl() {
        super();       
		initCommand();
	
	}

	private void initCommand(){
		
		serviceMap = new HashMap();

		serviceMap.put("BoardList",	new ServiceList("BoardList.jsp") );
		serviceMap.put("BoardInputForm",new ServiceNull("BoardInputForm.jsp") );
		serviceMap.put("BoardSave",	new ServiceWrite("BoardSave.jsp") );
		serviceMap.put("BoardView",	new ServiceViewArticle("BoardView.jsp") );
		serviceMap.put("BoardReplyForm",new ServiceNull("BoardReplyForm.jsp") );
		serviceMap.put("BoardModifyForm",new ServiceViewArticle("BoardModifyForm.jsp") );
		serviceMap.put("BoardDeleteForm",new ServiceNull("BoardDeleteForm.jsp") );
		serviceMap.put("BoardDelete",	new ServiceDelete("BoardDelete.jsp") );
		serviceMap.put("BoardReply",new ServiceReply("BoardReply.jsp"));
		serviceMap.put("BoardModify",new ServiceModify("BoardModify.jsp") );
		//serviceMap.put("BoardReply",new ServiceReply("BoardReply.jsp") );
		 	
		
		// 나머지도 추가하기		
		
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}
	

	private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");

		String nextPage = "";
		String cmdKey	= request.getParameter("cmd");
		if( cmdKey == null ){
		
			cmdKey = "BoardList";
		}

		
		Service cmd = null;

		try{
			
			if( serviceMap.containsKey( cmdKey ) ){
				System.out.println("실행");
				cmd = (Service)serviceMap.get( cmdKey);
			}else{
				throw new ServiceException("지정할 명령어가 존재하지 않음");
			}

			try {
				nextPage = cmd.execute(request, response);
				System.out.println();
			} catch (BoardException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}catch( ServiceException e ){
			request.setAttribute("javax.servlet.jsp.jspException", e );
			nextPage = error;
			System.out.println("오류 : " + e.getMessage() );
		}

		RequestDispatcher reqDp = getServletContext().getRequestDispatcher( jspDir + nextPage );
		reqDp.forward( request, response );
		
	}

}
