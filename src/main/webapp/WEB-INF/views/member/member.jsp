<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp" %>
<sec:authentication property="principal.memberVO" var="member"/>
<div class="container">

	<h2>회원 페이지</h2>
	<a href="${contextPath}/customLogout">로그아웃</a><br>
	<a href="${contextPath}/member/myPage/${member.userId}">마이페이지</a>
</div>

<%@ include file="../layout/footer.jsp" %>

<style>
	.loginForm {width: 400px; margin: auto;}
</style>