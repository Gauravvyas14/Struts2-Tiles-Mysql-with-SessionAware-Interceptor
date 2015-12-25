<%@ taglib prefix="s" uri="/struts-tags" %>
<table  width="100" align="center" cellpadding="10">
<tr><td class="text" align="center">
| Login |
<br><s:actionerror/>
<s:form action="login" method="post" cssClass="text">
	<s:textfield name="loginid" key="app.loginid"/>
	<s:password name="password" key="app.password"/>
	<s:select key="app.type" 
       name="type"       
       list="#{'student':'Student', 'admin':'Admin'}"/>
	<s:submit value="Login"/>
</s:form>
</td></tr>
</table>