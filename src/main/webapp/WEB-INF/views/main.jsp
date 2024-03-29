<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="layout/header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		 <h2>메인</h2>
		 <sec:authorize access="isAnonymous()">
		 	<a href="${contextPath}/customLogin">로그인</a>
		 	<a href="${contextPath}/member/all">손님페이지</a>
		 </sec:authorize>
		 <sec:authorize access="hasRole('ADMIN')">
		 	<a href="${contextPath}/member/admin">관리자페이지</a><br>
		 </sec:authorize>
		 <sec:authorize access="hasRole('MEMBER')">
		 	<a href="${contextPath}/member/member">회원페이지</a><br>
		 </sec:authorize>
	</div>
</body>
</html>
<%@ include file="layout/footer.jsp" %>