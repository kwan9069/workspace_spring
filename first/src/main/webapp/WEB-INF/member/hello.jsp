<%@page import="annotation.springmvc_13.HelloDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<h1> 컨트롤러부터 받은 메시지</h1>
<body>
<%HelloDTO dto=(HelloDTO)request.getAttribute("model"); %>


<h3>자바스크립트 태그=<%=dto.getMessage() %></h3>
<h3>el= ${model.message}</h3>
</body>
</html>