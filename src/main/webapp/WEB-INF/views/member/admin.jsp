<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ include file="../layout/header.jsp" %>
<div class="container">
	<h2>괸라자 전용</h2>
	<div>
		MemberVO : <sec:authentication property="principal.memberVO" var="member"/><br>
		아이디 : <sec:authentication property="principal.memberVO.userId"/><br>
		이름 : <sec:authentication property="principal.memberVO.userName"/><br>
		영문이름 : <sec:authentication property="principal.memberVO.userNameEng"/><br>
		이메일 : <sec:authentication property="principal.memberVO.email"/><br>
		생년월일 : <sec:authentication property="principal.memberVO.dateOfBirth"/><br>
		전화번호 : <sec:authentication property="principal.memberVO.phoneNumber"/><br>
		거주국가 : <sec:authentication property="principal.memberVO.countryOfResidence"/><br>
		권한 : <sec:authentication property="principal.memberVO.authList"/><br>
	</div>
	<a href="${contextPath}/customLogout">로그아웃</a>
	<div>
		${member}
	</div>
</div>
<%@ include file="../layout/footer.jsp" %>

<style>
	.loginForm {width: 400px; margin: auto;}
</style>