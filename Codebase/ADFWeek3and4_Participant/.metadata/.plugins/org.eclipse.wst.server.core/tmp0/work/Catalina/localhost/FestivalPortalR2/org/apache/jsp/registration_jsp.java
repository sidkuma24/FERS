/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.27
 * Generated at: 2012-08-09 13:45:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/include.jsp", Long.valueOf(1344516825349L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fjstlcore_005furl_0026_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fjstlcore_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fjstlcore_005furl_0026_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Welcome to Festival Registration System</title>\r\n");
      out.write("<script language=\"JavaScript\">\r\n");
      out.write("<!--\r\n");
      out.write("var nHist = window.history.length;\r\n");
      out.write("if(window.history[nHist] != window.location)\r\n");
      out.write("  window.history.forward();\r\n");
      out.write("//-->\r\n");
      out.write("</script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function isNumeric(value) {\r\n");
      out.write("\t  if (value==\"\" || value == null || !value.toString().match(/^[-]?\\d*\\.?\\d*$/))\r\n");
      out.write("\t  { return false;\r\n");
      out.write("\t  }\r\n");
      out.write("\t  return true;\r\n");
      out.write("\t}\t\t\r\n");
      out.write("\tfunction echeck(str) {\r\n");
      out.write("\t\t   var emailPattern = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}$/;   \r\n");
      out.write("\t\t\t   return emailPattern.test(str);   \t\t\t\t\t\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction validateForm()\r\n");
      out.write("\t{\r\n");
      out.write("\tvar fname=document.forms[\"regform\"][\"FIRSTNAME\"].value;\r\n");
      out.write("\tvar lname=document.forms[\"regform\"][\"LASTNAME\"].value;\r\n");
      out.write("\tvar uname=document.forms[\"regform\"][\"USERNAME\"].value;\r\n");
      out.write("\tvar pwd=document.forms[\"regform\"][\"PASSWORD\"].value;\r\n");
      out.write("\tvar cpwd=document.forms[\"regform\"][\"CPASSWORD\"].value;\r\n");
      out.write("\tvar email=document.forms[\"regform\"][\"EMAIL\"].value;\r\n");
      out.write("\tvar phoneno=document.forms[\"regform\"][\"PHONENO\"].value;\r\n");
      out.write("\tif (fname==null || fname==\"\")\r\n");
      out.write("\t  {\r\n");
      out.write("\t  alert(\"Please provide Firstname\");\r\n");
      out.write("\t  return false;\r\n");
      out.write("\t  }\r\n");
      out.write("\tif (lname==null || lname==\"\")\r\n");
      out.write("\t  {\r\n");
      out.write("\t  alert(\"Please provide Lastname\");\r\n");
      out.write("\t  return false;\r\n");
      out.write("\t  }\r\n");
      out.write("\tif (uname==null || uname==\"\")\r\n");
      out.write("\t  {\r\n");
      out.write("\t  alert(\"Please provide Username\");\r\n");
      out.write("\t  return false;\r\n");
      out.write("\t  }\r\n");
      out.write("\tif (pwd==null || pwd==\"\")\r\n");
      out.write("\t  {\r\n");
      out.write("\t  alert(\"Please provide password\");\r\n");
      out.write("\t  return false;\r\n");
      out.write("\t  }\r\n");
      out.write("\tif (cpwd==null || cpwd==\"\")\r\n");
      out.write("\t  {\r\n");
      out.write("\t  alert(\"Please confirm password\");\r\n");
      out.write("\t  return false;\t\r\n");
      out.write("\t  }\r\n");
      out.write("\tif (email==null || email==\"\")\r\n");
      out.write("\t  {\r\n");
      out.write("\t  alert(\"Please provide Email\");\r\n");
      out.write("\t  return false;\r\n");
      out.write("\t  }\r\n");
      out.write("\tif (phoneno==null || phoneno==\"\")\r\n");
      out.write("\t  {\r\n");
      out.write("\t  alert(\"Please provide Phonenumber\");\r\n");
      out.write("\t  return false;\r\n");
      out.write("\t  }\r\n");
      out.write("\tif(pwd!=cpwd)\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert(\"Password and confirm paswword must be same !!\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif (echeck(email)==false){\r\n");
      out.write("\t\talert(\"Invalid EmailID\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif(isNumeric(phoneno)==false)\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert(\"Invalid Phonenumber\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\tfunction cancelRegistration()\r\n");
      out.write("\t{\r\n");
      out.write("\t\thistory.go(-1);\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\" />\r\n");
      out.write("<link rel=\"StyleSheet\" href=\"css/struts2.css\" type=\"text/css\" />\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".style1 {\r\n");
      out.write("\tfont-size: 12\r\n");
      out.write("}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("<style>\r\n");
      out.write(".error {\r\n");
      out.write("\tcolor: red;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("\tfont-size: 20px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<br/><br/>\r\n");
      out.write("\t<form action=\"newVistor.htm\" name=\"regform\" method=\"post\" onsubmit=\"return validateForm()\">\r\n");
      out.write("\t<table width=\"80%\" align=\"center\"  border=\"2\">\r\n");
      out.write("\t\t<tbody><tr>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t<div id=\"header\">&nbsp;\r\n");
      out.write("\t\t\t<div align=\"center\">Festival Registration System</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<table>\r\n");
      out.write("\t\t\t\t<tbody><tr>\r\n");
      out.write("\t\t\t\t\t<td width=\"100%\">\r\n");
      out.write("\t\t\t\t\t<table align=\"right\" cellpadding=\"2\">\r\n");
      out.write("\t\t\t\t\t\t<tbody><tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"90\">\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"menu\" align=\"center\"><a href=\"");
      if (_jspx_meth_jstlcore_005furl_005f0(_jspx_page_context))
        return;
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\tLogin_Page </a></div>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</tbody></table>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td width=\"900\">\r\n");
      out.write("\t\t\t\t\t<div id=\"content\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<table align=\"center\" border=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<tbody><tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td align=\"center\" colspan=\"2\">\r\n");
      out.write("\t\t\t\t\t\t\t<h3>New Visitor Registration Page</h3>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr><td align=\"center\" colspan=\"2\" style=\"font-style: italic;\">Fields marked (<span style=\"font-weight: bold;color: red; font-size: 15px;\">*</span>) are Mandatory</td></tr>\r\n");
      out.write("\t\t\t\t\t\t<tr><td></td><td></td></tr>\r\n");
      out.write("\t\t\t\t\t\t<tr><td></td><td></td></tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<td><span style=\"font-weight: bold;color: red;font-size: 15px;\">*</span>\r\n");
      out.write("\t\t\t\t\t\t\tFirst Name:</td><td> \r\n");
      out.write("\t\t\t\t\t\t\t   <input type=\"text\" name=\"FIRSTNAME\" size=\"25\"></input></td> \r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t   </tr>\r\n");
      out.write("\t\t\t\t\t   <tr>\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<td><span style=\"font-weight: bold;color: red;font-size: 15px;\">*</span>\r\n");
      out.write("\t\t\t\t\t\t\tLast Name: </td><td><input type=\"text\" name=\"LASTNAME\" size=\"25\"></input></td>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t   </tr>\r\n");
      out.write("\t\t\t\t\t   <tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td><span style=\"font-weight: bold;color: red;font-size: 15px;\">*</span>\r\n");
      out.write("\t\t\t\t\t\t\tUser Name:</td><td><input type=\"text\" name=\"USERNAME\" size=\"25\"></input></td> \r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t   </tr>\r\n");
      out.write("\t\t\t\t\t   <tr>\r\n");
      out.write("\t\t\t\t\t\t    <td><span style=\"font-weight: bold;color: red;font-size: 15px;\">*</span>\r\n");
      out.write("\t\t\t\t\t\t    Password:</td><td><input type=\"password\" name=\"PASSWORD\" size=\"27\"></input></td>\r\n");
      out.write("\t\t\t\t\t\t   \r\n");
      out.write("\t\t\t\t\t   </tr>\r\n");
      out.write("\t\t\t\t\t   <tr>\r\n");
      out.write("\t\t\t\t\t\t    <td><span style=\"font-weight: bold;color: red;font-size: 15px;\">*</span>\r\n");
      out.write("\t\t\t\t\t\t    Confirm Password:</td><td><input type=\"password\" name=\"CPASSWORD\" size=\"27\"></input></td>\r\n");
      out.write("\t\t\t\t\t\t   \r\n");
      out.write("\t\t\t\t\t   </tr>\r\n");
      out.write("\t\t\t\t\t   <tr>\r\n");
      out.write("\t\t\t\t\t\t   <td><span style=\"font-weight: bold;color: red;font-size: 15px;\">*</span>\r\n");
      out.write("\t\t\t\t\t\t    Email: </td><td> <input type=\"text\" name=\"EMAIL\" size=\"25\"></input></td> \r\n");
      out.write("\t\t\t\t\t\t    \r\n");
      out.write("\t\t\t\t\t   </tr>\r\n");
      out.write("\t\t\t\t\t   <tr>\r\n");
      out.write("                           <td><span style=\"font-weight: bold;color: red;font-size: 15px;\">*</span>\r\n");
      out.write("                           Phone Number:</td><td><input type=\"text\" name=\"PHONENO\" size=\"25\"></input></td>\r\n");
      out.write("                           \r\n");
      out.write("\t\t\t\t\t   </tr>\r\n");
      out.write("\t\t\t\t\t   <tr>\r\n");
      out.write("\t\t\t\t\t\t   <td> Address:</td><td> <input type=\"text\" name=\"ADDRESS\" size=\"25\"></input> </td>\r\n");
      out.write("\t\t\t\t\t\t   \r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\t\r\n");
      out.write("\t\t\t\t\t\t   <td colspan=\"2\" align=\"right\">\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t    <input value=\"Register\" type=\"submit\">\r\n");
      out.write("\t\t\t\t\t\t    <input value=\"Clear\" type=\"reset\" ></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</tbody></table>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<!-- content end -->\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</tbody>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t</td>\t\t\t\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr><td colspan=\"4\" align=\"center\"><div style=\"font-size: 15px; color: red; font-weight: bold;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${REGISTRATIONSTATUSMESSAGE}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</div></td></tr>\r\n");
      out.write("\t</tbody></table>\r\n");
      out.write("\t\r\n");
      out.write("\t</form>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_jstlcore_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  jstlcore:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_jstlcore_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fjstlcore_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_jstlcore_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_jstlcore_005furl_005f0.setParent(null);
    // /registration.jsp(123,46) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_jstlcore_005furl_005f0.setValue("/index.jsp");
    int _jspx_eval_jstlcore_005furl_005f0 = _jspx_th_jstlcore_005furl_005f0.doStartTag();
    if (_jspx_th_jstlcore_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fjstlcore_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_jstlcore_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fjstlcore_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_jstlcore_005furl_005f0);
    return false;
  }
}
