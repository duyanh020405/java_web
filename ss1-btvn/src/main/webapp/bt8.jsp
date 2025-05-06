<%@ page import="com.data.ss1btvn.Work" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: DUY ANH
  Date: 06/05/2025
  Time: 03:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>To do list</title>
    <div class="navbar">
        <a href="#">Trang chủ</a>
        <a href="#">Liên hệ</a>
        <a href="#">Giỏ hàng</a>
        <a href="#">Tài khoản</a>
    </div>

</head>
<body>
<div class="job-form">
    <form action="bt8" method="POST">
        <input type="text" name="name" class="name" placeholder="Enter new job">
        <button type="submit">Add Job</button>
    </form>


</div>
<table>
    <tr>
        <th>ID</th>
        <th>Job Name</th>
        <th>Status</th>
        <th>Action</th>
    </tr>
    <%
        ArrayList<Work> works = (ArrayList<Work>) request.getAttribute("works");
        if (works != null && !works.isEmpty()) {
            for (int i = 0; i < works.size(); i++) {
                Work w = works.get(i);
    %>
    <tr>
        <td><%= i %></td>
        <td><%= w.getName() %></td>
        <td><%= w.isStatus() ? "Đã hoàn thành" : "Đang làm" %></td>
        <td><button>Change status</button></td>
    </tr>
    <%
        }
    } else {
    %>
    <tr><td colspan="5">No data available</td></tr>
    <%
        }
    %>


</table>

</body>

<style>
    body {
        font-family: Arial, sans-serif;
        margin: 0;
        padding: 0;
    }

    .navbar {
        background-color: #5e5ce6;
        padding: 10px;
        text-align: center;
    }

    .navbar a {
        color: white;
        margin: 0 20px;
        text-decoration: none;
        font-weight: bold;
    }

    .job-form {
        margin: 20px;
        text-align: center;
    }

    .job-form input {
        padding: 10px;
        border-radius: 10px;
        border: 1px solid #ccc;
    }

    .job-form button {
        padding: 10px 20px;
        border: none;
        background-color: #5e5ce6;
        color: white;
        border-radius: 10px;
        cursor: pointer;
    }

    table {
        margin: 20px auto;
        width: 80%;
        border-collapse: collapse;
    }

    th, td {
        border: 1px solid black;
        padding: 10px;
        text-align: center;
    }

    tr {
        background-color: #6666ff;
        color: white;
    }

    tr.doing {
        background-color: yellow;
        color: black;
    }

</style>
</html>
