/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/10.0.7
 * Generated at: 2022-12-18 20:01:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.com.krusty84.fileconnector;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.eclipse.lyo.oslc4j.core.model.Link;
import org.eclipse.lyo.oslc4j.core.model.ServiceProvider;
import org.eclipse.lyo.oslc4j.core.model.OslcConstants;
import org.eclipse.lyo.oslc4j.core.OSLC4JUtils;
import org.eclipse.lyo.oslc4j.core.annotation.OslcPropertyDefinition;
import org.eclipse.lyo.oslc4j.core.annotation.OslcName;
import java.lang.reflect.Method;
import java.net.URI;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import java.util.Map;
import javax.xml.namespace.QName;
import javax.ws.rs.core.UriBuilder;
import org.eclipse.lyo.oslc4j.core.model.AbstractResource;

public final class viewresource_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("jar:file:/C:/Users/doykin/.m2/repository/javax/servlet/jstl/1.2/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153370682000L));
    _jspx_dependants.put("file:/C:/Users/doykin/.m2/repository/javax/servlet/jstl/1.2/jstl-1.2.jar", Long.valueOf(1667417616027L));
    _jspx_dependants.put("jar:file:/C:/Users/doykin/.m2/repository/javax/servlet/jstl/1.2/jstl-1.2.jar!/META-INF/fn.tld", Long.valueOf(1153370682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.Iterator");
    _jspx_imports_classes.add("java.util.Date");
    _jspx_imports_classes.add("java.util.Collection");
    _jspx_imports_classes.add("java.util.HashSet");
    _jspx_imports_classes.add("org.eclipse.lyo.oslc4j.core.annotation.OslcPropertyDefinition");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("org.eclipse.lyo.oslc4j.core.model.OslcConstants");
    _jspx_imports_classes.add("java.util.Map");
    _jspx_imports_classes.add("org.eclipse.lyo.oslc4j.core.model.Link");
    _jspx_imports_classes.add("org.eclipse.lyo.oslc4j.core.model.AbstractResource");
    _jspx_imports_classes.add("org.eclipse.lyo.oslc4j.core.annotation.OslcName");
    _jspx_imports_classes.add("org.eclipse.lyo.oslc4j.core.model.ServiceProvider");
    _jspx_imports_classes.add("javax.ws.rs.core.UriBuilder");
    _jspx_imports_classes.add("java.net.URI");
    _jspx_imports_classes.add("javax.xml.namespace.QName");
    _jspx_imports_classes.add("org.eclipse.lyo.oslc4j.core.OSLC4JUtils");
    _jspx_imports_classes.add("java.lang.reflect.Method");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" ");
      out.write("\n");
      out.write("  \n");

  AbstractResource aResource = (AbstractResource) request.getAttribute("aResource");
  String resourceTypeName = (String) request.getAttribute("resourceTypeName");
  URI shapeUri = (URI) request.getAttribute("shapeUri");
  String catalogUrl = UriBuilder.fromUri(OSLC4JUtils.getServletURI()).path("/catalog/singleton").build().toString();
  
  String currentFileName = (String) request.getAttribute("Current File:");
  java.util.Date lastModDate = (java.util.Date)request.getAttribute("Last Mod Date:");

      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("  <title>");
      out.print( aResource.toString() );
      out.write("</title>\n");
      out.write("\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css\" integrity=\"sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS\" crossorigin=\"anonymous\">\n");
      out.write("  <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js\" integrity=\"sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut\" crossorigin=\"anonymous\"></script>\n");
      out.write("  <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js\" integrity=\"sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k\" crossorigin=\"anonymous\"></script>\n");
      out.write("  <link href=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\">\n");
      out.write("  <script src=\"");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<!-- Fixed navbar -->\n");
      out.write("  <nav class=\"navbar navbar-expand-lg sticky-top navbar-light bg-light\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <a class=\"navbar-brand\" href=\"");
      if (_jspx_meth_c_005furl_005f2(_jspx_page_context))
        return;
      out.write('"');
      out.write('>');
      out.print( application.getServletContextName() );
      out.write("</a>\n");
      out.write("      <ul class=\"navbar-nav mr-auto\">\n");
      out.write("        <li class=\"nav-item\"><a class=\"nav-link\" href=\"");
      //  c:url
      org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f3 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
      boolean _jspx_th_c_005furl_005f3_reused = false;
      try {
        _jspx_th_c_005furl_005f3.setPageContext(_jspx_page_context);
        _jspx_th_c_005furl_005f3.setParent(null);
        // /com/krusty84/fileconnector/viewresource.jsp(73,55) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_c_005furl_005f3.setValue( catalogUrl );
        int _jspx_eval_c_005furl_005f3 = _jspx_th_c_005furl_005f3.doStartTag();
        if (_jspx_th_c_005furl_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f3);
        _jspx_th_c_005furl_005f3_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f3, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f3_reused);
      }
      out.write("\">Service Provider Catalog</a></li>\n");
      out.write("        <li class=\"nav-item\"><a class=\"nav-link\" href=\"");
      if (_jspx_meth_c_005furl_005f4(_jspx_page_context))
        return;
      out.write("\">Swagger UI</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </nav>\n");
      out.write("<!-- Begin page content -->\n");
      out.write("<div class=\"container\">\n");
      out.write("        <h2>\n");
      out.write("            ");
      out.print( aResource.toString() );
      out.write("\n");
      out.write("            <small class=\"text-muted\">");
      out.print( resourceTypeName );
      out.write("</small>\n");
      out.write("        </h2>\n");
      out.write("        \n");
      out.write("        <div class=\"row mt-3\">\n");
      out.write("            <div class=\"col\">\n");
      out.write("                <h3>Common properties</h3>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-2 text-right\">\n");
      out.write("                <p class=\"font-weight-bold\">Resource URI</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col\">\n");
      out.write("                <a href=\"");
      out.print(aResource.getAbout() );
      out.write("\" class=\"text-monospace\">");
      out.print(aResource.getAbout());
      out.write("</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-2 text-right\">\n");
      out.write("                <p class=\"font-weight-bold\">OSLC Shape</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col\">\n");
      out.write("                <p class=\"text-monospace\">\n");
      out.write("                    <a href=\"");
      out.print(shapeUri);
      out.write('"');
      out.write('>');
      out.print(shapeUri);
      out.write("</a>\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-2 text-right\">\n");
      out.write("                <p class=\"font-weight-bold\">Additional RDF Types</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col\">\n");
      out.write("                <ul class=\"list-unstyled\">\n");
      out.write("                    ");
if (aResource.getTypes() == null || aResource.getTypes().size() == 0) {
      out.write("\n");
      out.write("                    <li><span class=\"text-monospace\">N/A</span></li>\n");
      out.write("\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                    ");
for (URI type : aResource.getTypes()) {
      out.write("\n");
      out.write("                    <li><span class=\"text-monospace\">");
      out.print(type);
      out.write("</span></li>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("		<div class=\"row\">\n");
      out.write("            <div class=\"col-2 text-right\">\n");
      out.write("                <p class=\"font-weight-bold\">Opened File</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col\">\n");
      out.write("                <p class=\"text-monospace\">\n");
      out.write("                    <a href=\"");
      out.print(currentFileName);
      out.write('"');
      out.write('>');
      out.print(currentFileName);
      out.write("</a>\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-2 text-right\">\n");
      out.write("                <p class=\"font-weight-bold\">Last Modified Date</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col\">\n");
      out.write("                <p class=\"text-monospace\">\n");
      out.write("                    <a href=\"");
      out.print(lastModDate);
      out.write('"');
      out.write('>');
      out.print(lastModDate);
      out.write("</a>\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row mt-3\">\n");
      out.write("            <div class=\"col\">\n");
      out.write("                <h3>Resource-specific properties</h3>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <ul class=\"nav nav-tabs\">\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link active\" aria-current=\"page\" href=\"#\" id=\"largeUiPreview\">Large</a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"#\" id=\"smallUiPreview\">Small</a>\n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("        <div class=\"container\">\n");
      out.write("        <div class=\"row mt-3\">\n");
      out.write("        <div class=\"col\" id=\"uiPreviewIframe\">\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        ");

        Map<QName, Object> extendedProperties = aResource.getExtendedProperties();
        if (!extendedProperties.isEmpty()) {
        
      out.write("\n");
      out.write("            <h3>Extended Properties</h3>\n");
      out.write("            <div>\n");
      out.write("            ");

            for (Map.Entry<QName, Object> entry : extendedProperties.entrySet()) 
            {
                QName key = entry.getKey();
                Object value = entry.getValue();
            
      out.write("\n");
      out.write("            <dl class=\"row\">\n");
      out.write("                <dt  class=\"col-sm-2 text-right\"><a href=\"");
      out.print(key.getNamespaceURI() + key.getLocalPart() );
      out.write('"');
      out.write('>');
      out.print(key.getLocalPart());
      out.write("</a></dt>\n");
      out.write("                <dd class=\"col-sm-9\">");
      out.print( value.toString());
      out.write("</dd>\n");
      out.write("            </dl>\n");
      out.write("            ");

            }
            
      out.write("\n");
      out.write("            </div>\n");
      out.write("        ");

        }
        
      out.write("\n");
      out.write("</div>\n");
      out.write("  <footer class=\"footer\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <p class=\"text-muted\">\n");
      out.write("        OSLC Adaptor was generated using <a href=\"http://eclipse.org/lyo\">Eclipse Lyo</a>.\n");
      out.write("      </p>\n");
      out.write("    </div>\n");
      out.write("  </footer>\n");
      out.write("\n");
      out.write("  <script type=\"text/javascript\">\n");
      out.write("    var largeUiPreview = document.getElementById(\"largeUiPreview\");\n");
      out.write("    getUiPreviewIframes(\"");
      out.print( aResource.getAbout() );
      out.write("\", attachIframe, largeUiPreview);\n");
      out.write("    \n");
      out.write("    function attachIframe(compactStructure, largeUiPreview ) {\n");
      out.write("        var smallUiPreview = document.getElementById(\"smallUiPreview\");\n");
      out.write("        var largeUiPreview = document.getElementById(\"largeUiPreview\");\n");
      out.write("        var smallPrev = compactStructure.small;\n");
      out.write("        var largePrev = compactStructure.large;\n");
      out.write("        if (smallPrev !== null) {\n");
      out.write("            smallUiPreview.onclick = function(){ \n");
      out.write("                $(largeUiPreview).removeClass(\"active\");\n");
      out.write("                $(smallUiPreview).addClass(\"active\");\n");
      out.write("                showPreview(smallPrev); \n");
      out.write("                return false; \n");
      out.write("            };\n");
      out.write("        }\n");
      out.write("        if (largePrev !== null) {\n");
      out.write("            largeUiPreview.onclick = function(){ \n");
      out.write("                $(smallUiPreview).removeClass(\"active\");\n");
      out.write("                $(largeUiPreview).addClass(\"active\");\n");
      out.write("                showPreview(largePrev); \n");
      out.write("                return false; \n");
      out.write("            };\n");
      out.write("        }\n");
      out.write("        previewToShow = largePrev ;\n");
      out.write("        if (previewToShow == null) {\n");
      out.write("            previewToShow = smallPrev ;\n");
      out.write("        }\n");
      out.write("        if (previewToShow !== null) {\n");
      out.write("            showPreview(previewToShow);\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function showPreview(previewToShow) {\n");
      out.write("        var divForUiPreviewIframe = document.getElementById(\"uiPreviewIframe\");\n");
      out.write("        var previewIframe = createIframe(previewToShow);\n");
      out.write("        if (divForUiPreviewIframe.childElementCount == 0) {\n");
      out.write("            divForUiPreviewIframe.appendChild(previewIframe);\n");
      out.write("        }\n");
      out.write("        else {\n");
      out.write("            $(divForUiPreviewIframe).children().replaceWith(previewIframe);\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    function createIframe(previewToShow) {\n");
      out.write("        var w = previewToShow.width ? previewToShow.width : \"45em\";\n");
      out.write("        var h = previewToShow.height ? previewToShow.height : \"11em\";\n");
      out.write("        var previewIframe = document.createElement(\"iframe\");\n");
      out.write("        previewIframe.src = previewToShow.uri;\n");
      out.write("        previewIframe.style.width = w;\n");
      out.write("        previewIframe.style.height = h;\n");
      out.write("        previewIframe.frameBorder =\"0\";\n");
      out.write("        previewIframe.scrolling = \"0\";\n");
      out.write("        previewIframe.style.border= \"none\";\n");
      out.write("        previewIframe.style.background = \"white\";\n");
      out.write("        return previewIframe;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("  </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f0_reused = false;
    try {
      _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f0.setParent(null);
      // /com/krusty84/fileconnector/viewresource.jsp(63,14) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f0.setValue("/static/css/adaptor.css");
      int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
      if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      _jspx_th_c_005furl_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f0, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f1_reused = false;
    try {
      _jspx_th_c_005furl_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f1.setParent(null);
      // /com/krusty84/fileconnector/viewresource.jsp(64,15) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f1.setValue("/static/js/ui-preview-helper.js");
      int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
      if (_jspx_th_c_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
      _jspx_th_c_005furl_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f1, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f2_reused = false;
    try {
      _jspx_th_c_005furl_005f2.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f2.setParent(null);
      // /com/krusty84/fileconnector/viewresource.jsp(71,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f2.setValue("/");
      int _jspx_eval_c_005furl_005f2 = _jspx_th_c_005furl_005f2.doStartTag();
      if (_jspx_th_c_005furl_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
      _jspx_th_c_005furl_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f2, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f2_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f4(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f4 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f4_reused = false;
    try {
      _jspx_th_c_005furl_005f4.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f4.setParent(null);
      // /com/krusty84/fileconnector/viewresource.jsp(74,55) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f4.setValue("/swagger-ui/index.jsp");
      int _jspx_eval_c_005furl_005f4 = _jspx_th_c_005furl_005f4.doStartTag();
      if (_jspx_th_c_005furl_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f4);
      _jspx_th_c_005furl_005f4_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f4, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f4_reused);
    }
    return false;
  }
}
