package org.apache.jsp.WEB_002dINF.jsp.background.log;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.util.*;
import java.util.*;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(4);
    _jspx_dependants.add("/WEB-INF/jsp/background/log/../../common/taglib.jsp");
    _jspx_dependants.add("/WEB-INF/jsp/background/log/../../common/common-css.jsp");
    _jspx_dependants.add("/WEB-INF/jsp/background/log/../../common/common-js.jsp");
    _jspx_dependants.add("/WEB-INF/jsp/background/log/../../common/webfenye.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fend_005fbegin;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fend_005fbegin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fend_005fbegin.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      response.setContentType("text/html; charset=UTF-8");
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
      // /WEB-INF/jsp/background/log/../../common/taglib.jsp(10,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("ctx");
      // /WEB-INF/jsp/background/log/../../common/taglib.jsp(10,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setValue(basePath );
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
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
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery-1.4.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- 创建兼容 IE/FireFox 的 event 及 event 的 srcElement、fromElement、toElement 属性 -->\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    if (window.addEventListener) {\r\n");
      out.write("        FixPrototypeForGecko();\r\n");
      out.write("    }\r\n");
      out.write("    function FixPrototypeForGecko() {\r\n");
      out.write("        HTMLElement.prototype.__defineGetter__(\"runtimeStyle\", element_prototype_get_runtimeStyle);\r\n");
      out.write("        window.constructor.prototype.__defineGetter__(\"event\", window_prototype_get_event);\r\n");
      out.write("        Event.prototype.__defineGetter__(\"srcElement\", event_prototype_get_srcElement);\r\n");
      out.write("        Event.prototype.__defineGetter__(\"fromElement\", element_prototype_get_fromElement);\r\n");
      out.write("        Event.prototype.__defineGetter__(\"toElement\", element_prototype_get_toElement);\r\n");
      out.write("    }\r\n");
      out.write("    function element_prototype_get_runtimeStyle() {\r\n");
      out.write("        return this.style;\r\n");
      out.write("    }\r\n");
      out.write("    function window_prototype_get_event() {\r\n");
      out.write("        return SearchEvent();\r\n");
      out.write("    }\r\n");
      out.write("    function event_prototype_get_srcElement() {\r\n");
      out.write("        return this.target;\r\n");
      out.write("    }\r\n");
      out.write("    function element_prototype_get_fromElement() {\r\n");
      out.write("        var node;\r\n");
      out.write("        if (this.type == \"mouseover\") node = this.relatedTarget;\r\n");
      out.write("        else if (this.type == \"mouseout\") node = this.target;\r\n");
      out.write("        if (!node) return;\r\n");
      out.write("        while (node.nodeType != 1) node = node.parentNode;\r\n");
      out.write("        return node;\r\n");
      out.write("    }\r\n");
      out.write("    function element_prototype_get_toElement() {\r\n");
      out.write("        var node;\r\n");
      out.write("        if (this.type == \"mouseout\") node = this.relatedTarget;\r\n");
      out.write("        else if (this.type == \"mouseover\") node = this.target;\r\n");
      out.write("        if (!node) return;\r\n");
      out.write("        while (node.nodeType != 1) node = node.parentNode;\r\n");
      out.write("        return node;\r\n");
      out.write("    }\r\n");
      out.write("    function SearchEvent() {\r\n");
      out.write("        if (document.all) return window.event;\r\n");
      out.write("        func = SearchEvent.caller;\r\n");
      out.write("        while (func != null) {\r\n");
      out.write("            var arg0 = func.arguments[0];\r\n");
      out.write("            if (arg0 instanceof Event) {\r\n");
      out.write("                return arg0;\r\n");
      out.write("            }\r\n");
      out.write("            func = func.caller;\r\n");
      out.write("        }\r\n");
      out.write("        return null;\r\n");
      out.write("    }\r\n");
      out.write("var  highlightcolor='#c1ebff';\r\n");
      out.write("var  clickcolor='#51b2f6';\r\n");
      out.write("function  changeto(){\r\n");
      out.write("source=event.srcElement;\r\n");
      out.write("if  (source.tagName==\"TR\"||source.tagName==\"TABLE\")\r\n");
      out.write("return;\r\n");
      out.write("while(source.tagName!=\"TD\")\r\n");
      out.write("source=source.parentElement;\r\n");
      out.write("source=source.parentElement;\r\n");
      out.write("cs  =  source.children;\r\n");
      out.write("//alert(cs.length);\r\n");
      out.write("if  (cs[1].style.backgroundColor!=highlightcolor&&source.id!=\"nc\"&&cs[1].style.backgroundColor!=clickcolor)\r\n");
      out.write("for(i=0;i<cs.length;i++){\r\n");
      out.write("\tcs[i].style.backgroundColor=highlightcolor;\r\n");
      out.write("}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function  changeback(){\r\n");
      out.write("if  (event.fromElement.contains(event.toElement)||source.contains(event.toElement)||source.id==\"nc\")\r\n");
      out.write("return\r\n");
      out.write("if  (event.toElement!=source&&cs[1].style.backgroundColor!=clickcolor)\r\n");
      out.write("//source.style.backgroundColor=originalcolor\r\n");
      out.write("for(i=0;i<cs.length;i++){\r\n");
      out.write("\tcs[i].style.backgroundColor=\"\";\r\n");
      out.write("}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function  clickto(){\r\n");
      out.write("source=event.srcElement;\r\n");
      out.write("if  (source.tagName==\"TR\"||source.tagName==\"TABLE\")\r\n");
      out.write("return;\r\n");
      out.write("while(source.tagName!=\"TD\")\r\n");
      out.write("source=source.parentElement;\r\n");
      out.write("source=source.parentElement;\r\n");
      out.write("cs  =  source.children;\r\n");
      out.write("//alert(cs.length);\r\n");
      out.write("if  (cs[1].style.backgroundColor!=clickcolor&&source.id!=\"nc\")\r\n");
      out.write("for(i=0;i<cs.length;i++){\r\n");
      out.write("\tcs[i].style.backgroundColor=clickcolor;\r\n");
      out.write("}\r\n");
      out.write("else\r\n");
      out.write("for(i=0;i<cs.length;i++){\r\n");
      out.write("\tcs[i].style.backgroundColor=\"\";\r\n");
      out.write("}\r\n");
      out.write("}\r\n");
      out.write("function pageNow(pageNow){\r\n");
      out.write("\t var fy=$(\"#fenye\").serialize(); //对表彰数据进行序列化\r\n");
      out.write("\t var f=$(\"#fenye\").attr(\"action\");//获取表单action的属性值\r\n");
      out.write("\t var pCount = parseInt(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageView.pageCount}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\");\r\n");
      out.write("\tif(pageNow < 1){\r\n");
      out.write("\t\t\talert(\" 不 好 意 思 ， 已 经 是 第 一 页 啦  ！\");\r\n");
      out.write("\t\t\treturn false ;\r\n");
      out.write("\t\t}else if(pCount < pageNow){\r\n");
      out.write("\t\talert(\" 没 有 下 一 页 啦 ！\");\r\n");
      out.write("\t\treturn false ;\r\n");
      out.write("\t}else{\r\n");
      out.write("\t\t\twindow.location.href=f+\"?pageNow=\"+pageNow+\"&\"+fy;\r\n");
      out.write("\t\t};\r\n");
      out.write("}\r\n");
      out.write("//<!--\t\t################# 全选\t    取消全选      -->\r\n");
      out.write("\t\tfunction selectAllCheckBox()\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\tvar chose;\r\n");
      out.write("\t\t\t\tif(document.getElementById(\"chose\").checked){\r\n");
      out.write("\t\t\t\t\tchose = document.getElementById(\"chose\").checked;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif(document.getElementById(\"choseAll\").checked){\r\n");
      out.write("\t\t\t\t\tchose = document.getElementById(\"choseAll\").checked;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tvar checkboxArray = document.getElementsByName(\"check\");\r\n");
      out.write("\t\t\t\tif(checkboxArray != null)\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\tfor(var i = 0; i < checkboxArray.length; i++)\r\n");
      out.write("\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\tcheckboxArray[i].checked = chose;\r\n");
      out.write("\t\t\t\t\t};\r\n");
      out.write("\t\t\t\t};\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("//点击删除时是否有勾选\r\n");
      out.write("function result()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tvar checks = document.getElementsByName(\"check\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfor(var i = 0; i < checks.length; i++)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tif(checks[i].checked == true)\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t};\r\n");
      out.write("\t\t};\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("function deleteAll(){\r\n");
      out.write("\tvar f=$(\"#fenye\").attr(\"action\");//获取表单action的属性值\r\n");
      out.write("\tf=f.substring(0,f.lastIndexOf(\"/\")+1);\r\n");
      out.write("\t\tif(result() != false)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\talert(\" 请 选 择 你 要 删 除 的 项 ！\");\r\n");
      out.write("\t\t}else\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tif(window.confirm(\" 你 确  定 要 全 部 删 除 吗 ！删 除 后 不 可 恢 复 !\"))\r\n");
      out.write("\t\t\t{ \r\n");
      out.write("\t\t\t    document.fenye.action = f+\"deleteAll.html\";\r\n");
      out.write("\t\t \t\tdocument.fenye.submit();\r\n");
      out.write("\t\t\t};\r\n");
      out.write("\t\t};\r\n");
      out.write("\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction deleteId(url){\r\n");
      out.write("\t\tif(window.confirm(\" 你 确  定 要 删 除 吗 ！删 除 后 不 可 恢 复 !\"))\r\n");
      out.write("\t\t{ \r\n");
      out.write("\t\t    window.location.href=url;\r\n");
      out.write("\t\t};\r\n");
      out.write("\t}\r\n");
      out.write("//针对重置按钮失效，清空查询条件\r\n");
      out.write("function clearText(){\r\n");
      out.write("\tvar input = document.getElementsByTagName(\"input\");\r\n");
      out.write("\tfor(var i=0;i<input.length;i++){\r\n");
      out.write("\t\tif(input[i].type==\"text\" || input[i].type==\"password\"){\r\n");
      out.write("\t\t\tinput[i].value=\"\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/css/fenyecss.css\" />\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("  input{font-size: 12px}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<form id=\"fenye\" name=\"fenye\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/background/log/query.html\" method=\"post\">\r\n");
      out.write("<table width=\"100%\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"30\" background=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/tab_05.gif\"><table width=\"100%\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"12\" height=\"30\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/tab_03.gif\" width=\"12\" height=\"30\" /></td>\r\n");
      out.write("        <td><table width=\"100%\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td width=\"46%\" valign=\"middle\"><table width=\"100%\">\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td width=\"5%\"><div align=\"center\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/tb.gif\" width=\"16\" height=\"16\" /></div></td>\r\n");
      out.write("                <td width=\"95%\" class=\"STYLE1\"><span class=\"STYLE3\">你当前的位置</span>：登陆信息管理-登陆信息列表</td>\r\n");
      out.write("              </tr>\r\n");
      out.write("            </table></td>\r\n");
      out.write("            <td width=\"54%\">&nbsp;</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </table></td>\r\n");
      out.write("        <td width=\"16\">&nbsp;</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("  <td align=\"center\">\r\n");
      out.write("  <!-- 这里的表单 name 必须是fenye -->\r\n");
      out.write("  \t<div class=\"search_k\" align=\"left\">\r\n");
      out.write("\t\t<fieldset class=\"search\">\r\n");
      out.write("\t\t\t<legend><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/search_btn.gif\" align=\"middle\"/>&nbsp;<span class=\"STYLE1\" style=\"color: blue;\">高级查找</span></legend>\r\n");
      out.write("\t\t\t<div class=\"search_content\">\r\n");
      out.write("\t\t\t\t用户名：<input type=\"text\" name=\"username\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.username}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" style=\"height: 20px\"/>　　\r\n");
      out.write("\t\t\t\t模块：<input type=\"text\" name=\"module\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.module}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" style=\"height: 20px\"/>　\r\n");
      out.write("\t\t\t\t<input type=\"submit\" value=\"开始查询\" class=\"input_btn_style1\"/>&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t<input type=\"reset\" value=\"重置\" class=\"input_btn_style1\"/>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</fieldset>\r\n");
      out.write("\t</div>\r\n");
      out.write("  </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td><table class=\"listtable\" width=\"100%\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"8\" background=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/tab_12.gif\">&nbsp;</td>\r\n");
      out.write("        <td><table class=\"ttab\" width=\"100%\" cellspacing=\"1\" onMouseOver=\"changeto()\"  onmouseout=\"changeback()\">\r\n");
      out.write("          <tr>\r\n");
      out.write(" \t\t\t<td width=\"5%\" height=\"22\" background=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/bg.gif\" ><span class=\"STYLE1\">用户名</span></td>\r\n");
      out.write("            <td width=\"5%\" height=\"22\" background=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/bg.gif\" ><span class=\"STYLE1\">模块</span></td>\r\n");
      out.write("            <td width=\"12%\" height=\"22\" background=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/bg.gif\" ><span class=\"STYLE1\">执行操作</span></td>\r\n");
      out.write("            <td width=\"12%\" height=\"22\" background=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/bg.gif\" ><span class=\"STYLE1\">花费时间</span></td>\r\n");
      out.write("            <td width=\"15%\" height=\"22\" background=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/bg.gif\"  class=\"STYLE1\">执行时间</td>\r\n");
      out.write("            <td width=\"15%\" height=\"22\" background=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/bg.gif\"  class=\"STYLE1\">用户ＩＰ</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("          \r\n");
      out.write("          ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        </table></td>\r\n");
      out.write("        <td width=\"8\" background=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/tab_15.gif\">&nbsp;</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"35\" background=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/tab_19.gif\">");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"12\" height=\"35\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/tab_18.gif\" width=\"12\" height=\"35\" /></td>\r\n");
      out.write("        <td><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td class=\"STYLE4\">&nbsp;&nbsp;总记录数:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageView.rowCount}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("条 |每页显示:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageView.pageSize}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("条 | 总页数:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageView.pageCount}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("页</td>\r\n");
      out.write("            <td><table border=\"0\" align=\"right\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td width=\"40\" class=\"STYLE4\">\r\n");
      out.write("                  <a href=\"#\" onclick=\"pageNow('1');\">\r\n");
      out.write("                  \t首页\r\n");
      out.write("                  </a>\r\n");
      out.write("                  </td>\r\n");
      out.write("                  <td width=\"45\" class=\"STYLE4\">\r\n");
      out.write("                  <a href=\"#\" onclick=\"return pageNow('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageView.pageNow - 1}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("')\">\r\n");
      out.write("                  \t上一页\r\n");
      out.write("                  </a>\r\n");
      out.write("                  </td>\r\n");
      out.write("                  <td align=\"center\">\r\n");
      out.write("                  ");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write("&nbsp;\r\n");
      out.write("                  </td>\r\n");
      out.write("                  <td width=\"45\" class=\"STYLE4\">\r\n");
      out.write("                  <a href=\"#\" onclick=\"pageNow('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageView.pageNow + 1}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("')\">\r\n");
      out.write("                  \t下一页\r\n");
      out.write("                  </a>\r\n");
      out.write("                  </td>\r\n");
      out.write("                  <td width=\"40\" class=\"STYLE4\">\r\n");
      out.write("                  <a href=\"#\" onclick=\"pageNow('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageView.pageCount}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("')\">\r\n");
      out.write("                 \t尾页\r\n");
      out.write("                  </a>\r\n");
      out.write("                  </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </table></td>\r\n");
      out.write("        <td width=\"16\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/tab_20.gif\" width=\"16\" height=\"35\" /></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table>");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/jsp/background/log/list.jsp(66,10) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("log");
    // /WEB-INF/jsp/background/log/list.jsp(66,10) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageView.records}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("          <tr>\r\n");
          out.write("            <td height=\"20\" ><span class=\"STYLE1\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${log.username}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</span></td>\r\n");
          out.write("            <td height=\"20\" ><span class=\"STYLE1\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${log.module}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</span></td>\r\n");
          out.write("            <td height=\"20\" ><span class=\"STYLE1\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${log.action}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</span></td>\r\n");
          out.write("            <td height=\"20\" ><span class=\"STYLE1\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${log.actionTime}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</span></td>\r\n");
          out.write("            <td height=\"20\" ><span class=\"STYLE1\">\r\n");
          out.write("            ");
          if (_jspx_meth_fmt_005fformatDate_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("\r\n");
          out.write("            </span></td>\r\n");
          out.write("\t\t\t<td height=\"20\" ><span class=\"STYLE1\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${log.userIP}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</span></td>\r\n");
          out.write("\t\t\t</tr>\r\n");
          out.write("          ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fformatDate_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_005fformatDate_005f0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fformatDate_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /WEB-INF/jsp/background/log/list.jsp(73,12) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${log.operTime}", java.util.Date.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/jsp/background/log/list.jsp(73,12) name = pattern type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f0.setPattern("yyyy-MM-dd HH:mm:ss");
    int _jspx_eval_fmt_005fformatDate_005f0 = _jspx_th_fmt_005fformatDate_005f0.doStartTag();
    if (_jspx_th_fmt_005fformatDate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fend_005fbegin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent(null);
    // /WEB-INF/jsp/background/log/../../common/webfenye.jsp(22,18) name = begin type = int reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setBegin(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageView.pageindex.startindex}", java.lang.Integer.class, (PageContext)_jspx_page_context, null, false)).intValue());
    // /WEB-INF/jsp/background/log/../../common/webfenye.jsp(22,18) name = end type = int reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setEnd(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageView.pageindex.endindex}", java.lang.Integer.class, (PageContext)_jspx_page_context, null, false)).intValue());
    // /WEB-INF/jsp/background/log/../../common/webfenye.jsp(22,18) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVar("key");
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_c_005fif_005f0(_jspx_th_c_005fforEach_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_c_005fif_005f1(_jspx_th_c_005fforEach_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f1.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fend_005fbegin.reuse(_jspx_th_c_005fforEach_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f1);
    // /WEB-INF/jsp/background/log/../../common/webfenye.jsp(23,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageView.pageNow==key}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t&nbsp;<span class=\"current\" style=\"color: red;font-size: 20px;\"> ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${key}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</span>\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f1);
    // /WEB-INF/jsp/background/log/../../common/webfenye.jsp(26,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageView.pageNow!=key}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t&nbsp;<a href=\"#\" onclick=\"pageNow('");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${key}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("')\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${key}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</a>\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
    return false;
  }
}
