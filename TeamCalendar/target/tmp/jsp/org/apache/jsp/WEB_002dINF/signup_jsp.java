package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("  <head>  \r\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/angularjs/1.8.2/angular.js\"></script>\r\n");
      out.write("  <script type=\"text/javascript\" src=\"/static/js/app.module.js\"></script>\r\n");
      out.write("  <script type=\"text/javascript\" src=\"/static/js/controller/signup_controller.controller.js\" defer></script>\r\n");
      out.write("       <script type=\"text/javascript\" src=\"/static/js/service/signup_service.service.js\" defer></script>\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("    <title>AngularJS $http Example</title>  \r\n");
      out.write("    <style>\r\n");
      out.write("      .username.ng-valid {\r\n");
      out.write("          background-color: lightgreen;\r\n");
      out.write("      }\r\n");
      out.write("      .username.ng-dirty.ng-invalid-required {\r\n");
      out.write("          background-color: red;\r\n");
      out.write("      }\r\n");
      out.write("      .username.ng-dirty.ng-invalid-minlength {\r\n");
      out.write("          background-color: yellow;\r\n");
      out.write("      }\r\n");
      out.write(" \r\n");
      out.write("      .email.ng-valid {\r\n");
      out.write("          background-color: lightgreen;\r\n");
      out.write("      }\r\n");
      out.write("      .email.ng-dirty.ng-invalid-required {\r\n");
      out.write("          background-color: red;\r\n");
      out.write("      }\r\n");
      out.write("      .email.ng-dirty.ng-invalid-email {\r\n");
      out.write("          background-color: yellow;\r\n");
      out.write("      }\r\n");
      out.write(" \r\n");
      out.write("    </style>\r\n");
      out.write("     <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css\">\r\n");
      out.write("     <link href=\"/static/css/styles.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("  <body ng-app=\"myApp\" class=\"ng-cloak\">\r\n");
      out.write("  <header>\r\n");
      out.write("    <nav class=\"navbar navbar-default\">\r\n");
      out.write("      <div class=\"container-fluid\">\r\n");
      out.write("        <div class=\"navbar-header\">\r\n");
      out.write("          <a class=\"navbar-brand\" href=\"/\">Home</a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <ul class=\"nav navbar-nav\">\r\n");
      out.write("          <li><a href=\"/add\">Add</a></li>\r\n");
      out.write("          <li><a href=\"/login\">Login</a></li>\r\n");
      out.write("          <li><a href=\"/signup\">Sign Up</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("  </header>\r\n");
      out.write("  <div class=\"container\" ng-controller=\"SignupController\">\r\n");
      out.write("    <div class=\"panel panel-default\">\r\n");
      out.write("      <div class=\"panel-heading\">\r\n");
      out.write("        <h3 class=\"panel-title\">User Sign Up</h3>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"panel-body\">\r\n");
      out.write("        <form ng-submit=\"submit()\" name=\"myForm\" class=\"form-horizontal\">\r\n");
      out.write("          <input type=\"hidden\" ng-model=\"user.id\" />\r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("            <label class=\"col-sm-2 control-label\" for=\"uname\">Name</label>\r\n");
      out.write("            <div class=\"col-sm-10\">\r\n");
      out.write("              <input type=\"text\" ng-model=\"user.username\" id=\"uname\" class=\"form-control\" placeholder=\"Enter your name\" required ng-minlength=\"2\"/>\r\n");
      out.write("              <div class=\"has-error\" ng-show=\"myForm.$dirty\">\r\n");
      out.write("                <span ng-show=\"myForm.uname.$error.required\">This is a required field</span>\r\n");
      out.write("                <span ng-show=\"myForm.uname.$error.minlength\">Minimum length required is 2</span>\r\n");
      out.write("                <span ng-show=\"myForm.uname.$invalid\">This field is invalid </span>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("            <label class=\"col-sm-2 control-label\" for=\"address\">Address</label>\r\n");
      out.write("            <div class=\"col-sm-10\">\r\n");
      out.write("              <input type=\"text\" ng-model=\"user.address\" id=\"address\" class=\"form-control\" placeholder=\"Enter your Address. [This field is validation free]\"/>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          \r\n");
      out.write("          \r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("            <label class=\"col-sm-2 control-label\" for=\"email\">Email</label>\r\n");
      out.write("            <div class=\"col-sm-10\">\r\n");
      out.write("  \r\n");
      out.write("           <input type=\"email\" ng-model=\"user.email\" id=\"email\" class=\"form-control\" placeholder=\"Enter your Email\" required/>\r\n");
      out.write("              <div class=\"has-error\" ng-show=\"myForm.$dirty\">\r\n");
      out.write("                <span ng-show=\"myForm.email.$error.required\">This is a required field</span>\r\n");
      out.write("                <span ng-show=\"myForm.email.$invalid\">This field is invalid </span>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("            <div class=\"col-sm-offset-2 col-sm-10\">\r\n");
      out.write("              <input type=\"submit\"  value=\"{{!user.id ? 'Add' : 'Update'}}\" class=\"btn btn-primary\" ng-disabled=\"myForm.$invalid\">\r\n");
      out.write("              <button type=\"button\" ng-click=\"reset()\" class=\"btn btn-warning\" ng-disabled=\"myForm.$pristine\">Reset Form</button>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </form>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"panel panel-default\">\r\n");
      out.write("      <div class=\"panel-heading\">\r\n");
      out.write("        <h3 class=\"panel-title\">Team Roster</h3>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"panel-body\">\r\n");
      out.write("        <table class=\"table table-striped\">\r\n");
      out.write("          <thead>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <th>ID.</th>\r\n");
      out.write("              <th>Name</th>\r\n");
      out.write("              <th>Address</th>\r\n");
      out.write("              <th>Email</th>\r\n");
      out.write("              <th width=\"20%\"></th>\r\n");
      out.write("            </tr>\r\n");
      out.write("          </thead>\r\n");
      out.write("          <tbody>\r\n");
      out.write("            <tr ng-repeat=\"u in users\">\r\n");
      out.write("              <td><span ng-bind=\"u.id\"></span></td>\r\n");
      out.write("              <td><span ng-bind=\"u.username\"></span></td>\r\n");
      out.write("              <td><span ng-bind=\"u.address\"></span></td>\r\n");
      out.write("              <td><span ng-bind=\"u.email\"></span></td>\r\n");
      out.write("              <td>\r\n");
      out.write("                <button type=\"button\" ng-click=\"edit(u.id)\" class=\"btn btn-success\">Edit</button>  \r\n");
      out.write("                <button type=\"button\" ng-click=\"remove(u.id)\" class=\"btn btn-danger\">Remove</button>\r\n");
      out.write("              </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("          </tbody>\r\n");
      out.write("        </table>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</body>\r\n");
      out.write("      \r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
