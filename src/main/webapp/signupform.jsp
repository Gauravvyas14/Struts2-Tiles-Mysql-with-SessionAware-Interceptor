<%@ taglib prefix="s" uri="/struts-tags" %>
<table  width="100" align="center" cellpadding="10">
<tr><td class="text" align="center">
| Sign-Up |
<br><s:actionerror/>
<s:form action="signup" method="post" cssClass="text">
	<s:textfield name="name" key="app.name"/>
	<s:textfield name="loginid" key="app.loginid"/>
	<s:textfield name="cnfrm_email" key="app.cnfrm_email"/>
	<s:password name="password" key="app.password"/>
	
	<s:submit value="Login"/>
</s:form>
</td></tr>
</table>