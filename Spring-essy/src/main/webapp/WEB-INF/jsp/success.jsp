<%--
  Created by IntelliJ IDEA.
  User: 98347
  Date: 2019/12/16
  Time: 20:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table>
        <tr>
            <th>编号</th><th>姓名</th><th>余额</th>
        </tr>
            <c:forEach items="all" var="all" varStatus="vx">
                <tr>
                <td>123</td><td>123</td><td>123</td>
                </tr>
            </c:forEach>

    </table>
</body>
</html>
