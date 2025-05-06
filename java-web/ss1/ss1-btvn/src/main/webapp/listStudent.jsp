<%--
  Created by IntelliJ IDEA.
  User: DUY ANH
  Date: 06/05/2025
  Time: 03:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.data.ss1btvn.Student" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>List Student</h2>>
<table border="1">
    <tr>
        <th>Họ tên</th>
        <th>Tuổi</th>
        <th>Loại xe</th>
        <th>Biển số</th>
    </tr>
    <%
        Student[] students = (Student[]) request.getAttribute("students");
        for (int i = 0; i < students.length; i++) {
    %>
    <tr>
        <td><%= students[i].getName() %></td>
        <td><%= students[i].getAge() %></td>
        <td><%= students[i].getType() %></td>
        <td><%= students[i].getLicensePlate() %></td>
    </tr>
    <%
        }
    %>
</table>



</body>
</html>
