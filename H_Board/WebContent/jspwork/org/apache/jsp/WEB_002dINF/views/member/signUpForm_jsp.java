/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.56
 * Generated at: 2020-08-05 11:01:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.gy.wsp.member.model.vo.Member;

public final class signUpForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/views/member/../common/header.jsp", Long.valueOf(1596589732602L));
    _jspx_dependants.put("/WEB-INF/views/member/../common/footer.jsp", Long.valueOf(1596014528142L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.gy.wsp.member.model.vo.Member");
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
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
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
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>회원가입</title>\r\n");
      out.write("\t<style>\r\n");
      out.write("\t\t/* number 태그 화살표 제거 */\r\n");
      out.write("\t    input[type=\"number\"]::-webkit-outer-spin-button,\r\n");
      out.write("\t    input[type=\"number\"]::-webkit-inner-spin-button {\r\n");
      out.write("\t        -webkit-appearance: none;\r\n");
      out.write("\t        margin: 0;\r\n");
      out.write("\t    }\r\n");
      out.write("\t</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\r\n");

	// Session에 저장되어있는 login정보를 가져와 loginMember 변수에 저장 
	Member loginMember = (Member)session.getAttribute("loginMember");

	// 쿠키에 저장된 saveEmail 꺼내오기
	boolean isSave = false; // 이메일 저장 체크박스 값을 수정하기 위한 변수 
	String saveId = ""; // 쿠키에 저장된 아이디를 저장할 변수 

	Cookie[] cookies = request.getCookies(); // 요청 주소와 관련된 쿠키를 모두 얻어옴.

	// 쿠키에 저장된 이메일 검출 
	if (cookies != null) {
		for (Cookie c : cookies) {

		// 얻어온 쿠키의 이름(key)가 "saveId"와 같은 쿠키를 찾음
		if ("saveId".equals(c.getName())) {
			saveId = c.getValue(); // saveOD 변수에 쿠키에 저장된 value를 저장 
			isSave = true;
		}
		}
	}

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("  <title>WebServer Project</title>\r\n");
      out.write("  \r\n");
      out.write("  <!-- Bootstrap core CSS -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("\t<style>\r\n");
      out.write("\t     body {\r\n");
      out.write("\t       padding-top: 56px;\r\n");
      out.write("\t     }\r\n");
      out.write("\t     \r\n");
      out.write("\t </style>\r\n");
      out.write("\t <!-- sweetalert : alert창을 꾸밀 수 있게 해주는 라이브러리 https://sweetalert.js.org/ -->\r\n");
      out.write(" \t <script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>\r\n");
      out.write("\t <script>\r\n");
      out.write("\t \t/*** 이전 페이지에서 전달받은 내용을 alert창으로 표시하기 ***/\r\n");
      out.write("\t \t\r\n");
      out.write("\t \t");

	 	String msg = (String)(request.getSession().getAttribute("msg"));
	 	String status = (String)(request.getSession().getAttribute("status"));
	 	String text = (String)(request.getSession().getAttribute("text"));
	 	
      out.write("\r\n");
      out.write("\t \t\r\n");
      out.write("\t \t");
 if(msg !=null){ 
      out.write("\r\n");
      out.write("\t\t \tswal({\r\n");
      out.write("\t\t \t\ticon : \"");
      out.print(status);
      out.write("\",\r\n");
      out.write("\t\t \t\ttitle : \"");
      out.print(msg);
      out.write("\",\r\n");
      out.write("\t\t \t\ttext : \"");
      out.print(text != null ? text : "");
      out.write("\"\r\n");
      out.write("\t\t \t});\r\n");
      out.write("\t \t\r\n");
      out.write("\t \t");

	 		//Session에 존재하는 특정 키값의 속성 제거
	 		session.removeAttribute("msg");
	 		session.removeAttribute("status");
	 		session.removeAttribute("text");
	 	}
	 	
      out.write("\r\n");
      out.write("\t </script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- Navigation으로 된 header -->\r\n");
      out.write("\t<div class=\"header navbar navbar-expand-lg navbar-dark bg-dark fixed-top\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<a class=\"navbar-brand\" href=\"");
      out.print(request.getContextPath());
      out.write("\">WebServer Project</a>\r\n");
      out.write("\t\t\t<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarResponsive\" aria-controls=\"navbarResponsive\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("\t\t\t<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("\t\t\t</button>\r\n");
      out.write("\t\t\t<div class=\"collapse navbar-collapse\" id=\"navbarResponsive\">\r\n");
      out.write("\t\t\t\t<ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("\t\t\t\t  <li class=\"nav-item\">\r\n");
      out.write("\t\t\t\t    <a class=\"nav-link\" href=\"");
      out.print(request.getContextPath());
      out.write("/board/list.do?type=2\">Board</a>\r\n");
      out.write("\t\t\t\t  </li>\r\n");
      out.write("\t\t\t\t  \r\n");
      out.write("\t\t\t\t  \r\n");
      out.write("\t\t\t\t  ");
      out.write("\r\n");
      out.write("\t\t\t\t  ");
 if(loginMember == null) {
      out.write("\r\n");
      out.write("\t\t\t\t  <li class=\"nav-item active\">\r\n");
      out.write("\t\t\t\t    <a class=\"nav-link\" data-toggle=\"modal\" href=\"#modal-container-1\">Login</a>\r\n");
      out.write("\t\t\t\t  </li>\r\n");
      out.write("\t\t\t\t  ");
 }else{ 
      out.write("\r\n");
      out.write("\t\t\t\t  <li class=\"nav-item active\">\r\n");
      out.write("\t\t\t\t    <a class=\"nav-link\"  href=\"");
      out.print(request.getContextPath());
      out.write("/member/myPage.do\">");
      out.print( loginMember.getMemberName() );
      out.write("</a>\r\n");
      out.write("\t\t\t\t  </li>\r\n");
      out.write("\t\t\t\t  <li class=\"nav-item active\">\r\n");
      out.write("\t\t\t\t    <a class=\"nav-link\"  href=\"");
      out.print(request.getContextPath());
      out.write("/member/logout.do\">Logout</a>\r\n");
      out.write("\t\t\t\t  </li>\r\n");
      out.write("\t\t\t\t  ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t  \r\n");
      out.write("\t\t\t\t  \r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("\t<div class=\"modal fade\" id=\"modal-container-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("\t\t<div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("\t\t\t<div class=\"modal-content\">\r\n");
      out.write("\t\t\t\t<div class=\"modal-header\">\r\n");
      out.write("\t\t\t\t\t<h5 class=\"modal-title\" id=\"myModalLabel\">LOGIN</h5>\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\">\r\n");
      out.write("\t\t\t\t\t\t<span aria-hidden=\"true\">×</span>\r\n");
      out.write("\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"modal-body\">\t\t\t\t\t\t<!-- 요청 주소 중 최상위 주소 (/wsp)를 얻어옴 -->\r\n");
      out.write("\t\t\t\t\t<form class=\"form-signin\" method=\"POST\" action=\"");
      out.print(request.getContextPath());
      out.write("/member/login.do\"\r\n");
      out.write("\t\t\t\t\t\tonsubmit=\"return loginValidate();\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"memberEmail\" name=\"memberEmail\" placeholder=\"이메일\"\r\n");
      out.write("\t\t\t\t\t\tvalue=\"");
      out.print(saveId);
      out.write("\"> <br>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<input type=\"password\" class=\"form-control\" id=\"memberPwd\" name=\"memberPwd\"\r\n");
      out.write("\t\t\t\t\t\t\tplaceholder=\"비밀번호\"> <br>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"checkbox mb-3\">\r\n");
      out.write("\t\t\t\t\t\t\t<label> \r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"saveEmail\" ");
      out.print(isSave ? "checked" : "" );
      out.write("> 이메일 저장\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<button class=\"btn btn-lg btn-primary btn-block\" type=\"submit\">로그인</button>\r\n");
      out.write("\t\t\t\t\t\t<a class=\"btn btn-lg btn-secondary btn-block\" \r\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.print(request.getContextPath());
      out.write("/member/signUpForm.do\">회원가입</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"modal-footer\">\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-secondary\"\r\n");
      out.write("\t\t\t\t\t\tdata-dismiss=\"modal\">Close</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- Bootstrap core JS -->\r\n");
      out.write("\t<script src=\"https://code.jquery.com/jquery-3.5.1.min.js\"></script>\r\n");
      out.write("\t<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\" integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\t<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js\" integrity=\"sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t// 로그인 유효성 검사\r\n");
      out.write("\t\t// -> 이메일 , 비밀번호 중 하나라도 입력되지 않으면 form태그 기본 이벤트를 제거한다.\r\n");
      out.write("\t\tfunction loginValidate(){\r\n");
      out.write("\t\t\tif($(\"#memberEmail\").val().trim() == \"\"){\r\n");
      out.write("\t\t\t\talert(\"이메일을 입력해 주세요.\")\r\n");
      out.write("\t\t\t\t$(\"#memberEmail\").focus();\r\n");
      out.write("\t\t\t\treturn false; // 기본 이벤트를 제거\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tif($(\"#memberPwd\").val().trim() == \"\"){\r\n");
      out.write("\t\t\t\talert(\"비밀번호를 입력해 주세요.\")\r\n");
      out.write("\t\t\t\t$(\"#memberPwd\").focus();\r\n");
      out.write("\t\t\t\treturn false; // 기본 이벤트를 제거\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\treturn true;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"py-5 text-center\">\r\n");
      out.write("\t\t<h2>회원 가입</h2>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"row\">\r\n");
      out.write("\t\t<div class=\"col-md-4 offset-md-4\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<form method=\"POST\" action=\"signUp.do\" class=\"needs-validation\" name=\"signUpForm\" onsubmit=\"return validate();\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<!-- 이메일 -->\r\n");
      out.write("\t\t\t<div class=\"row mb-3 form-row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-3\">\r\n");
      out.write("\t\t\t\t\t<label for=\"email\">* Email</label>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t <input type=\"email\" class=\"form-control\" id=\"email\" name=\"email\" autocomplete=\"off\" required>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-6 offset-md-3\">\r\n");
      out.write("\t\t\t\t\t<span id=\"checkEmail\">&nbsp;</span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- 이름 -->\r\n");
      out.write("\t\t\t<div class=\"row mb-3 form-row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-3\">\r\n");
      out.write("\t\t\t\t\t<label for=\"name\">* 이름</label>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"name\" name=\"name\"\r\n");
      out.write("\t\t\t\t\t\trequired>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"col-md-6 offset-md-3\">\r\n");
      out.write("\t\t\t\t\t<span id=\"checkName\">&nbsp;</span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<!-- 닉네임 -->\r\n");
      out.write("            <div class=\"row mb-3 form-row\">\r\n");
      out.write("                <div class=\"col-md-3\">\r\n");
      out.write("                    <label for=\"nick\">* 닉네임</label>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-6\">\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"nick\" name=\"nick\" required>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"col-md-6 offset-md-3\">\r\n");
      out.write("                    <span id=\"checkNick\">&nbsp;</span>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("           <!-- 비밀번호 -->\r\n");
      out.write("           <div class=\"row mb-3 form-row\">\r\n");
      out.write("               <div class=\"col-md-3\">\r\n");
      out.write("                   <label for=\"pwd1\">* 비밀번호</label>\r\n");
      out.write("               </div>\r\n");
      out.write("               <div class=\"col-md-6\">\r\n");
      out.write("                   <input type=\"password\" class=\"form-control\" id=\"pwd1\" name=\"pwd1\" maxlength=\"12\" placeholder=\"비밀번호를 입력하세요\" required>\r\n");
      out.write("               </div>\r\n");
      out.write("               \r\n");
      out.write("               <div class=\"col-md-6 offset-md-3\">\r\n");
      out.write("                   <span id=\"checkPwd1\">&nbsp;</span>\r\n");
      out.write("               </div>\r\n");
      out.write("           </div>\r\n");
      out.write("\r\n");
      out.write("           <!-- 비밀번호 확인 -->\r\n");
      out.write("           <div class=\"row mb-3 form-row\">\r\n");
      out.write("               <div class=\"col-md-3\">\r\n");
      out.write("                   <label for=\"pwd2\">* 비밀번호 확인</label>\r\n");
      out.write("               </div>\r\n");
      out.write("               <div class=\"col-md-6\">\r\n");
      out.write("                   <input type=\"password\" class=\"form-control\" id=\"pwd2\" maxlength=\"12\" placeholder=\"비밀번호 확인\" required>\r\n");
      out.write("               </div>\r\n");
      out.write("               \r\n");
      out.write("               <div class=\"col-md-6 offset-md-3\">\r\n");
      out.write("                   <span id=\"checkPwd2\">&nbsp;</span>\r\n");
      out.write("               </div>\r\n");
      out.write("           </div>\r\n");
      out.write("           <br>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t<!-- 성별 -->\t\r\n");
      out.write("\t\t\t<hr class=\"mb-4\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-3\">\r\n");
      out.write("\t\t\t\t\t<label>* 성별</label>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-9 custom-control custom-radio\">\r\n");
      out.write("\t\t\t\t\t<div class=\"form-check form-check-inline\">\r\n");
      out.write("\t\t\t\t\t<input type=\"radio\" name=\"memberGender\" id=\"male\" value=\"a\"\r\n");
      out.write("\t\t\t\t\tclass=\"form-check-input custom-control-input\">\r\n");
      out.write("\t\t\t\t\t<label class=\"form-check-label custom-control-label\" for=\"male\">남</label>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"form-check form-check-inline\">\r\n");
      out.write("\t\t\t\t\t<input type=\"radio\" name=\"memberGender\" id=\"female\" value=\"b\"\r\n");
      out.write("\t\t\t\t\tclass=\"form-check-input custom-control-input\">\r\n");
      out.write("\t\t\t\t\t<label class=\"form-check-label custom-control-label\" for=\"female\">여</label>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div> \r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<hr class=\"mb-4\">\r\n");
      out.write("\t\t\t<button class=\"btn btn-primary btn-lg btn-block\" type=\"submit\">가입하기</button>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t<br><br>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<script>\r\n");
      out.write("\t\t// 각 유효성 검사 결과를 저장할 객체\r\n");
      out.write("\t\tvar signUpcheak = {\r\n");
      out.write("\t\t\t\t\"email\":false,\r\n");
      out.write("\t\t\t\t\"name\":false,\r\n");
      out.write("\t\t\t\t\"nick\":false,\r\n");
      out.write("\t\t\t\t\"pwd1\":false,\r\n");
      out.write("\t\t\t\t\"pwd2\":false,\r\n");
      out.write("\t\t\t\t\"gender\":false\r\n");
      out.write("\t\t\t};\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// ----------------실시간 유효성 검사-------------------/\r\n");
      out.write("\t\t\t// 정규표현식 \r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t// jQuery 변수 : 변수에 직접적으로 제이쿼리 메소드 사용가능.\r\n");
      out.write("\t\t\tvar $email = $(\"#email\");\r\n");
      out.write("\t\t\tvar $name = $(\"#name\");\r\n");
      out.write("\t\t\tvar $nick = $(\"#nick\");\r\n");
      out.write("\t\t\tvar $pwd1 = $(\"#pwd1\");\r\n");
      out.write("\t\t\tvar $pwd2 = $(\"#pwd2\");\r\n");
      out.write("\t\t\tvar $gender = $(\"#gender\");\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t// 이메일 유효성 검사 \r\n");
      out.write("\t\t\t// 영어 대/소문자, 숫자, 총 길이  \r\n");
      out.write("\t\t\t$email.on(\"input\", function(){\r\n");
      out.write("\t\t\t\tvar regExp =  /^[\\w]{4,}@[\\w]+(\\.[\\w]+){1,3}$/; // 4글자 아무단어 @ 아무단어 . * 3아무3\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tif(!regExp.test($(this).val())){ // 입력한 이름이 유효하지 않은 경우\r\n");
      out.write("\t\t\t\t\t$(\"#checkEmail\").text(\"유효하지 않은 이메일 형식입니다.\").css(\"color\",\"red\");\r\n");
      out.write("\t\t\t\t\tsignUpCheck.email = false;\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t$(\"#checkEmail\").text(\"유효한 이메일 입니다.\").css(\"color\",\"green\");\r\n");
      out.write("\t\t\t\t\tsignUpCheck.email = true;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t// 이름 유효성 검사\r\n");
      out.write("\t\t\t$name.on(\"input\", function(){\r\n");
      out.write("\t\t\t\tvar regExp =  /^[가-힣]{2,8}$/; // 한글 두 글자 이상\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tif(!regExp.test($(this).val())){ // 입력한 이름이 유효하지 않은 경우\r\n");
      out.write("\t\t\t\t\t$(\"#checkName\").text(\"한글 두 글자 이상을 입력하세요.\").css(\"color\",\"red\");\r\n");
      out.write("\t\t\t\t\tsignUpCheck.name = false;\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t$(\"#checkName\").text(\"유효한 이름 형식입니다.\").css(\"color\",\"green\");\r\n");
      out.write("\t\t\t\t\tsignUpCheck.name = true;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t// 닉네임 유효성 검사\r\n");
      out.write("\t\t\t// 영어 대/소문자,한글,숫자 총길이\r\n");
      out.write("\t\t\t$nick.on(\"input\", function(){\r\n");
      out.write("\t\t\t\tvar regExp =  /^[가-힣a-zA-Z]{2,9}$/; // 한글 두 글자 이상\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tif(!regExp.test($(this).val())){ // 입력한 이름이 유효하지 않은 경우\r\n");
      out.write("\t\t\t\t\t$(\"#checkNick\").text(\"유효하지 않은 닉네임 입니다.\").css(\"color\",\"red\");\r\n");
      out.write("\t\t\t\t\tsignUpCheck.nick = false;\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t$(\"#checkNick\").text(\"유효한 닉네임 입니다.\").css(\"color\",\"green\");\r\n");
      out.write("\t\t\t\t\tsignUpCheck.nick = true;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t// 비밀번호 유효성 및 일치 검사\r\n");
      out.write("\t\t\t$pwd1.on(\"input\",function(){\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tvar regExp = /^[A-Za-z0-9]{6,12}$/;\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tif(!regExp.test($(\"#pwd1\").val())){\r\n");
      out.write("\t\t\t\t\t$(\"#checkPwd1\").text(\"비밀번호 형식이 유효하지 않습니다.\").css(\"color\",\"red\");\r\n");
      out.write("\t\t\t\t\tsignUpCheck.pwd1 = false;\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t$(\"#checkPwd1\").text(\"유효한 비밀번호 형식입니다.\").css(\"color\",\"green\");\r\n");
      out.write("\t\t\t\t\tsignUpCheck.pwd1 = true;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tif(!signUpCheck.pwd1 && $pwd2.val().length > 0){\r\n");
      out.write("\t\t\t\t\tswal(\"유효한 비밀번호를 작성해 주세요.\");\r\n");
      out.write("\t\t\t\t\t$pwd2.val(\"\");\r\n");
      out.write("\t\t\t\t\t$pwd1.focus();\r\n");
      out.write("\t\t\t\t}else if(signUpCheck.pwd1 && $pwd2.val().length > 0){\r\n");
      out.write("\t\t\t\t\tif($(\"#pwd1\").val().trim() != $(\"#pwd2\").val().trim()){\r\n");
      out.write("\t\t\t\t\t\t$(\"#checkPwd2\").text(\"비밀번호 불일치\").css(\"color\",\"red\");\r\n");
      out.write("\t\t\t\t\t\tsignUpCheck.pwd2 = false;\r\n");
      out.write("\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t$(\"#checkPwd2\").text(\"비밀번호 일치\").css(\"color\",\"green\");\r\n");
      out.write("\t\t\t\t\t\tsignUpCheck.pwd2 = true;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t// submit 동작\r\n");
      out.write("\t\t\tfunction validate(){\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tfor(var key in signUpCheck){\r\n");
      out.write("\t\t\t\t\tif(!signUpCheck[key]){\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\tvar msg;\r\n");
      out.write("\t\t\t\t\t\tswitch(key){\r\n");
      out.write("\t\t\t\t\t\tcase \"email\" : msg=\"이메일이\"; break;\r\n");
      out.write("\t\t\t\t\t\tcase \"name\" : msg= \"이름이\"; break;\r\n");
      out.write("\t\t\t\t\t\tcase \"nick\" : msg=\"닉네임이\"; break;\r\n");
      out.write("\t\t\t\t\t\tcase \"pwd1\" : case \"pwd2\" : msg=\"비밀번호가\"; break;\r\n");
      out.write("\t\t\t\t\t\tcase \"gender\": msg=\"성별이\"; break;\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\talert(msg + \"유효하지 않습니다.\");\r\n");
      out.write("\t\t\t\t\tvar el = \"#\" + key;\r\n");
      out.write("\t\t\t\t\t$(el).focus();\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<!-- Footer -->\r\n");
      out.write("\t<div class=\"py-5 bg-dark footer\">\r\n");
      out.write("\t  <div class=\"container\">\r\n");
      out.write("\t    <p class=\"m-0 text-center text-white\">Copyright &copy; KH Information Educational Institute A-Class</p>\r\n");
      out.write("\t  </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t</body>\r\n");
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
