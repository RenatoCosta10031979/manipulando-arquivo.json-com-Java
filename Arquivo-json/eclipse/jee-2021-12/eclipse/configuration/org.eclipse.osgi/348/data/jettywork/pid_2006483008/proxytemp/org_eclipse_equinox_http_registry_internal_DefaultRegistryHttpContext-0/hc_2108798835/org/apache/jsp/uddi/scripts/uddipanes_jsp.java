package org.apache.jsp.uddi.scripts;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.eclipse.wst.ws.internal.explorer.platform.uddi.perspective.*;
import org.eclipse.wst.ws.internal.explorer.platform.uddi.constants.*;
import org.eclipse.wst.ws.internal.explorer.platform.uddi.actions.*;
import org.eclipse.wst.ws.internal.explorer.platform.constants.*;

public final class uddipanes_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");


/*******************************************************************************
 * Copyright (c) 2001, 2004 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

      out.write("\n");
      out.write("\n");
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/scripts/panes.jsp", out, true);
      out.write('\n');
      out.write('\n');
      org.eclipse.wst.ws.internal.explorer.platform.perspective.Controller controller = null;
      synchronized (session) {
        controller = (org.eclipse.wst.ws.internal.explorer.platform.perspective.Controller) _jspx_page_context.getAttribute("controller", PageContext.SESSION_SCOPE);
        if (controller == null){
          controller = new org.eclipse.wst.ws.internal.explorer.platform.perspective.Controller();
          _jspx_page_context.setAttribute("controller", controller, PageContext.SESSION_SCOPE);
        }
      }
      out.write('\n');

   UDDIPerspective uddiPerspective = controller.getUDDIPerspective();

      out.write("\n");
      out.write("<script language=\"javascript\">\n");
      out.write("  var navigatorContainer = perspectiveContent.frames[\"");
      out.print(UDDIFrameNames.NAVIGATOR_CONTAINER);
      out.write("\"];\n");
      out.write("  var navigatorToolbar = navigatorContainer.frames[\"");
      out.print(UDDIFrameNames.NAVIGATOR_TOOLBAR);
      out.write("\"];\n");
      out.write("  var navigatorContent = navigatorContainer.frames[\"");
      out.print(UDDIFrameNames.NAVIGATOR_CONTENT);
      out.write("\"];\n");
      out.write("  var actionsContainer = perspectiveContent.frames[\"");
      out.print(UDDIFrameNames.ACTIONS_CONTAINER);
      out.write("\"];\n");
      out.write("  var propertiesContainer = actionsContainer.frames[\"");
      out.print(UDDIFrameNames.PROPERTIES_CONTAINER);
      out.write("\"];\n");
      out.write("  var propertiesToolbar = propertiesContainer.frames[\"");
      out.print(UDDIFrameNames.PROPERTIES_TOOLBAR);
      out.write("\"];\n");
      out.write("  var propertiesContent = propertiesContainer.frames[\"");
      out.print(UDDIFrameNames.PROPERTIES_CONTENT);
      out.write("\"];\n");
      out.write("  var statusContainer = actionsContainer.frames[\"");
      out.print(UDDIFrameNames.STATUS_CONTAINER);
      out.write("\"];\n");
      out.write("  var statusToolbar = statusContainer.frames[\"");
      out.print(UDDIFrameNames.STATUS_TOOLBAR);
      out.write("\"];\n");
      out.write("  var statusContent = statusContainer.frames[\"");
      out.print(UDDIFrameNames.STATUS_CONTENT);
      out.write("\"];\n");
      out.write("</script>\n");
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
