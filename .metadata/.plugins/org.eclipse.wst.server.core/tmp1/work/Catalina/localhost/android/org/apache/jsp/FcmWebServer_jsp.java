/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.0.M26
 * Generated at: 2017-10-27 06:51:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.net.*;
import java.io.*;
import org.json.simple.*;

public final class FcmWebServer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("org.json.simple");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.net");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("java.io");
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
      out.write(" \r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write(" ");

// FCM 서버에서 보낸 토큰값 :   FirebaseInstanceId.getInstance().getToken()
// 콘솔에 출력하고는 그 값을 복사해서 사용해야 한다
// 실제적으로는 이 값을 DB에 넣고 jsp에서는 DB에서 가지고 와서 사용
//userDeviceIdKey is the device id you will query from your database
String userDeviceIdKey = "elRM7EqaZtM:APA91bGG8FbT-Wggimn-TEmPJe_oMlDEY-PKcWtDUGZiPhLRW1eq3FvewFQrwSbz69Mz33_FNIZ4fqEYdo5qzSBiOzLPWwkkKLrMAfeYnNnxLg7l5jNfonr4QKAkGjdzh8CoIlFBzy-l";
 
 //Method to send Notifications from server to client end.
 // firebase.google.com 사이트에서 해당 프로젝트 > 설정 > 클라우드 메세지 > 서버 키 토큰 복사
String AUTH_KEY_FCM ="AAAALRXgc0Y:APA91bF6qX1DejKLhBW3c6Z7vFKyhCNwQAIMI-__IOMmMDSHHaJ2Wu4B5ylikhIQOnlkRRpRg1mTdkRR4fknhd_Ru1c6LVWyACCdFR4laPcqH57O0jUy-M10-l7sLEEylaKCZWRXykma";
String API_URL_FCM = "https://fcm.googleapis.com/fcm/send";


String authKey = AUTH_KEY_FCM;   // You FCM AUTH key
String FMCurl = API_URL_FCM;     

URL url = new URL(FMCurl);
HttpURLConnection conn = (HttpURLConnection) url.openConnection();

conn.setUseCaches(false); 
conn.setDoInput(true);
conn.setDoOutput(true);

conn.setRequestMethod("POST");
conn.setRequestProperty("Authorization","key="+authKey);
conn.setRequestProperty("Content-Type","application/json");

JSONObject json = new JSONObject();
json.put("to",userDeviceIdKey.trim());
JSONObject info = new JSONObject();
info.put("title", "나의캐톡");   // Notification title
info.put("body", "당신은 사랑받기위해"); // Notification body
									// 휴대폰에서 앱을 내리고 해야 전송받음
json.put("notification", info);

OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
System.out.println(">" + json.toString());
wr.write(json.toString());
wr.flush();
conn.getInputStream();  
  
      out.write("  \r\n");
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
