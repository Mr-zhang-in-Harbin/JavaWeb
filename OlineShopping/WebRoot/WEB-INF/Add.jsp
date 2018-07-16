<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core"
prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

	<title>注册登录</title>
  </head>
  
  <body>
  <form action="add" method="post">
   <table align="Center" border="1" width="20%">
   <tr>
   <th>登录号</th><td ><input name= "user_id"/></td>
   </tr>
   <tr>
   <th>姓名</th><td ><input name= "user_name"/></td>
   </tr>
   <tr>
   <th>密码</th><td ><input name= "user_password"/></td>
   </tr>
   <tr>
   <th>电话</th><td ><input name= "user_phone"/></td>
   </tr>
   <tr align="center">
   <td colspan="2"><input type="submit" value = "添加">
   </tr>
   
   </table>
   </form>
   
  </body>
</html>
