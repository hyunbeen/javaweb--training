/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.0.M26
 * Generated at: 2017-10-19 08:54:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.view.main;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import cacao.model.vo.*;

public final class search_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("cacao.model.vo");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

List<Info> catelist1 = (List<Info>)session.getAttribute("sresultall");
List<Info> catelist2 = (List<Info>)session.getAttribute("sresulthall");	
List<Info> catelist3 = (List<Info>)session.getAttribute("sresultlall");	
List<Info> catelist4 = (List<Info>)session.getAttribute("sresultsell");	
List<Info> selectcatelist = null;
String search = request.getParameter("searchtext");
String order = "";

int selectsize = 0;
int size1 = 0;
int size2 = 0;
int size3 = 0;
int size4 = 0;

if(catelist1==null){
	size1=0;
}else{
	size1=catelist1.size();
}
if(catelist2==null){
	size1=0;
}else{
	size2=catelist2.size();
}
if(catelist3==null){
	size3=0;
}else{
	size3=catelist3.size();
}
if(catelist4==null){
	size4=0;
}else{
	size4=catelist4.size();
}

if(request.getParameter("order")==null){
	selectcatelist = catelist1;
	selectsize = size1;
}else if(request.getParameter("order").equals("높은가격순")){
	selectcatelist = catelist2;
	selectsize = size2;
}else if(request.getParameter("order").equals("낮은가격순")){
	selectcatelist = catelist3;
	selectsize = size3;
}else if(request.getParameter("order").equals("이름순")){
	selectcatelist = catelist4;
	selectsize = size4;
}

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\" class=\"no-js\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"keywords\"\r\n");
      out.write("   content=\"one page, business template, single page, onepage, responsive, parallax, creative, business, html5, css3, css3 animation\">\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<title>카카오프렌즈</title>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- combobox css -->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/Cacao/css/product/easydropdown.css\"/>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--\r\n");
      out.write("        Google Fonts\r\n");
      out.write("        ============================================= -->\r\n");
      out.write("<link\r\n");
      out.write("   href=\"http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700\"\r\n");
      out.write("   rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write("        CSS\r\n");
      out.write("        ============================================= -->\r\n");
      out.write("<!-- Fontawesome -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/Cacao/css/font-awesome.min.css\">\r\n");
      out.write("<!-- Bootstrap -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/Cacao/css/bootstrap.min.css\">\r\n");
      out.write("<!-- Fancybox -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/Cacao/css/jquery.fancybox.css\">\r\n");
      out.write("<!-- owl carousel -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/Cacao/css/owl.carousel.css\">\r\n");
      out.write("<!-- Animate -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/Cacao/css/animate.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/Cacao/css/main.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/Cacao/css/responsive.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/Cacao/css/responsive.css\">\r\n");
      out.write("<script src=\"/Cacao/js/vendor/modernizr-2.6.2.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- combobox js -->\r\n");
      out.write("<script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"/Cacao/js/product/easydropdown.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("#drop{\r\n");
      out.write("\tfloat : left; \r\n");
      out.write("\tmargin-left : 48.5%;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("#print{\r\n");
      out.write("\tfloat : left;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<img src=\"/Cacao/img/product/product_img.png\" width=100%>\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/view/include/header.jsp", out, false);
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<section id=\"portfolio\" style=\"margin-top: 10%\">\r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("<div id=\"print\">\r\n");
      out.write("<h3>총 ");
      out.print(selectsize);
      out.write("개의 상품이 조회되었습니다 </h3> \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"drop\">\r\n");
      out.write("\r\n");
      out.write("<select onchange=\"location.href='/Cacao/Main?cmd=search-page&searchtext=");
      out.print(search );
      out.write("&order='+this.value;\" class=\"dropdown1\" style=\"float:right\">\r\n");
      out.write("  <option class=\"option\" value=\"\" class=\"label\">검색기준</option>  \r\n");
      out.write("  <option class=\"option\" value=\"높은가격순\">높은가격순</option>\r\n");
      out.write("  <option class=\"option\" value=\"낮은가격순\">낮은가격순</option>\r\n");
      out.write("  <option class=\"option\" value=\"이름순\">이름순</option>\r\n");
      out.write("</select>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\t</br>\r\n");
      out.write("        <div class=\"row\" style=\"margin-top: 3.5%;\">\r\n");
      out.write("        ");
for(int i=0;i<selectsize;i++){ 
      out.write("\r\n");
      out.write("          <div class=\"col-sm-4 portfolio-item\">\r\n");
      out.write("            <a class=\"portfolio-link\" href=\"#portfolioModal1\" data-toggle=\"modal\">\r\n");
      out.write("                          <a href='/Cacao/Product?cmd=pCateCaseView-page&id=");
      out.print(selectcatelist.get(i).getiId());
      out.write("&cnt=");
      out.print(selectcatelist.get(i).getiImgcnt());
      out.write("&detail=");
      out.print(selectcatelist.get(i).getiDetail());
      out.write("&name=");
      out.print(selectcatelist.get(i).getiName());
      out.write("&price=");
      out.print(selectcatelist.get(i).getiCost());
      out.write("'><img class=\"img-fluid\" src=\"/Cacao/img/product/all/");
      out.print(selectcatelist.get(i).getiId() );
      out.write("00.jpg\" alt=\"\" style=\"height: 240px; width: 300px;\"></a>\r\n");
      out.write("            \t\t\t\t\r\n");
      out.write("              <div class=\"caption\">\r\n");
      out.write("                <div class=\"caption-content\">\r\n");
      out.write("                \t상품명 : ");
      out.print( selectcatelist.get(i).getiName() );
      out.write("<br/>가격 : ");
      out.print( selectcatelist.get(i).getiCost() );
      out.write("원<br/>\r\n");
      out.write("                     <a href='/Cacao/view/main/cartView.jsp?cnt=1&name=");
      out.print(selectcatelist.get(i).getiName());
      out.write("&price=");
      out.print( selectcatelist.get(i).getiCost());
      out.write("&id=");
      out.print( selectcatelist.get(i).getiId());
      out.write("'><img class=\"fa fa-search-plus fa-3x\" src=\"/Cacao/img/product/portfolio/cart.png\" style=\"width: 30px; height: 30px;\"></img></a>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </a>\r\n");
      out.write("          </div>\r\n");
      out.write("          ");
} 
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </section>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/view/include/footer.jsp", out, false);
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
