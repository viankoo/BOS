/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2017-07-10 12:25:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages.base;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class standard_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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
      out.write(" <!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t\t<title>取派标准</title>\r\n");
      out.write("\t\t<!-- 导入jquery核心类库 -->\r\n");
      out.write("\t\t<!-- 导入jquery核心类库 -->\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery-1.8.3.js\"></script>\r\n");
      out.write("<!-- 导入easyui类库 -->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/themes/default/easyui.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/themes/icon.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/ext/portal.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/default.css\">\t\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/jquery.easyui.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/ext/jquery.portal.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/ext/jquery.cookie.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/locale/easyui-lang-zh_CN.js\"\r\n");
      out.write("\ttype=\"text/javascript\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t$(function(){\r\n");
      out.write("\t\t\t\t// 先将body隐藏，再显示，不会出现页面刷新效果\r\n");
      out.write("\t\t\t\t$(\"body\").css({visibility:\"visible\"});\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t// 收派标准信息表格\r\n");
      out.write("\t\t\t\t$('#grid').datagrid( {\r\n");
      out.write("\t\t\t\t\ticonCls : 'icon-forward',\r\n");
      out.write("\t\t\t\t\tfit : true,\r\n");
      out.write("\t\t\t\t\tborder : false,\r\n");
      out.write("\t\t\t\t\trownumbers : true,\r\n");
      out.write("\t\t\t\t\tstriped : true,\r\n");
      out.write("\t\t\t\t\tpageList: [30,50,100],\r\n");
      out.write("\t\t\t\t\tpagination : true,\r\n");
      out.write("\t\t\t\t\ttoolbar : toolbar,\r\n");
      out.write("\t\t\t\t\turl : \"../../data/standard.json\",\r\n");
      out.write("\t\t\t\t\tidField : 'id',\r\n");
      out.write("\t\t\t\t\tcolumns : columns\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\t// 添加取派员窗口\r\n");
      out.write("\t\t\t\t$('#addStaffWindow').window({\r\n");
      out.write("\t\t\t        title: '取派员操作',\r\n");
      out.write("\t\t\t        width: 600,\r\n");
      out.write("\t\t\t        modal: true,\r\n");
      out.write("\t\t\t        shadow: true,\r\n");
      out.write("\t\t\t        closed: true,\r\n");
      out.write("\t\t\t        height: 400,\r\n");
      out.write("\t\t\t        resizable:false,\r\n");
      out.write("\t\t\t        onBeforeClose:function(){\r\n");
      out.write("\t\t\t        \t//   清除form 表单数据 尤其  隐藏id 一定要清除  reset   jquery --->Dom\r\n");
      out.write("\t\t\t        \t  $(\"#addStaffForm\")[0].reset();//  text  \r\n");
      out.write("\t\t\t        \t $(\"#tel\").removeClass('validatebox-invalid');  \r\n");
      out.write("\t\t\t             $(\"#id\").val(\"\");  //  一定将隐藏id 值清除 // hidden\r\n");
      out.write("\t\t\t        }\r\n");
      out.write("\t\t\t    });\r\n");
      out.write("\t\t\t});\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t//工具栏\r\n");
      out.write("\t\t\tvar toolbar = [ {\r\n");
      out.write("\t\t\t\tid : 'button-add',\r\n");
      out.write("\t\t\t\ttext : '增加',\r\n");
      out.write("\t\t\t\ticonCls : 'icon-add',\r\n");
      out.write("\t\t\t\thandler : function(){\r\n");
      out.write("\t\t\t\t\t$('#addStaffWindow').window(\"open\");\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}, {\r\n");
      out.write("\t\t\t\tid : 'button-edit',\r\n");
      out.write("\t\t\t\ttext : '修改',\r\n");
      out.write("\t\t\t\ticonCls : 'icon-edit',\r\n");
      out.write("\t\t\t\thandler : function(){\r\n");
      out.write("\t\t\t\t\talert('修改');\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t},{\r\n");
      out.write("\t\t\t\tid : 'button-delete',\r\n");
      out.write("\t\t\t\ttext : '作废',\r\n");
      out.write("\t\t\t\ticonCls : 'icon-cancel',\r\n");
      out.write("\t\t\t\thandler : function(){\r\n");
      out.write("\t\t\t\t\talert('作废');\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t},{\r\n");
      out.write("\t\t\t\tid : 'button-restore',\r\n");
      out.write("\t\t\t\ttext : '还原',\r\n");
      out.write("\t\t\t\ticonCls : 'icon-save',\r\n");
      out.write("\t\t\t\thandler : function(){\r\n");
      out.write("\t\t\t\t\talert('还原');\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}];\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t// 定义列\r\n");
      out.write("\t\t\tvar columns = [ [ {\r\n");
      out.write("\t\t\t\tfield : 'id',\r\n");
      out.write("\t\t\t\tcheckbox : true\r\n");
      out.write("\t\t\t},{\r\n");
      out.write("\t\t\t\tfield : 'name',\r\n");
      out.write("\t\t\t\ttitle : '标准名称',\r\n");
      out.write("\t\t\t\twidth : 120,\r\n");
      out.write("\t\t\t\talign : 'center'\r\n");
      out.write("\t\t\t}, {\r\n");
      out.write("\t\t\t\tfield : 'minWeight',\r\n");
      out.write("\t\t\t\ttitle : '最小重量',\r\n");
      out.write("\t\t\t\twidth : 120,\r\n");
      out.write("\t\t\t\talign : 'center'\r\n");
      out.write("\t\t\t}, {\r\n");
      out.write("\t\t\t\tfield : 'maxWeight',\r\n");
      out.write("\t\t\t\ttitle : '最大重量',\r\n");
      out.write("\t\t\t\twidth : 120,\r\n");
      out.write("\t\t\t\talign : 'center'\r\n");
      out.write("\t\t\t}, {\r\n");
      out.write("\t\t\t\tfield : 'minLength',\r\n");
      out.write("\t\t\t\ttitle : '最小长度',\r\n");
      out.write("\t\t\t\twidth : 120,\r\n");
      out.write("\t\t\t\talign : 'center'\r\n");
      out.write("\t\t\t}, {\r\n");
      out.write("\t\t\t\tfield : 'maxLength',\r\n");
      out.write("\t\t\t\ttitle : '最大长度',\r\n");
      out.write("\t\t\t\twidth : 120,\r\n");
      out.write("\t\t\t\talign : 'center'\r\n");
      out.write("\t\t\t}, {\r\n");
      out.write("\t\t\t\tfield : 'operator',\r\n");
      out.write("\t\t\t\ttitle : '操作人',\r\n");
      out.write("\t\t\t\twidth : 120,\r\n");
      out.write("\t\t\t\talign : 'center'\r\n");
      out.write("\t\t\t}, {\r\n");
      out.write("\t\t\t\tfield : 'operatingTime',\r\n");
      out.write("\t\t\t\ttitle : '操作时间',\r\n");
      out.write("\t\t\t\twidth : 120,\r\n");
      out.write("\t\t\t\talign : 'center'\r\n");
      out.write("\t\t\t}, {\r\n");
      out.write("\t\t\t\tfield : 'company',\r\n");
      out.write("\t\t\t\ttitle : '操作单位',\r\n");
      out.write("\t\t\t\twidth : 120,\r\n");
      out.write("\t\t\t\talign : 'center'\r\n");
      out.write("\t\t\t} ] ];\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\r\n");
      out.write("\t<body class=\"easyui-layout\" style=\"visibility:hidden;\">\r\n");
      out.write("\t\t<div region=\"center\" border=\"false\">\r\n");
      out.write("\t\t\t<table id=\"grid\"></table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- 添加取派员窗体  -->\r\n");
      out.write("\t<div class=\"easyui-window\" title=\"对收派员进行添加或者修改\" id=\"addStaffWindow\" collapsible=\"false\" minimizable=\"false\" maximizable=\"false\" style=\"top:20px;left:200px\">\r\n");
      out.write("\t\t<div region=\"north\" style=\"height:31px;overflow:hidden;\" split=\"false\" border=\"false\" >\r\n");
      out.write("\t\t\t<div class=\"datagrid-toolbar\">\r\n");
      out.write("\t\t\t\t<a id=\"save\" icon=\"icon-save\" href=\"#\" class=\"easyui-linkbutton\" plain=\"true\" >保存</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div region=\"center\" style=\"overflow:auto;padding:5px;\" border=\"false\">\r\n");
      out.write("\t\t\t<form id=\"addStaffForm\" method=\"post\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/bc/staffAction_save\">\r\n");
      out.write("\t\t\t\t<table class=\"table-edit\" width=\"80%\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t<tr class=\"title\">\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"2\">收派员信息</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>姓名</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" name=\"id\" id=\"id\"/>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"name\" class=\"easyui-validatebox\" data-options=\"required:true\"/></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>手机</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input id=\"tel\" type=\"text\" name=\"telephone\" class=\"easyui-validatebox\" \r\n");
      out.write("\t\t\t\t\t\t   data-options=\"required:true,validType:['telephone','uniquePhone']\"/>\r\n");
      out.write("\t\t\t\t\t\t   <span id=\"tel_sp\"></span>\r\n");
      out.write("\t\t\t\t\t\t   </td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>单位</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" name=\"station\" class=\"easyui-validatebox\" required=\"true\"/></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"2\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"checkbox\" name=\"haspda\" value=\"1\" />\r\n");
      out.write("\t\t\t\t\t\t是否有PDA</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>取派标准</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"standard\" class=\"easyui-validatebox\" required=\"true\"/>  \r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}