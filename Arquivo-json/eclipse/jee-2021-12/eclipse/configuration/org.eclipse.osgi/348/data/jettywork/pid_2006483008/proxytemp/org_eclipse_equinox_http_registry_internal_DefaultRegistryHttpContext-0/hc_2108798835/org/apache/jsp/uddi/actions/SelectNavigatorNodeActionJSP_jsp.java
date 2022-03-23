package org.apache.jsp.uddi.actions;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.eclipse.wst.ws.internal.explorer.platform.constants.*;
import org.eclipse.wst.ws.internal.explorer.platform.actions.*;
import org.eclipse.wst.ws.internal.explorer.platform.perspective.*;
import org.eclipse.wst.ws.internal.explorer.platform.uddi.constants.*;
import org.eclipse.wst.ws.internal.explorer.platform.uddi.actions.*;

public final class SelectNavigatorNodeActionJSP_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/actions/SelectNodeAction.inc");
  }

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
      org.eclipse.wst.ws.internal.explorer.platform.perspective.Controller controller = null;
      synchronized (session) {
        controller = (org.eclipse.wst.ws.internal.explorer.platform.perspective.Controller) _jspx_page_context.getAttribute("controller", PageContext.SESSION_SCOPE);
        if (controller == null){
          controller = new org.eclipse.wst.ws.internal.explorer.platform.perspective.Controller();
          _jspx_page_context.setAttribute("controller", controller, PageContext.SESSION_SCOPE);
        }
      }
      out.write('\n');

   // Prepare the action.
   SelectNavigatorNodeAction action = new SelectNavigatorNodeAction(controller);

   // Load the parameters for the action from the servlet request.
   action.populatePropertyTable(request);

   // Run the action and obtain the return code (fail/success).
   boolean actionResult = action.execute();

   // Determine if the action was added to the history list.
   boolean isAddedToHistory = action.isAddedToHistory();

      out.write('\n');

/*******************************************************************************
 * Copyright (c) 2000, 2004 IBM Corporation and others.
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

      out.write('\n');

   Perspective currentPerspective = controller.getCurrentPerspective();

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 3.2 Final//EN\">\n");
      out.write("<html lang=\"");
      out.print(response.getLocale().getLanguage());
      out.write("\">\n");
      out.write("<head>\n");
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html; UTF-8\">\n");

   StringBuffer panesFile = new StringBuffer("/");
   panesFile.append(currentPerspective.getPanesFile());

      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, panesFile.toString(), out, true);
      out.write("\n");
      out.write("<script language=\"javascript\" src=\"");
      out.print(response.encodeURL(controller.getPathWithContext("scripts/browserdetect.js")));
      out.write("\">\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body dir=\"");
      out.print(org.eclipse.wst.ws.internal.explorer.platform.util.DirUtils.getDir());
      out.write("\">\n");

   if (!actionResult)
   {
     if (action.isStaleBreadCrumb())
     {

      out.write("\n");
      out.write("<script language=\"javascript\">\n");
      out.write("  // Rerun the history action to get the next available item.\n");
      out.write("  perspectiveWorkArea.location = \"");
      out.print(response.encodeURL(controller.getPathWithContext(action.getNextHistoryActionLink())));
      out.write("\";\n");
      out.write("</script>\n");

     }
   }
   else
   {
     String treeContentVar = action.getTreeContentVar();
     String propertiesContainerVar = action.getPropertiesContainerVar();
     if (action.requiresTreeViewRefresh())
     {
       if (treeContentVar != null)
       {

      out.write("\n");
      out.write("<script language=\"javascript\">\n");
      out.write("  if (isMicrosoftInternetExplorer())\n");
      out.write("  {\n");
      out.write("    // Update the treeview.\n");
      out.write("    ");
      out.print(treeContentVar);
      out.write(".location = \"");
      out.print(response.encodeURL(controller.getPathWithContext(action.getTreeContentPage())));
      out.write("\";\n");
      out.write("  }\n");
      out.write("  else\n");
      out.write("    perspectiveContent.location = \"");
      out.print(response.encodeURL(controller.getPathWithContext(currentPerspective.getPerspectiveContentPage())));
      out.write("\";  \n");
      out.write("</script>\n");

       }
       if (propertiesContainerVar != null)
       {

      out.write("\n");
      out.write("<script language=\"javascript\">\n");
      out.write("  if (isMicrosoftInternetExplorer())\n");
      out.write("    ");
      out.print(propertiesContainerVar);
      out.write(".location = \"");
      out.print(response.encodeURL(controller.getPathWithContext(action.getPropertiesContainerPage())));
      out.write("\";\n");
      out.write("</script>\n");

       }
     }
     else
     {
       Node selectedNode = action.getSelectedNode();
       NodeManager nodeManager = selectedNode.getNodeManager();
       Node previousSelectedNode = nodeManager.getPreviousSelectedNode();
       int selectedNodeId = selectedNode.getNodeId();
       if (treeContentVar != null)
       {

      out.write("\n");
      out.write("<script language=\"javascript\">\n");
      out.write("  // Update the perspective.\n");

         if (previousSelectedNode != null && previousSelectedNode.isVisible())
         {

      out.write("\n");
      out.write("  ");
      out.print(treeContentVar);
      out.write(".alterImage('");
      out.print(previousSelectedNode.getAnchorName());
      out.write("','");
      out.print(response.encodeURL(controller.getPathWithContext(previousSelectedNode.getClosedImagePath())));
      out.write("');\n");

         }
         String selectedNodeAnchorName = selectedNode.getAnchorName();

      out.write("\n");
      out.write("  ");
      out.print(treeContentVar);
      out.write(".selectNode('");
      out.print(selectedNodeAnchorName);
      out.write("','");
      out.print(response.encodeURL(controller.getPathWithContext(selectedNode.getOpenImagePath())));
      out.write("');\n");
      out.write("  ");
      out.print(treeContentVar);
      out.write(".location.hash = '#");
      out.print(selectedNodeAnchorName);
      out.write("';\n");

       }
       if (propertiesContainerVar != null)
       {

      out.write("\n");
      out.write("  ");
      out.print(propertiesContainerVar);
      out.write(".location = \"");
      out.print(response.encodeURL(controller.getPathWithContext(action.getPropertiesContainerPage())));
      out.write("\";\n");

       }

      out.write("\n");
      out.write("</script>\n");

     }
   }

      out.write("\n");
      out.write("</body>\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 3.2 Final//EN\">\n");
      out.write("<html lang=\"");
      out.print(response.getLocale().getLanguage());
      out.write("\">\n");
      out.write('\n');
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
