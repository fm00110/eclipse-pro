<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:out value="开始输出"></c:out><br>
${sum }<br>
<c:out value="${sum }"></c:out><br>
<c:if test="${sum*1==55 }"><c:out value="注册成功"></c:out></c:if><br>
<c:set var="a" value="12"></c:set>
<c:set var="b" value="12"></c:set>
<c:if test="${a*1==b*1 }">true</c:if>
</body>
</html>