<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core"
prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

	<title>ע���¼</title>
  </head>
  
  <body>
  <form action="add" method="post">
   <table align="Center" border="1" width="20%">
   <tr>
   <th>��¼��</th><td ><input name= "user_id"/></td>
   </tr>
   <tr>
   <th>����</th><td ><input name= "user_name"/></td>
   </tr>
   <tr>
   <th>����</th><td ><input name= "user_password"/></td>
   </tr>
   <tr>
   <th>�绰</th><td ><input name= "user_phone"/></td>
   </tr>
   <tr align="center">
   <td colspan="2"><input type="submit" value = "���">
   </tr>
   
   </table>
   </form>
   
  </body>
</html>
