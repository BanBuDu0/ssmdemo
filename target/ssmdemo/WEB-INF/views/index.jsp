<%--
  Created by IntelliJ IDEA.
  User: Sunyu
  Date: 2019/4/12
  Time: 17:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <form action="${pageContext.request.contextPath}/addStudent" method="post">
        name: <input type="text" name="name"><br>
        age: <input type="number" name="age"><br>
        <input type="submit" value="add">

    </form>
</div>

</body>
</html>
