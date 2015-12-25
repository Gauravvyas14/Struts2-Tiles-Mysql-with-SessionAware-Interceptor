<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<html>
<head>

<link rel="stylesheet" href="mystyle.css" type="text/css" />
</head>
<body topmargin="0" >

<table width="1200" cellspacing="0" align="justify" >
  
  <tr height="80">
  	<td width="1200" valign="top" align="left"><tiles:insertAttribute name="menu"/></td>
  	</tr>
  	<tr height=200>
    <td width="1200"><tiles:insertAttribute name="body"/></td>
  </tr>
   <tr height = "550" valign="bottom">
     <td colspan="2" height="5"><tiles:insertAttribute name="footer"/></td>
  </tr>
</table> 
</body>
</html>
          