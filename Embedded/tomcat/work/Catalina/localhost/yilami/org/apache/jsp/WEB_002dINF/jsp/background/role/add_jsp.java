package org.apache.jsp.WEB_002dINF.jsp.background.role;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class add_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/WEB-INF/jsp/background/role/../../common/taglib.jsp");
    _jspx_dependants.add("/WEB-INF/jsp/background/role/../../common/common-css.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;

      out.write('\r');
      out.write('\n');
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /WEB-INF/jsp/background/role/../../common/taglib.jsp(10,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("ctx");
      // /WEB-INF/jsp/background/role/../../common/taglib.jsp(10,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setValue(basePath );
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    ");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write("body {\r\n");
      out.write("\tmargin-left: 0px;\r\n");
      out.write("\tmargin-top: 0px;\r\n");
      out.write("\tmargin-right: 0px;\r\n");
      out.write("\tmargin-bottom: 0px;\r\n");
      out.write("}\r\n");
      out.write(".STYLE1 {font-size: 12px}\r\n");
      out.write(".STYLE3 {font-size: 12px; font-weight: bold; }\r\n");
      out.write(".STYLE4 {\r\n");
      out.write("\tcolor: #03515d;\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("}\r\n");
      out.write("A:HOVER{\r\n");
      out.write("\tcolor: red;\r\n");
      out.write("\ttext-decoration:underline;\r\n");
      out.write("}\r\n");
      out.write("A{\r\n");
      out.write("\tcolor: #03515d;\r\n");
      out.write("\ttext-decoration:NONE;\r\n");
      out.write("}\r\n");
      out.write(".listtable td{\r\n");
      out.write("\tvertical-align: middle;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write(".ttab td{\r\n");
      out.write("border:solid 1px #b5d6e6;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("table{  \r\n");
      out.write("\tborder:0px;\r\n");
      out.write("\tborder-collapse:collapse;  \r\n");
      out.write("\tborder-spacing:0;  \r\n");
      out.write("}  \r\n");
      out.write("th,td{  \r\n");
      out.write("\tborder:0px;\r\n");
      out.write("\tborder-collapse:collapse;  \r\n");
      out.write("\tborder-spacing:0;\r\n");
      out.write("\tpadding:0;  \r\n");
      out.write("}\r\n");
      out.write("/* search */\r\n");
      out.write(".search_k { margin:5px auto; width: 98%; }\r\n");
      out.write("\r\n");
      out.write(".search { border: 1px solid #999999;}\r\n");
      out.write("\r\n");
      out.write(".search legend { width:70px; margin-left:5px; }\r\n");
      out.write("\r\n");
      out.write(".search_content { font-size: 12px; line-height: 100%; padding: 10px; }\r\n");
      out.write("\r\n");
      out.write(".select { width: 98%; text-align: right; margin: 10px auto; clear: both; }\r\n");
      out.write("\r\n");
      out.write(".input_btn_style1{ background:#ffffff url(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/bg_x.gif) 0px 0px repeat-x; height: 23px; border: 1px solid #7F9DB9; color: #1E5494; font-size: 12px; line-height: 20px; text-align: center; cursor: pointer;}\r\n");
      out.write("input.sub{padding:0px 10px 0px 10px;height:28px;color:#000066;background:url(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/sub.png\");border:none;}\r\n");
      out.write("    .btn3_mouseout {\r\n");
      out.write("BORDER-RIGHT: #2C59AA 1px solid; PADDING-RIGHT: 2px; BORDER-TOP: #2C59AA 1px solid; PADDING-LEFT: 2px; FONT-SIZE: 12px; FILTER: progid:DXImageTransform.Microsoft.Gradient(GradientType=0, StartColorStr=#ffffff, EndColorStr=#C3DAF5); BORDER-LEFT: #2C59AA 1px solid; CURSOR: hand; COLOR: black; PADDING-TOP: 2px; BORDER-BOTTOM: #2C59AA 1px solid\r\n");
      out.write("}\r\n");
      out.write(".btn3_mouseover {\r\n");
      out.write("BORDER-RIGHT: #2C59AA 1px solid; PADDING-RIGHT: 2px; BORDER-TOP: #2C59AA 1px solid; PADDING-LEFT: 2px; FONT-SIZE: 12px; FILTER: progid:DXImageTransform.Microsoft.Gradient(GradientType=0, StartColorStr=#ffffff, EndColorStr=#D7E7FA); BORDER-LEFT: #2C59AA 1px solid; CURSOR: hand; COLOR: black; PADDING-TOP: 2px; BORDER-BOTTOM: #2C59AA 1px solid\r\n");
      out.write("}\r\n");
      out.write("-->\r\n");
      out.write("</style>");
      out.write("\r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("  <body>\r\n");
      out.write("<br/>\r\n");
      out.write("<br/>  \r\n");
      out.write("<form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/background/role/add.html\" method=\"post\">\r\n");
      out.write("\t\t<table class=\"ttab\" height=\"100\" width=\"50%\" border=\"0\" cellpadding=\"0\" cellspacing=\"1\"\r\n");
      out.write("\t\t\talign=\"center\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td height=\"30\"\r\n");
      out.write("\t\t\t\t\t colspan=\"2\">\r\n");
      out.write("\t\t\t\t\t<div align=\"center\">\r\n");
      out.write("\t\t\t\t\t<font color=\"blue\" size=\"8\" ><b>添加信息</b></font>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\t\r\n");
      out.write("\t\t\t\t\t<td height=\"30\"width=\"20%\" >\r\n");
      out.write("\t\t\t\t\t\t<div align=\"right\" class=\"STYLE1\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t角色名：\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td >\r\n");
      out.write("\t\t\t\t\t\t<div align=\"left\" class=\"STYLE1\"  style=\"padding-left:10px;\">\r\n");
      out.write("\t\t\t\t\t\t\t <input style=\"height: 20px;width: 200px\" name=\"name\" type=\"text\"/>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\t\r\n");
      out.write("\t\t\t\t\t<td height=\"30\"width=\"20%\" >\r\n");
      out.write("\t\t\t\t\t\t<div align=\"right\" class=\"STYLE1\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t角色roleKey：\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td >\r\n");
      out.write("\t\t\t\t\t\t<div align=\"left\" class=\"STYLE1\"  style=\"padding-left:10px;\">\r\n");
      out.write("\t\t\t\t\t\t\t <input style=\"height: 20px;width: 200px\" name=\"roleKey\" type=\"text\"/>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\t\r\n");
      out.write("\t\t\t\t\t<td height=\"30\"width=\"20%\" >\r\n");
      out.write("\t\t\t\t\t\t<div align=\"right\" class=\"STYLE1\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t是否禁用：\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td >\r\n");
      out.write("\t\t\t\t\t\t<div align=\"left\" class=\"STYLE1\"  style=\"padding-left:10px;\">\r\n");
      out.write("\t\t\t\t\t\t<input name=\"enable\" type=\"radio\" value=\"0\"/>:禁用　　\r\n");
      out.write("\t\t\t\t\t\t<input name=\"enable\" type=\"radio\" value=\"1\"/>:正常\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("<tr>\t\r\n");
      out.write("\t<td height=\"30\"width=\"20%\" >\r\n");
      out.write("\t\t<div align=\"right\" class=\"STYLE1\" >\r\n");
      out.write("\t\t\t\t描述：\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</td>\r\n");
      out.write("\t<td >\r\n");
      out.write("\t\t<div align=\"left\" class=\"STYLE1\"  style=\"padding-left:10px;\">\r\n");
      out.write("\t\t\t<input style=\"height: 20px;width: 200px\" name=\"description\" type=\"text\"/>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</td>\r\n");
      out.write("</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"2\" style=\"padding: 10px\">\r\n");
      out.write("\t\t\t\t\t\t<div align=\"center\">\r\n");
      out.write("\t\t\t \t\t\t\t<input type=\"submit\" value=\"　保　存　\" class=\"input_btn_style1\"/>　　　　\r\n");
      out.write("\t\t\t \t\t\t\t<input id=\"backBt\" type=\"button\" value=\"　返　回　\" class=\"input_btn_style1\" onclick=\"javascript:window.location.href='javascript:history.go(-1)'\"/>\r\n");
      out.write("\t\t \t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("</form>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
