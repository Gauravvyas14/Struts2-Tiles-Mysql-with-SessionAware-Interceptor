<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<tiles:insertTemplate template="/layout.jsp">
  
  <tiles:putAttribute name="menu" value="/mainmenu.jsp"/>
  <tiles:putAttribute name="body"   value="/mainbody.jsp" />
  <tiles:putAttribute name="footer" value="/footer.jsp" />
</tiles:insertTemplate>