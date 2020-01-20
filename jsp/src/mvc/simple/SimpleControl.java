package mvc.simple;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SimpleControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private String jspDir = "/05_mvc_class/1_mvcSimple";
    
	public SimpleControl() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}
	
	protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//클라이언트로 부터 파라미터(데이터) 받을때
		String type = request.getParameter("type");
		String value = "";
		if(type == null)value="안녕하세요";
		else if(type.equalsIgnoreCase("kosta"))value="아무개님 화이팅";
		
		//
		request.setAttribute("param", value);
		//forwarding :
		RequestDispatcher rd = request.getRequestDispatcher(jspDir+"/simpleView.jsp");
		rd.forward(request, response);
	}

}
