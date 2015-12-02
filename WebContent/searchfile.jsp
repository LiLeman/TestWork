<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Search File</title>
</head>
<body>
<h1>Введите имя файла</h1>
<form method="POST" action ="SearchFileServlet">
<input type="text" name="nameFile" plaseholder="Название Файла" />
<input type="submit" name="submit" value="Искать">
</form>
</body>
</html>