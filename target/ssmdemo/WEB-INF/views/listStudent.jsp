<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Sunyu
  Date: 2019/4/12
  Time: 17:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table>
    <tr>
        <th>name</th>
        <th>age</th>
    </tr>

    <c:forEach items="${students}" var="s" varStatus="status">
        <tr>
            <td>${s.name}</td>
            <td>${s.age}</td>
            <td><a href="/deleteStudent?id=${s.id}">delete</a></td>
        </tr>
    </c:forEach>

</table>

</body>
</html>
