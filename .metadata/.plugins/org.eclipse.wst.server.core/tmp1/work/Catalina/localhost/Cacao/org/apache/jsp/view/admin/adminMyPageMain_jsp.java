/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.0.M26
 * Generated at: 2017-10-20 07:26:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.view.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import cacao.model.vo.*;

public final class adminMyPageMain_jsp extends org.apache.jasper.runtime.HttpJspBase
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
List<QA> answerList = (List<QA>) request.getAttribute("answerList");
      out.write('\r');
      out.write('\n');

   String pjName = "/Cacao"; 

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js\"></script>\r\n");
      out.write("<body ng-app=\"myApp\" ng-controller=\"userCtrl\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div style=\"width:100%\">\r\n");
      out.write("<img alt=\"\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/img/admin/adminQA.png\" style=\"width: 100%; height: 240px\">\r\n");
      out.write("<!-- 1:1문의게시판_관리자모드_타이틀 -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id='first' style=\"width:58%; float:left; margin-left: 4.5%; margin-top: 20px\">\r\n");
      out.write("<h2><a class=\"w3-btn w3-green w3-ripple\" href=\"/Cacao/Admin?cmd=main-page\">뒤로가기</a></h2>\r\n");
      out.write("<table class=\"w3-table w3-bordered w3-striped\">\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  <tr style=\"color: blue\">\r\n");
      out.write("  \t<th></th>\r\n");
      out.write("    <th>질문자 ID</th>\r\n");
      out.write("    <th>질문유형</th>\r\n");
      out.write("     <th>제목</th>\r\n");
      out.write("      <th>내용</th>\r\n");
      out.write("            <th>답변여부</th>\r\n");
      out.write("        <th>Edit</th>\r\n");
      out.write("  </tr>\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("  <tr  ng-repeat=\"user in users\">\r\n");
      out.write("    <td style=\"visibility: hidden;\">{{user.qId}}</td>\r\n");
      out.write("    <td>{{user.userId}}</td>\r\n");
      out.write("    <td>{{user.questType}}</td>\r\n");
      out.write("    <td>{{user.questTitle}}</td>\r\n");
      out.write("    <td>{{user.questContent}}</td>\r\n");
      out.write("    <td>{{user.qStatus}}</td>\r\n");
      out.write("       <td>\r\n");
      out.write("      <button class=\"w3-btn w3-ripple\" ng-click=\"editUser(user.id)\">✎ 답변</button>\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("<br>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- <button class=\"w3-btn w3-green w3-ripple\" ng-click=\"editUser('new')\">✎ Create New User</button> -->\r\n");
      out.write("<div id=\"second\" style=\"width:30%; float:left; margin-left:50px; margin-left: 4.5%; margin-top: 80px\">\r\n");
      out.write("<form ng-hide=\"hideform\"  action=\"");
      out.print(pjName);
      out.write("/Admin?cmd=adminMyPageMainSave-page\" name=\"testP\" id=\"testP\" method=\"post\" style=\"margin-top: -10%\">\r\n");
      out.write("<!--   <h3 ng-show=\"edit\">수정창:</h3> -->\r\n");
      out.write("  <h3 ng-hide=\"edit\">답변창:</h3>\r\n");
      out.write("<!--   히든으로 q_id값을 qId라는 이름으로 생성 -->\r\n");
      out.write("\r\n");
      out.write("    <label>제목:</label>\r\n");
      out.write("    <input class=\"w3-input w3-border\" type=\"text\" ng-model=\"questTitle\" ng-disabled=\"!edit\" placeholder=\"Title\">\r\n");
      out.write("  <br>\r\n");
      out.write("    <label>내용:</label>\r\n");
      out.write("    <textarea class=\"w3-input w3-border\" type=\"text\" ng-model=\"questContent\" ng-disabled=\"!edit\" placeholder=\"Context\"></textarea>\r\n");
      out.write("  <br>\r\n");
      out.write("    <label>답변 내용:</label>\r\n");
      out.write("    <textarea class=\"w3-input w3-border\" type=\"text\" ng-model=\"qAnswer\" name=\"qa_answer\" id=\"qAnswer\" placeholder=\"내용\" style=\"height: auto; min-height: 300px;\"></textarea>\r\n");
      out.write("  <br> \r\n");
      out.write("  <label>답변상태 설정:</label>\r\n");
      out.write("    <select id=\"qStatus\" name=\"qa_status\" class=\"w3-input w3-border\" ng-model=\"qStatus\">\r\n");
      out.write("     \t\t <option value=\"0\">유형을 선택하세요</option>\r\n");
      out.write("     \t\t <option value=\"답변대기\">답변대기</option>\r\n");
      out.write("     \t\t <option value=\"답변완료\">답변완료</option>\r\n");
      out.write("   \t</select>\r\n");
      out.write("  <br>\r\n");
      out.write("  <button class=\"w3-btn w3-green w3-ripple\" onclick=\"testPageMove()\">✔ Save Changes</button>\r\n");
      out.write("  \r\n");
      out.write("  <input style=\"visibility: hidden;\" type=\"text\" id=\"qId\" name=\"qa_id\" ng-model=\"qId\">\r\n");
      out.write("  <input style=\"visibility: hidden;\" type=\"text\" id=\"userId\" name=\"qa_userid\" ng-model=\"userId\">\r\n");
      out.write("</form>\r\n");
      out.write(" \r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("angular.module('myApp', []).controller('userCtrl', function($scope) {\r\n");
      out.write("$scope.qId = '';\r\n");
      out.write("$scope.userId = '';\r\n");
      out.write("$scope.questType = '';\r\n");
      out.write("$scope.questTitle = '';\r\n");
      out.write("$scope.questContent = '';\r\n");
      out.write("$scope.qAnswer = '';\r\n");
      out.write("$scope.qStatus = '';\r\n");
      out.write("$scope.users = [\r\n");
      out.write("\t");
for(int i=0; i< answerList.size(); i++){ 
      out.write("\r\n");
      out.write("\t\t{id:");
      out.print(i+1);
      out.write(", qId:\"");
      out.print( answerList.get(i).getqId());
      out.write("\", userId: '");
      out.print(answerList.get(i).getmEmail());
      out.write("', questType:\"");
      out.print( answerList.get(i).getqCate() );
      out.write("\", \r\n");
      out.write("\t\t\tquestTitle: '");
      out.print(answerList.get(i).getqTitle() );
      out.write("', questContent:\"");
      out.print(answerList.get(i).getqContent() );
      out.write("\", \r\n");
      out.write("\t\t\tqAnswer:'");
      out.print( answerList.get(i).getqAnswer() );
      out.write("' ,qStatus:\"");
      out.print(answerList.get(i).getqStatus() );
      out.write("\"},\r\n");
      out.write("\t\t");
}
      out.write("\r\n");
      out.write("];\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("$scope.edit = true;\r\n");
      out.write("$scope.error = false;\r\n");
      out.write("$scope.incomplete = false; \r\n");
      out.write("$scope.hideform = true; \r\n");
      out.write("\r\n");
      out.write("$scope.editUser = function(id) {\r\n");
      out.write("  $scope.hideform = false;\r\n");
      out.write("  if (id == 'new') {\r\n");
      out.write("    $scope.edit = true;\r\n");
      out.write("    $scope.incomplete = true;\r\n");
      out.write("    $scope.qId = '';\r\n");
      out.write("    $scope.userId = '';\r\n");
      out.write("    $scope.questType = '';\r\n");
      out.write("    $scope.questTitle = '';\r\n");
      out.write("    $scope.questContent = '';\r\n");
      out.write("    $scope.qAnswer = '';\r\n");
      out.write("    $scope.qStatus = '';\r\n");
      out.write("    \r\n");
      out.write("    } else {\r\n");
      out.write("   $scope.edit = false;\r\n");
      out.write("   $scope.qId = $scope.users[id-1].qId;\r\n");
      out.write("   $scope.userId = $scope.users[id-1].userId;\r\n");
      out.write("    $scope.questType = $scope.users[id-1].questType; \r\n");
      out.write("    $scope.questTitle = $scope.users[id-1].questTitle; \r\n");
      out.write("    $scope.questContent = $scope.users[id-1].questContent;\r\n");
      out.write("    $scope.qAnswer = $scope.users[id-1].qAnswer;\r\n");
      out.write("    $scope.qStatus = $scope.users[id-1].qStatus; \r\n");
      out.write("  }\r\n");
      out.write("};\r\n");
      out.write("\r\n");
      out.write("$scope.$watch('qId',function() {$scope.test();});\r\n");
      out.write("$scope.$watch('userId',function() {$scope.test();});\r\n");
      out.write("$scope.$watch('questType',function() {$scope.test();});\r\n");
      out.write("$scope.$watch('questTitle', function() {$scope.test();});\r\n");
      out.write("$scope.$watch('questContent', function() {$scope.test();});\r\n");
      out.write("$scope.$watch('qAnswer', function() {$scope.test();});\r\n");
      out.write("$scope.$watch('qStatus', function() {$scope.test();});\r\n");
      out.write("\r\n");
      out.write("$scope.test = function() {\r\n");
      out.write("  if ($scope.questTitle !== $scope.questContent) {\r\n");
      out.write("    $scope.error = true;\r\n");
      out.write("    } else {\r\n");
      out.write("    $scope.error = false;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  $scope.incomplete = false;\r\n");
      out.write("  \r\n");
      out.write("  if ($scope.edit && (!$scope.userId.length ||\r\n");
      out.write("  !$scope.questContent.length ||\r\n");
      out.write("  !$scope.questTitle.length || !$scope.questContent.length)) {\r\n");
      out.write("     $scope.incomplete = true;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write(" \r\n");
      out.write("};\r\n");
      out.write("\r\n");
      out.write("});    \r\n");
      out.write("</script>\r\n");
      out.write("\t\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("function testPageMove() {\r\n");
      out.write("\r\n");
      out.write("\tdocument.testP.submit();\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
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
