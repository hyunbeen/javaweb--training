/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.0.M26
 * Generated at: 2017-10-19 04:17:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.view.register;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class joinAgree_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>우리반 연습</title>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/css/register/joinAgree.css\">\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function join() {\r\n");
      out.write("\t  if(document.form.agree1.checked==false || \r\n");
      out.write("              document.form.agree2.checked==false || \r\n");
      out.write("              document.form.agree3.checked==false ||  \r\n");
      out.write("              document.form.agree4.checked==false){\r\n");
      out.write("           alert(\"모든 항목에 동의해주셔야 합니다\");\r\n");
      out.write("        }\r\n");
      out.write("\t  if(document.form.agree1.checked==true && \r\n");
      out.write("              document.form.agree2.checked==true && \r\n");
      out.write("              document.form.agree3.checked==true &&  \r\n");
      out.write("              document.form.agree4.checked==true){\r\n");
      out.write("\t\t  document.form.submit();\r\n");
      out.write("        }\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div style='background:yellow; width:100%; height:5px;'></div>\r\n");
      out.write("<div>\r\n");
      out.write("\t<header style=\"margin-top: 2%\">\r\n");
      out.write("<div >\r\n");
      out.write("\t<font style=\"font-size: 22; font-weight: bold; margin-left: 2%; color: grey\">Cacao 계정만들기</font><img src=\"../../img/login/loginheader.png\" style=\"height: 20px; margin-left: 70%;\"/>\r\n");
      out.write("</div>\r\n");
      out.write("<hr/>\r\n");
      out.write("            </header> \r\n");
      out.write("<br>\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t<img alt=\"\" src=\"../../img/register/agreeBtnImg.png\" style=\"margin-left: 10%; height: 60px\"> <img\r\n");
      out.write("\t\t\talt=\"\" src=\"../../img/register/agreeBtn.png\" style=\"margin-left: -1%; height: 60px;\">\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<form name=\"form\" method=\"post\" action=\"joinInfoForm.jsp\">\r\n");
      out.write("\t<div class=\"body\" style=\"width: 76%; margin-left: 10.5%;\">\r\n");
      out.write("\t\t<div class=\"Agree-wrapper\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<input id=\"Agree1\" type=\"checkbox\" name=\"toggle\" class=\"question\" />\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<label for=\"Agree1\">\r\n");
      out.write("\t\t\t\t<p>Agree1</p>\r\n");
      out.write("\t\t\t</label>\r\n");
      out.write("\t\t\t<input type=\"radio\" name=\"agree1\">동의합니다\r\n");
      out.write("\r\n");
      out.write("\t\t\t<section id=\"Content1\">\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\tContent1 <br> * ‘카카오 서비스’라 함은 (주) 카카오가 제공하는 “카카오” 브랜드를 사용하는\r\n");
      out.write("\t\t\t\t\t서비스를 말합니다. 다양한 카카오 서비스가 여러분을 찾아갑니다.\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</section>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<input id=\"Agree2\" type=\"checkbox\" name=\"toggle\" class=\"question\" />\r\n");
      out.write("\t\t\t<label for=\"Agree2\">\r\n");
      out.write("\t\t\t\t<p>Agree2</p>\r\n");
      out.write("\t\t\t</label>\r\n");
      out.write("\t\t\t\t<input type=\"radio\" name=\"agree2\">동의합니다\r\n");
      out.write("\t\t\t<section id=\"Content2\">\r\n");
      out.write("\t\t\t\t<p>Content2</p>\r\n");
      out.write("\t\t\t</section>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<input id=\"Agree3\" type=\"checkbox\" name=\"toggle\" class=\"question\" />\r\n");
      out.write("\t\t\t<label for=\"Agree3\">\r\n");
      out.write("\t\t\t\t<p>Agree3</p>\r\n");
      out.write("\t\t\t</label>\r\n");
      out.write("\t\t\t\t<input type=\"radio\" name=\"agree3\">동의합니다\r\n");
      out.write("\r\n");
      out.write("\t\t\t<section id=\"Content3\">\r\n");
      out.write("\t\t\t\t<p>Content3</p>\r\n");
      out.write("\t\t\t</section>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<input id=\"Agree4\" type=\"checkbox\" name=\"toggle\" class=\"question\" />\r\n");
      out.write("\t\t\t<label for=\"Agree4\">\r\n");
      out.write("\t\t\t\t<p>Agree4</p>\r\n");
      out.write("\t\t\t</label>\r\n");
      out.write("\t\t\t\t<input type=\"radio\" name=\"agree4\">동의합니다\r\n");
      out.write("\r\n");
      out.write("\t\t\t<section id=\"Content4\">\r\n");
      out.write("\t\t\t\t<p>Content4</p>\r\n");
      out.write("\t\t\t</section>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t<button type=\"button\" value=\"다음\" class=\"button button5\" style=\"margin-left: 45%; height: 40px;\" onclick=\"join()\"></button>\r\n");
      out.write("</form>\r\n");
      out.write("      <footer>\r\n");
      out.write("               <hr/>\r\n");
      out.write("               \r\n");
      out.write("               <div>\r\n");
      out.write("               \t<img src=\"../../img/login/loginfoot.png\" style=\"height: 55px; margin-left: 23%;\"/>\r\n");
      out.write("               \r\n");
      out.write("               </div>\r\n");
      out.write("               </footer>\r\n");
      out.write("<br>\r\n");
      out.write("</div>\r\n");
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