<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="uploadServlet" method="post" enctype="multipart/form-data">
文件:<input type="file" name="photo"><br>
<input type="submit" value="上传"><br>

<input type="text" style="width: 360px">
</form>
</body>
</html>