package board.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebFilter;

public class LoginCheckFilter implements Filter {

 
    public LoginCheckFilter() {

    }


	public void destroy() {

	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		// place your code here
		HttpServletRequest httpReq = (HttpServletRequest)request;
		HttpSession session = httpReq.getSession(false);
		boolean login = false;
		if(session != null) {
			if(session.getAttribute("userId")!=null) {
				login = true;
			}
		}
		
		if(login) {
			chain.doFilter(request, response);
		}else {//forward를 직접 할수가 없다
			
			String path = "/01_basic_class/5_session/01_login/LoginForm.jsp";
			RequestDispatcher rd = request.getRequestDispatcher(path);
			rd.forward(request, response);
		}
		
		// pass the request along the filter chain

	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
