<%@page import="java.util.ArrayList"%>
<%@page import="annotation.springmvc_13.HelloDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>멤버들</h1>
	<%
	HelloDTO dto = (HelloDTO) request.getAttribute("model");
	%>
	<%
	ArrayList<String> max = dto.getMembers();
	for (String m : max) {
		out.println("<h3>" + m + "</h3>");
	}
	%>

<%-- <c:forEach items="${memberlist}" varStatus="vs"> --%>
<%-- <h3> ${vs.count} : ${vs.current} </h3> --%>
<%-- </c:forEach> --%>

</body>
</html>