<%--
  Created by IntelliJ IDEA.
  User: king
  Date: 2019/9/28
  Time: 10:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
   <table border="1px" align="center">
       <tr>
           <td>id</td>
           <td>姓名</td>
           <td>密码</td>
       </tr>
       <c:forEach items="${list}" var="u" >
           <tr>
               <td>${u.id}</td>
               <td>${u.name}</td>
               <td>${u.password}</td>
           </tr>

       </c:forEach>
   </table>
</body>
</html>
