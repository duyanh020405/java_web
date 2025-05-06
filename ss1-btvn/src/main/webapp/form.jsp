<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form đăng ký xe</title>
</head>
<body>
<h2>Form Thông Tin Xe</h2>
<form action="bt6" method="POST">
    <label for="name">Họ và Tên:</label><br>
    <input type="text" id="name" name="name" required><br><br>

    <label for="class">Lớp:</label><br>
    <input type="text" id="class" name="class" required><br><br>

    <label for="vehicleType">Loại Xe:</label><br>
    <select id="vehicleType" name="vehicleType" required>
        <option value="car">Ô tô</option>
        <option value="motorcycle">Xe máy</option>
        <option value="bus">Xe buýt</option>
        <option value="bicycle">Xe đạp</option>
    </select><br><br>

    <label for="licensePlate">Biển Số Xe:</label><br>
    <input type="text" id="licensePlate" name="licensePlate" required><br><br>

    <input type="submit" value="Gửi Thông Tin">
</form>
</body>
</html>
