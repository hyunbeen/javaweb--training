/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.0.M26
 * Generated at: 2017-10-23 08:32:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp._5_005fpractice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class phonesaveform_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_packages.add("javax.servlet.http");
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
      response.setContentType("text/html;charset=euc-kr");
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
      out.write("<div id=\"phonesaveform\" data-role=\"page\" data-theme=\"a\">\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\tfunction phonesave() {\r\n");
      out.write("\t\t\t//document.register.submit();\r\n");
      out.write("\t\t\t$.mobile.changePage(\"phonelist.jsp\", { type: \"post\", data: $(\"form#phonesaveform\").serialize(), changeHash: false });\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tfunction selectphone(pimage) {\r\n");
      out.write("\t\t\t$(\"#pimage\").attr(\"value\", pimage);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\r\n");
      out.write("\t<div data-role=\"header\" data-position=\"fixed\" data-theme=\"a\">\r\n");
      out.write("\t\t<h1>폰 등록</h1>\r\n");
      out.write("\t\t<a href=\"#\" data-rel=\"back\" data-icon=\"arrow-l\">이전</a>\r\n");
      out.write("\t\t<a href=\"javascript:phonesave();\" data-icon=\"arrow-r\" data-iconpos=\"right\">등록</a>\r\n");
      out.write("\t</div>  \r\n");
      out.write("\t\r\n");
      out.write("\t<div data-role=\"content\">\r\n");
      out.write("\t\t<form id=\"phonesaveform\" name=\"register\" method=\"post\" action=\"phonelist.jsp\">\r\n");
      out.write("\t\t\t<div data-role=\"fieldcontain\">\r\n");
      out.write("\t\t\t\t<label for=\"pname\">상품명:</label>\r\n");
      out.write("\t\t\t\t<input id=\"pname\" type=\"text\" name=\"pname\" value=\"갤럭시 New\"/> \r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div data-role=\"fieldcontain\">\r\n");
      out.write("\t\t\t\t<label for=\"pimage\">이미지:</label>\r\n");
      out.write("\t\t\t\t<input id=\"pimage\" type=\"text\" name=\"text\" value=\"phone01.png\" readonly>\r\n");
      out.write("\t\t\t\t<div data-role=\"collapsible\" data-theme=\"b\" data-content-theme=\"e\">\r\n");
      out.write("\t\t\t\t\t<h3>이미지 선택</h3>\r\n");
      out.write("\t\t\t\t\t<table style=\"width:100%\">\r\n");
      out.write("\t\t\t\t\t\t<tr><td>\r\n");
      out.write("\t\t\t\t\t\t\t");
for(int i=1; i<=20; i++) {
									String pimage = null;
									if(i<10) {
										pimage = "phone0" + i + ".png";
									} else {
										pimage = "phone" + i + ".png";
									}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"javascript:selectphone('");
      out.print(pimage);
      out.write("');\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"../image/");
      out.print(pimage);
      out.write("\" \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"width:30px; height:50px\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</td></tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div data-role=\"fieldcontain\">\r\n");
      out.write("\t\t\t\t<fieldset data-role=\"controlgroup\" data-type=\"horizontal\">\r\n");
      out.write("\t\t\t\t\t<legend>색상:</legend>\r\n");
      out.write("\t\t\t\t\t<input id=\"radio1\" type=\"radio\" name=\"pcolor\" value=\"검정\" checked=\"checked\"/>\r\n");
      out.write("\t\t\t\t\t<label for=\"radio1\">흰색</label>\r\n");
      out.write("\t\t\t\t\t<input id=\"radio2\"  type=\"radio\" name=\"pcolor\" value=\"흰색\"/>\r\n");
      out.write("\t\t\t\t\t<label for=\"radio2\">깜장</label>\r\n");
      out.write("\t\t\t\t</fieldset>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div data-role=\"fieldcontain\">\r\n");
      out.write("\t\t\t\t<label for=\"pcompany\">제조사:</label>\r\n");
      out.write("\t\t\t\t<input id=\"pcompany\" type=\"text\" name=\"pcompany\" value=\"삼성\"/> \r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div data-role=\"fieldcontain\">\r\n");
      out.write("\t\t\t\t<label for=\"pprice\">상품가:</label>\r\n");
      out.write("\t\t\t\t<input id=\"pprice\" type=\"number\" name=\"pprice\" value=\"300000\"/> \r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div data-role=\"footer\" data-position=\"fixed\" data-theme=\"a\">\r\n");
      out.write("\t\t<div data-role=\"navbar\">\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li><a href=\"#home\" data-icon=\"home\" \r\n");
      out.write("\t\t\t\t\t\t\tdata-transition=\"slide\" \r\n");
      out.write("\t\t\t\t\t\t\tdata-direction=\"reverse\">앱홈</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"phonelist.jsp?currentPage=1\" \r\n");
      out.write("\t\t\t\t\t\t\tdata-icon=\"grid\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-transition=\"slide\" \r\n");
      out.write("\t\t\t\t\t\t\tdata-direction=\"reverse\">목록처음</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
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
