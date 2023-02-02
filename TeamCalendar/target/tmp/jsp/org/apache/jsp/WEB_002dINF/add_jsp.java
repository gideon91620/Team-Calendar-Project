package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html ng-app=\"myApp\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Add Event Page</title>\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js\"></script>\r\n");
      out.write("<script src=\"/static/js/app.module.js\"></script>\r\n");
      out.write("<script src=\"/static/js/controller/event_controller.js\"></script>\r\n");
      out.write("<script src=\"/static/js/service/event_service.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body ng-controller=\"EventController\">\r\n");
      out.write("<header>\r\n");
      out.write("  <nav>\r\n");
      out.write("    <a href=\"/\">Home</a>\r\n");
      out.write("    <a href=\"/add\">Add</a>\r\n");
      out.write("    <a href=\"/login\">Login</a>\r\n");
      out.write("    <a href=\"/signup\">Sign Up</a>\r\n");
      out.write("  </nav>\r\n");
      out.write("  \r\n");
      out.write("  </header> \r\n");
      out.write("  \r\n");
      out.write("<h1>Add Page</h1>\r\n");
      out.write("\r\n");
      out.write("<form>\r\n");
      out.write("        <div>\r\n");
      out.write("            <label for=\"eventName\">Event Name:</label>\r\n");
      out.write("            <input type=\"text\" id=\"eventName\" ng-model=\"event.name\" required />\r\n");
      out.write("        </div>\r\n");
      out.write("        <div>\r\n");
      out.write("            <label for=\"eventType\">Event Type:</label>\r\n");
      out.write("            <select id=\"eventType\" ng-model=\"event.type\" required>\r\n");
      out.write("                <option value=\"practice\">Practice</option>\r\n");
      out.write("                <option value=\"game\">Game</option>\r\n");
      out.write("                <option value=\"meeting\">Meeting</option>\r\n");
      out.write("                <option value=\"other\">Other</option>\r\n");
      out.write("            </select>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div>\r\n");
      out.write("            <label for=\"eventLocation\">Event Location:</label>\r\n");
      out.write("            <input type=\"text\" id=\"eventLocation\" ng-model=\"event.location\" required />\r\n");
      out.write("        </div>\r\n");
      out.write("        <div>\r\n");
      out.write("            <label for=\"eventDate\">Event Date:</label>\r\n");
      out.write("            <input type=\"text\" id=\"eventDate\" ng-model=\"event.date\" required />\r\n");
      out.write("        </div>\r\n");
      out.write("        <div>\r\n");
      out.write("            <label for=\"eventTime\">Event Time:</label>\r\n");
      out.write("            <input type=\"text\" id=\"eventTime\" ng-model=\"event.time\" required />\r\n");
      out.write("        </div>\r\n");
      out.write("        <div>\r\n");
      out.write("            <label for=\"eventReason\">Event Reason:</label>\r\n");
      out.write("            <input type=\"text\" id=\"eventReason\" ng-model=\"event.reason\" required />\r\n");
      out.write("        </div>\r\n");
      out.write("        <div>\r\n");
      out.write("            <button ng-click=\"addEvent()\">Add Event</button>\r\n");
      out.write("        </div>\r\n");
      out.write("    </form>\r\n");
      out.write("    <hr>\r\n");
      out.write("    <div ng-repeat=\"event in events | filter: {date:searchEvent}\">\r\n");
      out.write("        <p>Name: {{event.name}}</p>\r\n");
      out.write("        <p>Type: {{event.type}}</p>\r\n");
      out.write("        <p>Location: {{event.location}}</p>\r\n");
      out.write("        <p>Date: {{event.date}}</p>\r\n");
      out.write("        <p>Time: {{event.time}}</p>\r\n");
      out.write("        <p>Reason: {{event.reason}}</p>\r\n");
      out.write("        <button ng-click=\"getEvent(event.name)\">Edit</button>\r\n");
      out.write("        <button ng-click=\"deleteEvent(event.name)\">Delete</button>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div>\r\n");
      out.write("        <input type=\"text\" ng-model=\"searchEvent\" placeholder=\"Filter events by date\">\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("</body>\r\n");
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
