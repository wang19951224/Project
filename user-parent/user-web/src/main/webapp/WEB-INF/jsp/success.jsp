<%--
  Created by IntelliJ IDEA.
  User: 98347
  Date: 2019/12/17
  Time: 16:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table>
        <tr>
            <th>编号</th><th>姓名</th><th>年龄</th><th>性别</th>
        </tr>
        <c:forEach items="${all}" var="all" varStatus="vx">
            <tr>
            <th>${all.id}</th><th>${all.name}</th><th>${all.age}</th><th>${all.sex}</th>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
