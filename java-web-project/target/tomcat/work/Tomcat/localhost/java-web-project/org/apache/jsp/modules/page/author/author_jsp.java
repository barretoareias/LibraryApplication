/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2022-05-14 15:06:31 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.modules.page.author;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class author_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/modules/page/author/author.css", Long.valueOf(1652540348825L));
  }

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<style>");
      out.write(".author {\n");
      out.write("    display: flex;\n");
      out.write("    justify-content: center;\n");
      out.write("    margin-top: 3rem;\n");
      out.write("}");
      out.write("</style>\n");
      out.write("\n");
      out.write("\n");
      out.write("<article class=\"author\">\n");
      out.write("    <form class=\"mdl-card mdl-shadow--2dp\" action=\"author\" method=\"POST\">\n");
      out.write("        <div class=\"mdl-card__title mdl-card--expand\">\n");
      out.write("            <h2 class=\"mdl-card__title-text\">Adicione um autor</h2>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"mdl-card__supporting-text\">\n");
      out.write("            <div>\n");
      out.write("                <div class=\"mdl-textfield mdl-js-textfield mdl-textfield--floating-label\">\n");
      out.write("                    <input class=\"mdl-textfield__input\" type=\"text\" id=\"name\" name=\"name\" required>\n");
      out.write("                    <label class=\"mdl-textfield__label\" for=\"name\">Nome</label>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"mdl-card__actions mdl-card--border\">\n");
      out.write("            <button id=\"registerButton\" type=\"submit\" class=\"mdl-button mdl-button--colored mdl-js-button mdl-js-ripple-effect\">\n");
      out.write("                Cadastrar\n");
      out.write("            </button>\n");
      out.write("        </div>\n");
      out.write("    </form>\n");
      out.write("</article>");
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
