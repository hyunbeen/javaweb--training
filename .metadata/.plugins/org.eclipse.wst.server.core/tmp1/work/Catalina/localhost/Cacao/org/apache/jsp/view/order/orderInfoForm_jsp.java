/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.0.M26
 * Generated at: 2017-10-20 08:18:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.view.order;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import cacao.model.vo.*;

public final class orderInfoForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  \r\n");
      out.write("\r\n");
List<Info> orderList = (List<Info>) request.getAttribute("orderResult"); 
      out.write('\r');
      out.write('\n');

   String pjName = "/Cacao";
	
    int sum = 0;
    String min = request.getParameter("cnt");
    if(min!=null){
    	orderList.get(0).setiCnt(min);
    }
    for(int i =0; i < orderList.size(); i ++){
    	sum += Integer.parseInt(orderList.get(i).getiCost())*Integer.parseInt(orderList.get(i).getiCnt());
    }
    
   

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(pjName );
      out.write("/css/mypage/qabtn.css\" />\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"http://dmaps.daum.net/map_js_init/postcode.v2.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(function(){\r\n");
      out.write("\t\r\n");
      out.write("   $('#Cancel').click(function(){\r\n");
      out.write("      event.preventDefault();\r\n");
      out.write("      window.location = '/Cacao/MyPage?cmd=main-page&page=4';\r\n");
      out.write("   });\r\n");
      out.write("   $('#Insert').click(function () {\r\n");
      out.write("\t   var exptext = /^[A-Za-z0-9_\\.\\-]+@[A-Za-z0-9\\-]+\\.[A-Za-z0-9\\-]+/;\r\n");
      out.write("\t   \r\n");
      out.write("\t   var imsi = $('#qEmail').val();\r\n");
      out.write("\t   \r\n");
      out.write("\t   if($('#qName').val() == ''){\r\n");
      out.write("\t\t\talert('주문자를 입력하세요');\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif($('#qEmail').val() == ''){\r\n");
      out.write("\t\t\talert('이메일을 입력하세요');\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif (exptext.test(imsi) == false) {\r\n");
      out.write("\t\t\t//이메일 형식이 알파벳+숫자@알파벳+숫자.알파벳+숫자 형식이 아닐경우\r\n");
      out.write("\t\t\talert(\"이 메일형식이 올바르지 않습니다.\");\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif($('#qTel').val() == ''){\r\n");
      out.write("\t\t\talert('전화번호를 입력하세요');\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif($('#post1').val() == ''){\r\n");
      out.write("\t\t\talert('주소를 선택하세요');\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(($('input[type =\"radio\"]').is(\":checked\")) == false){\r\n");
      out.write("\t\t\talert('결제 방법을 선택하세요');\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(($('#personal').is(\":checked\")) == false){\r\n");
      out.write("\t\t\talert('개인정보 수집 및 이용에 동의하세요');\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(($('#member').is(\":checked\")) == false){\r\n");
      out.write("\t\t\talert('회원 이용 약관에 동의하세요');\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$('#orderInsert').submit();\r\n");
      out.write("  });\r\n");
      out.write("   \r\n");
      out.write("   $('.minus').click(function(){\r\n");
      out.write("\t   var countm =  $(this).parent().find(\"input.textcnt\").val();\r\n");
      out.write("\t   var gob = $(this).parent().parent().parent().parent().find(\"span.money\").text();\r\n");
      out.write("\t   var allmoney = $(this).parent().parent().parent().parent().parent().find(\"span#sum\").text();\r\n");
      out.write("\t   var totalmoney = $(this).parent().parent().parent().parent().parent().find(\"span#allmoney\").text();\r\n");
      out.write("\t   \r\n");
      out.write("\t   if(countm <= 1){\r\n");
      out.write("\t\t   alert(\"수량은 최소 1개 입니다.\");\r\n");
      out.write("\t\t   return;\r\n");
      out.write("\t   }\r\n");
      out.write("\t   $(this).parent().find(\"input.textcnt\").val(countm-1);\r\n");
      out.write("\t   $(this).parent().parent().parent().parent().parent().find(\"span#sum\").text(parseInt(allmoney)-parseInt(gob)+\"원\");\r\n");
      out.write("\t   $(this).parent().parent().parent().parent().parent().find(\"span#allmoney\").text(parseInt(totalmoney)-parseInt(gob)+\"원\");\r\n");
      out.write("   });\r\n");
      out.write("   $('.plus').on(\"click\",function(){\r\n");
      out.write("\t   var countp = $(this).parent().find(\"input.textcnt\").val();\r\n");
      out.write("\t   var gob = $(this).parent().parent().parent().parent().find(\"span.money\").text();\r\n");
      out.write("\t   var allmoney = $(this).parent().parent().parent().parent().parent().find(\"span#sum\").text();\r\n");
      out.write("\t   var totalmoney = $(this).parent().parent().parent().parent().parent().find(\"span#allmoney\").text();\r\n");
      out.write("\t   \r\n");
      out.write("\t   if(countp >= 50){\r\n");
      out.write("\t\t   alert(\"주문 최대수량은 최대 50개 입니다.\");\r\n");
      out.write("\t\t   return;\r\n");
      out.write("\t   }\r\n");
      out.write("\t   $(this).parent().find(\"input.textcnt\").val(parseInt(countp)+1);\r\n");
      out.write("\t   $(this).parent().parent().parent().parent().parent().find(\"span#sum\").text(parseInt(allmoney)+parseInt(gob)+\"원\");\r\n");
      out.write("\t   $(this).parent().parent().parent().parent().parent().find(\"span#allmoney\").text(parseInt(totalmoney)+parseInt(gob)+\"원\");\r\n");
      out.write("   });\r\n");
      out.write("});\r\n");
      out.write("function openDaumPostcode() {\r\n");
      out.write("    var width = 500; //팝업창이 실행될때 위치지정\r\n");
      out.write("    var height = 600; //팝업창이 실행될때 위치지정\r\n");
      out.write("    new daum.Postcode({\r\n");
      out.write("        width : width, //팝업창이 실행될때 위치지정\r\n");
      out.write("        height : height, //팝업창이 실행될때 위치지정\r\n");
      out.write("        oncomplete: function(data) {\r\n");
      out.write("             // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.\r\n");
      out.write(" \r\n");
      out.write("            // 도로명 주소의 노출 규칙에 따라 주소를 조합한다.\r\n");
      out.write("            // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.\r\n");
      out.write("            var fullRoadAddr = data.roadAddress; // 도로명 주소 변수\r\n");
      out.write("            var extraRoadAddr = ''; // 도로명 조합형 주소 변수\r\n");
      out.write(" \r\n");
      out.write("            // 법정동명이 있을 경우 추가한다.\r\n");
      out.write("            if(data.bname !== ''){\r\n");
      out.write("                extraRoadAddr += data.bname;\r\n");
      out.write("            }\r\n");
      out.write("            // 건물명이 있을 경우 추가한다.\r\n");
      out.write("            if(data.buildingName !== ''){\r\n");
      out.write("                extraRoadAddr += (extraRoadAddr !== '' ? ', ' + data.buildingName : data.buildingName);\r\n");
      out.write("            }\r\n");
      out.write("            // 도로명, 지번 조합형 주소가 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.\r\n");
      out.write("            if(extraRoadAddr !== ''){\r\n");
      out.write("                extraRoadAddr = ' (' + extraRoadAddr + ')';\r\n");
      out.write("            }\r\n");
      out.write("            // 도로명, 지번 주소의 유무에 따라 해당 조합형 주소를 추가한다.\r\n");
      out.write("            if(fullRoadAddr !== ''){\r\n");
      out.write("                fullRoadAddr += extraRoadAddr;\r\n");
      out.write("            }\r\n");
      out.write("             \r\n");
      out.write("            // 우편번호와 주소 정보를 해당 필드에 넣는다.\r\n");
      out.write("            document.getElementById(\"post1\").value = data.postcode1;\r\n");
      out.write("            document.getElementById(\"post2\").value = data.postcode2;\r\n");
      out.write("            document.getElementById(\"addr1\").value = fullRoadAddr;\r\n");
      out.write("            document.getElementById(\"addr2\").value = data.jibunAddress;\r\n");
      out.write(" \r\n");
      out.write("            document.getElementById('addr2').focus();\r\n");
      out.write("        }\r\n");
      out.write("    }).open({\r\n");
      out.write("        left : (window.screen.width/2) - (width/2), //팝업창이 실행될때 위치지정\r\n");
      out.write("        top : (window.screen.height/2) - (height/2) //팝업창이 실행될때 위치지정\r\n");
      out.write("    });\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<title> 우리반 연습</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t\r\n");
      out.write("\t<form class=\"form-horizontal\" id='orderInsert' name='orderInsert' action=\"");
      out.print(pjName );
      out.write("/Order?cmd=insert-page\" method='post'>\r\n");
      out.write("\r\n");
      out.write("<fieldset>\r\n");
      out.write("<legend style=\"text-align: center\">주문 및 배송 정보</legend>\r\n");
      out.write("<!-- Text input-->\r\n");
      out.write("<div class=\"form-group\">\r\n");
      out.write("  <label class=\"col-md-4 control-label\" for=\"qName\">주문자명</label>  \r\n");
      out.write(" <div class=\"col-md-5\">\r\n");
      out.write("  <input id=\"qName\" name=\"qName\" type=\"text\" placeholder=\"실명을 입력하지 않을 경우 반품 또는 분실의 우려가 있습니다.\" class=\"form-control input-md\" required=\"\">\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- Text input-->\r\n");
      out.write("<div class=\"form-group\">\r\n");
      out.write("  <label class=\"col-md-4 control-label\" for=\"qEmail\">이메일</label>  \r\n");
      out.write("  <div class=\"col-md-5\">\r\n");
      out.write("  <input id=\"qEmail\" name=\"qEmail\" type=\"text\" placeholder=\"잘못 입력 시 배송정보와 주문정보 확인이 불가합니다.\" class=\"form-control input-md\" required=\"\">\r\n");
      out.write("    \r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- Text input-->\r\n");
      out.write("<div class=\"form-group\">\r\n");
      out.write("  <label class=\"col-md-4 control-label\" for=\"qTel\">연락처</label>  \r\n");
      out.write("  <div class=\"col-md-5\">\r\n");
      out.write("  <input id=\"qTel\" name=\"qTel\" type=\"text\" placeholder=\"잘못 입력 시 택배 도착이 지연될 수 있습니다.\" class=\"form-control input-md\" required=\"\">\r\n");
      out.write("    \r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"form-group\">\r\n");
      out.write("  <label class=\"col-md-4 control-label\" for=\"qTel\">주소</label>  \r\n");
      out.write("  <div class=\"col-md-5\">\r\n");
      out.write("<!--   <input id=\"qTel\" name=\"qTel\" type=\"text\" placeholder=\"주소\" class=\"form-control input-md\" required=\"\"> -->\r\n");
      out.write("    \r\n");
      out.write("  <input id=\"post1\" readonly=\"\" size=\"5\" name=\"post1\"> - <input id=\"post2\" readonly=\"\" size=\"5\" name=\"post2\">\r\n");
      out.write("\t\t\t\t\t<input onclick=\"openDaumPostcode()\" type=\"button\" value=\"우편번호찾기\"><br>\r\n");
      out.write("\t\t\t\t\t<span style=\"LINE-HEIGHT: 10%\"></span>\r\n");
      out.write("\t\t\t\t\t<input id=\"addr1\" readonly=\"\" size=\"40\" name=\"addr1\" placeholder=\"도로명주소\"><br>\r\n");
      out.write("\t\t\t\t\t<span style=\"LINE-HEIGHT: 10%\"></span>\r\n");
      out.write("\t\t\t\t\t<input id=\"addr2\" size=\"40\" name=\"addr2\" placeholder=\"지번주소\">\r\n");
      out.write("\t\t\t\t\t  \r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- Text input-->\r\n");
      out.write("<div class=\"form-group\">\r\n");
      out.write("  <label class=\"col-md-4 control-label\" for=\"qTitle\">배송메모</label>  \r\n");
      out.write("  <div class=\"col-md-4\">\r\n");
      out.write("  <input id=\"qTitle\" name=\"qTitle\" type=\"text\" placeholder=\"20자 이내로 작성해 주세요\" class=\"form-control input-md\" required=\"\">\r\n");
      out.write("  <span class=\"help-block\">\r\n");
      out.write("  * 배송메모 작성시 특수문자 & < > 등은 제외하고 입력해 주시기 바랍니다.\r\n");
      out.write("  </span>\r\n");
      out.write("  <span class=\"help-block\">\r\n");
      out.write("  * 위에 내용을 허위기재 시에 발생하는 모든 불이익은 책임지지 않습니다.\r\n");
      out.write("  </span> \r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<legend style=\"text-align: center\">상품리스트</legend>\r\n");
      out.write("\r\n");
 for(int i=0; i <orderList.size(); i++){ 
      out.write("\r\n");
      out.write("<div class='product'>\r\n");
      out.write("<div ></div>\r\n");
      out.write("<div class=\"form-group\">\r\n");
      out.write("  <label class=\"col-md-4 control-label\" for=\"qTel\">상품이름</label>  \r\n");
      out.write("  <div class=\"col-md-5\">\r\n");
      out.write("  <span class=\"help-block\">\r\n");
      out.write("  ");
      out.print(orderList.get(i).getiName());
      out.write("\r\n");
      out.write("  \r\n");
      out.write("  </span> \r\n");
      out.write("  </div>\r\n");
      out.write("  <div align='right' style=\"position:absolute; y-index:1; right:25%; margin-left:0px; margin-top:0px;\">\r\n");
      out.write("\t<img src=\"");
      out.print(pjName );
      out.write("/img/product/all/");
      out.print(orderList.get(i).getiId() );
      out.write("00.jpg\" width=150px height=150px>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"form-group\">\r\n");
      out.write("  <label class=\"col-md-4 control-label\" for=\"qTel\">금액</label>  \r\n");
      out.write("  <div class=\"col-md-5\">\r\n");
      out.write("  <span class=\"money\">\r\n");
      out.write("  ");
      out.print(orderList.get(i).getiCost());
      out.write("\r\n");
      out.write("  </span> \r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"form-group\">\r\n");
      out.write("  <label class=\"col-md-4 control-label\" for=\"qTel\">수량</label>  \r\n");
      out.write("  <div class=\"col-md-5\">\r\n");
      out.write("  <span class=\"help-block\">\r\n");
      out.write("  <input type=\"button\" name=\"minus\" value = \"-\" class=\"minus\">\r\n");
      out.write("  <input type=\"text\" size='1' name=\"count\" disabled = 'true' class =\"textcnt\" value = \"");
      out.print(orderList.get(i).getiCnt());
      out.write("\">\r\n");
      out.write("  <input type=\"button\" name=\"plus\" value = \"+\" class=\"plus\">\r\n");
      out.write("  <input type=\"hidden\" name=\"iCnt\"  class =\"textcnt\" value = \"");
      out.print(orderList.get(i).getiCnt());
      out.write("\">\r\n");
      out.write("  <input type=\"hidden\" name=\"iId\" value=\"");
      out.print(orderList.get(i).getiId() );
      out.write("\">\r\n");
      out.write("  <br/>\r\n");
      out.write("  <br/>\r\n");
      out.write("  <hr/>\r\n");
      out.write("  </span> \r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
} 
      out.write("\r\n");
      out.write("\r\n");
      out.write("<hr/>\r\n");
      out.write("<div class=\"form-group\">\r\n");
      out.write("  <label class=\"col-md-4 control-label\" for=\"qTel\">장바구니 합계</label>  \r\n");
      out.write("  <div class=\"col-md-5\">\r\n");
      out.write("  <span class=\"help-block\" id=\"sum\">\r\n");
      out.write("  ");
      out.print(sum );
      out.write("원\r\n");
      out.write("  </span> \r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"form-group\">\r\n");
      out.write("  <label class=\"col-md-4 control-label\" for=\"qTel\">배송비</label>  \r\n");
      out.write("  <div class=\"col-md-5\">\r\n");
      out.write("  <span class=\"help-block\">\r\n");
      out.write("  2500원\r\n");
      out.write("  </span> \r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"form-group\">\r\n");
      out.write("  <label class=\"col-md-4 control-label\" for=\"qTel\">총 결제금액</label>  \r\n");
      out.write("  <div class=\"col-md-5\">\r\n");
      out.write("  <span class=\"help-block\" id=\"allmoney\">\r\n");
      out.write("  ");
      out.print(sum+2500 );
      out.write("원\r\n");
      out.write("  </span> \r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<legend style=\"text-align: center\">결제수단</legend>\r\n");
      out.write("\r\n");
      out.write("<div class=\"form-group\">\r\n");
      out.write("  <label class=\"col-md-4 control-label\" for=\"qTel\">결제 방법</label>  \r\n");
      out.write("  <div class=\"col-md-5\">\r\n");
      out.write("  <span class=\"help-block\">\r\n");
      out.write("  <input type=\"radio\" name=\"payment\" value=\"무통장입금\">무통장 입금\r\n");
      out.write("  <input type=\"radio\" name=\"payment\" value=\"계좌이체\"/>계좌이체\r\n");
      out.write("  </span> \r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"form-group\">\r\n");
      out.write("  <label class=\"col-md-4 control-label\" for=\"qTel\">개인정보 수집 및 이용 동의</label>  \r\n");
      out.write("  <div class=\"col-md-5\">\r\n");
      out.write("  <span class=\"help-block\">\r\n");
      out.write("  <input type=\"checkbox\" name=\"check1\" id=\"personal\"> \r\n");
      out.write("  </span> \r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"form-group\">\r\n");
      out.write("  <label class=\"col-md-4 control-label\" for=\"qTel\">회원 이용 약관 동의</label>  \r\n");
      out.write("  <div class=\"col-md-5\">\r\n");
      out.write("  <span class=\"help-block\">\r\n");
      out.write("  <input type=\"checkbox\" name=\"check1\" id=\"member\"> \r\n");
      out.write("  </span> \r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("  \r\n");
      out.write("<div class=\"btn_wrap\">\r\n");
      out.write("   <div class=\"col three\">            \r\n");
      out.write("      <a href=\"#\" class=\"btn2 btn-sunflower2\" id=\"Cancel\">취소하기</a>         \r\n");
      out.write("   </div>\r\n");
      out.write("   <div class=\"col three\">            \r\n");
      out.write("      <a href=\"#\" class=\"btn btn-sunflower\" id=\"Insert\">등록하기</a>         \r\n");
      out.write("   </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</fieldset>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
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
