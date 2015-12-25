<%@ taglib prefix="s" uri="/struts-tags" %>
<p>&nbsp;</p>
<table width="800" cellpadding="5" cellspacing="0" align="left">
<tr valign="top">
<td align="left" >
Welcome <s:property value="#session.USER.name"/> </td></tr>

<tr valign="top">

<td align="right">
<a href="home.jsp">Home</a></td>


<td align="right">
<a href="actionbody.jsp">My Courses</a></td>
<td align="right">
<a href="actionbody.jsp">Blogs</a></td>


<td align="right">
<a href="actionbody.jsp">Discussion</a></td>
<td align="right">
<a href="<%= request.getContextPath() %>/logout.action">logout</a></td></tr>

</tr>
</table>