<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
	
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>대한항공</title>

<link rel ="stylesheet" href="${contextPath}/resources/css/reset.css">

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
<script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
<script>let contextPath = "${contextPath}"</script>
</head> 
<body>
	<header>
		<nav class="navbar navbar-expand-sm navbar-light">
		   <a class="navbar-brand" href="${contextPath}">
		     <img src="${contextPath}/resources/image/koreanair_logo.png" alt="Logo" style="width:100%;">
		   </a>
		 <ul class="container">
			  <li class="nav-item">
		    	  <a class="nav-link" href="${contextPath}/board/list">Q n A</a>
		      </li>
		      <li class="nav-item">
		    	  <a class="nav-link" href="#">예매확인</a>
		      </li>
		      <li class="nav-item">
		    	  <a class="nav-link" href="${contextPath}/member/signUp">회원가입</a>
		      </li>
	      </ul>
	    </nav>
	</header>