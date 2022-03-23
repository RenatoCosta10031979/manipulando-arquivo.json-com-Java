package org.apache.jsp.uddi.forms;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.eclipse.wst.ws.internal.explorer.platform.favorites.datamodel.*;
import org.eclipse.wst.ws.internal.explorer.platform.uddi.perspective.*;
import org.eclipse.wst.ws.internal.explorer.platform.uddi.constants.*;
import org.eclipse.wst.ws.internal.explorer.platform.perspective.*;
import org.eclipse.wst.ws.internal.explorer.platform.constants.*;
import org.eclipse.wst.ws.internal.explorer.platform.datamodel.*;
import org.eclipse.wst.ws.internal.explorer.platform.util.*;
import java.util.*;

public final class OpenRegistryForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/forms/formheader.inc");
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
 * Copyright (c) 2001, 2006 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 * 
 * IBM Corporation - initial API and implementation
 * yyyymmdd bug      Email and other contact information
 * -------- -------- -----------------------------------------------------------
 * 20060515   135307 gilberta@ca.ibm.com - Gilbert Andrews
 * 20080513   231351 gilberta@ca.ibm.com - Gilbert Andrews
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

UDDIPerspective uddiPerspective = controller.getUDDIPerspective();
NodeManager navigatorManager = uddiPerspective.getNavigatorManager();
UDDIMainNode uddiMainNode = (UDDIMainNode)navigatorManager.getRootNode();
OpenRegistryTool openRegistryTool = (OpenRegistryTool)(uddiMainNode.getCurrentToolManager().getSelectedTool());
Enumeration favoriteRegistryElements = openRegistryTool.getFavoriteRegistryElements();
Vector favoriteRegistryList = new Vector();
while (favoriteRegistryElements.hasMoreElements())
  favoriteRegistryList.addElement(favoriteRegistryElements.nextElement());

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 3.2 Final//EN\">\n");
      out.write("<html lang=\"");
      out.print(response.getLocale().getLanguage());
      out.write("\">\n");
      out.write("<head>\n");
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("  <title>");
      out.print(uddiPerspective.getMessage("FORM_TITLE_OPEN_REGISTRY"));
      out.write("</title>\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(response.encodeURL(controller.getPathWithContext("css/windows.css")));
      out.write("\">\n");
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/scripts/formsubmit.jsp", out, true);
      out.write("\n");
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/scripts/formutils.jsp", out, true);
      out.write("\n");
      out.write("  <script language=\"javascript\">\n");
      out.write("    function fillFavoriteInfo(favoriteRegistrySelect)\n");
      out.write("    {\n");
      out.write("      var selectedFavoriteRegistryIndex = favoriteRegistrySelect.selectedIndex-1;\n");
      out.write("      if (selectedFavoriteRegistryIndex >= 0)\n");
      out.write("      {\n");
      out.write("        var form = document.getElementById(\"openRegistryForm\");\n");
      out.write("        switch (selectedFavoriteRegistryIndex)\n");
      out.write("        {\n");
      out.write("          ");

          for (int i=0;i<favoriteRegistryList.size();i++)
          {
            FavoritesUDDIRegistryElement favRegElement = (FavoritesUDDIRegistryElement)favoriteRegistryList.elementAt(i);
          
      out.write("\n");
      out.write("            case ");
      out.print(i);
      out.write(":\n");
      out.write("              form.");
      out.print(UDDIActionInputs.REGISTRY_NAME);
      out.write(".value = \"");
      out.print(HTMLUtils.JSMangle(favRegElement.getName()));
      out.write("\";\n");
      out.write("              form.");
      out.print(UDDIActionInputs.INQUIRY_URL);
      out.write(".value = \"");
      out.print(HTMLUtils.JSMangle(favRegElement.getInquiryURL()));
      out.write("\";\n");
      out.write("              break;\n");
      out.write("          ");

          }
          
      out.write("\n");
      out.write("        }\n");
      out.write("      }\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function setDefaults()\n");
      out.write("    {\n");
      out.write("      var form = document.getElementById(\"openRegistryForm\");\n");
      out.write("      form.");
      out.print(UDDIActionInputs.REGISTRY_NAME);
      out.write(".value = \"");
      out.print(HTMLUtils.JSMangle((String)openRegistryTool.getProperty(UDDIActionInputs.REGISTRY_NAME)));
      out.write("\";\n");
      out.write("      form.");
      out.print(UDDIActionInputs.INQUIRY_URL);
      out.write(".value = \"");
      out.print(HTMLUtils.JSMangle((String)openRegistryTool.getProperty(UDDIActionInputs.INQUIRY_URL)));
      out.write("\";\n");
      out.write("      showMainForm();\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function showMainForm()\n");
      out.write("    {\n");
      out.write("      var loadScreenTable = document.getElementById(\"loadScreen\");\n");
      out.write("      if (loadScreenTable.rows.length > 0)\n");
      out.write("        loadScreenTable.deleteRow(0);\n");
      out.write("      document.getElementById(\"mainScreen\").style.display = \"\";\n");
      out.write("    }\n");
      out.write("\n");
      out.write("   \n");
      out.write("  </script>\n");
      out.write("</head>\n");
      out.write("<body dir=\"");
      out.print(org.eclipse.wst.ws.internal.explorer.platform.util.DirUtils.getDir());
      out.write("\" class=\"contentbodymargin\">\n");
      out.write("  <div id=\"contentborder\">\n");
      out.write("    <table id=\"loadScreen\">\n");
      out.write("      <tr>\n");
      out.write("        <td class=\"labels\">\n");
      out.write("          ");
      out.print(controller.getMessage("MSG_LOAD_IN_PROGRESS"));
      out.write("\n");
      out.write("        </td>\n");
      out.write("      </tr>\n");
      out.write("    </table>\n");
      out.write("    <div id=\"mainScreen\" style=\"display:none;\">\n");
      out.write("      ");

      String titleImagePath = "uddi/images/open_registry_highlighted.gif";
      String title = uddiPerspective.getMessage("ALT_OPEN_REGISTRY");
      
      out.write("\n");
      out.write("      ");

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

      out.write("\n");
      out.write("<table width=\"95%\" border=0 cellpadding=3 cellspacing=0>\n");
      out.write("  <tr>\n");
      out.write("    <td>\n");
      out.write("      <img src=\"");
      out.print(response.encodeURL(controller.getPathWithContext(titleImagePath)));
      out.write("\" alt=\"\">\n");
      out.write("      <strong>");
      out.print(title);
      out.write("</strong>\n");
      out.write("    </td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td height=20> <img height=2 width=\"100%\" align=\"top\" src=\"");
      out.print(response.encodeURL(controller.getPathWithContext("images/keyline.gif")));
      out.write("\" alt=\"\"> </td>\n");
      out.write("  </tr>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("      <table>\n");
      out.write("        <tr>\n");
      out.write("          <td class=\"labels\">\n");
      out.write("            ");
      out.print(uddiPerspective.getMessage("FORM_LABEL_OPEN_REGISTRY_DESC"));
      out.write("\n");
      out.write("          </td>\n");
      out.write("        </tr>\n");
      out.write("      </table>\n");
      out.write("      \n");
      out.write("      <form id=\"openRegistryForm\" action=\"");
      out.print(response.encodeURL(controller.getPathWithContext("uddi/actions/OpenRegistryActionJSP.jsp")));
      out.write("\" method=\"post\" target=\"");
      out.print(FrameNames.PERSPECTIVE_WORKAREA);
      out.write("\" enctype=\"multipart/form-data\" onSubmit=\"return handleSubmit(this)\">\n");
      out.write("        <table width=\"95%\" border=0 cellpadding=3 cellspacing=0>\n");
      out.write("         \n");
      out.write("          <tr>\n");
      out.write("            <td class=\"labels\" valign=\"bottom\" nowrap height=25>\n");
      out.write("              <label for=\"favoriteRegistry\">");
      out.print(uddiPerspective.getMessage("FORM_LABEL_FAVORITE_REGISTRY"));
      out.write("</label>\n");
      out.write("            </td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("            <td height=25 valign=\"bottom\" >\n");
      out.write("              <select id=\"favoriteRegistry\" onChange=\"fillFavoriteInfo(this)\" class=\"selectlist\">\n");
      out.write("                <option value=\"\" selected>\n");
      out.write("                ");

                for (int i=0;i<favoriteRegistryList.size();i++)
                {
                  FavoritesUDDIRegistryElement favRegElement = (FavoritesUDDIRegistryElement)favoriteRegistryList.elementAt(i);
                
      out.write("\n");
      out.write("                  <option value=\"");
      out.print(favRegElement.getName());
      out.write('"');
      out.write('>');
      out.print(favRegElement.getName());
      out.write("\n");
      out.write("                ");

                }
                if(favoriteRegistryList.size() == 0){
                
      out.write("\t\n");
      out.write("                \t<option value=\"Empty\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</option>\n");
      out.write("\t\t\t\t");
                
				}
             	
      out.write("\n");
      out.write("              </select>\n");
      out.write("            </td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("            <td class=\"labels\" height=25 valign=\"bottom\">\n");
      out.write("              <label for=\"input_registry_name\">");
      out.print(uddiPerspective.getMessage("FORM_LABEL_REGISTRY_NAME"));
      out.write("</label>\n");
      out.write("              ");

              if (!openRegistryTool.isInputValid(UDDIActionInputs.REGISTRY_NAME))
              {
              
      out.write("\n");
      out.write("                ");
      out.print(HTMLUtils.redAsterisk());
      out.write("\n");
      out.write("              ");

              }
              
      out.write("\n");
      out.write("            </td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("            <td>\n");
      out.write("              <input type=\"text\" id=\"input_registry_name\" name=\"");
      out.print(UDDIActionInputs.REGISTRY_NAME);
      out.write("\" class=\"textenter\">\n");
      out.write("            </td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("            <td class=\"labels\" height=30 valign=\"bottom\">\n");
      out.write("              <label for=\"input_inquiry_url\">");
      out.print(uddiPerspective.getMessage("FORM_LABEL_INQUIRY_URL"));
      out.write("</label>\n");
      out.write("              ");

              if (!openRegistryTool.isInputValid(UDDIActionInputs.INQUIRY_URL))
              {
              
      out.write("\n");
      out.write("                ");
      out.print(HTMLUtils.redAsterisk());
      out.write("\n");
      out.write("              ");

              }
              
      out.write("\n");
      out.write("            </td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("            <td>\n");
      out.write("              <input type=\"text\" id=\"input_inquiry_url\" name=\"");
      out.print(UDDIActionInputs.INQUIRY_URL);
      out.write("\" class=\"textenter\">\n");
      out.write("            </td>\n");
      out.write("          </tr>\n");
      out.write("        </table>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/forms/simpleCommon_table.jsp", out, true);
      out.write("\n");
      out.write("      </form>\n");
      out.write("      <script language=\"javascript\">\n");
      out.write("        setDefaults();\n");
      out.write("      </script>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
