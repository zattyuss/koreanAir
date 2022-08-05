<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp" %>
<div class="container">
	<div class="jumbotron my-3">
		<h3>회원가입 </h3>
	</div>
	<form action="${contextPath}/member/signUp" method="post">
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
		<div class="form-group">
        	<label><small><b>이름</b></small></label>
        	<input type="text" name="userName" class="form-control" placeholder="한글 이름 입력"/>
        </div>
        <div class="form-group">
        	<label><small><b>영문 이름</b></small></label>
        	<input type="text" name="userNameEng" class="form-control" placeholder="영문 이름 입력"/>
    	</div>
    	<div class="form-group">
        	<label><small><b>아이디</b></small></label>
        	<p><small>6~12자리 영문, 숫자로 입력</small></p>
        	<input type="text" name="userId" class="form-control" placeholder="아이디 입력"/>
    	</div>
    	<div class="form-group">
        	<label><small><b>비밀번호 </b></small></label>
        	<p><small>영문+숫자+특수문자(@~!#$%^&*()\-=+,.?) 8자~20자 이내 입력 가능, 4자리 이상 동일 또는 연속된 숫자/문자열 입력 불가</small></p>
        	<input type="password" name="userPw" class="form-control" placeholder="비밀번호 입력"/>
    	</div>
    	<div class="form-group">
        	<label><small><b>비밀번호 확인</b></small></label>
        	<input type="password" name="confirmUserPw" class="form-control"/>
    	</div>
    	<div class="form-group">
        	<label><small><b>생년월일(YYYY.MM.DD.)</b></small></label>
        	<input type="text" name="dateOfBirth" class="form-control" placeholder="YYYY.MM.DD."/>
    	</div>
    	<div class="d-flex mb-3">
			<div class="form-check">
				<label class="form-check-label">
					<input type="radio" class="form-check-input" name="gender" value="MALE">남자
				</label>
			</div>
			<div class="form-check ml-3">
				<label class="form-check-label">
					<input type="radio" class="form-check-input" name="gender" value="FEMALE">여자
				</label>
			</div>
		</div>
		<div class="form-group">
        	<label><small><b>이메일 주소</b></small></label>
        	<input type="email" name="email" class="form-control" placeholder="예) jojinhyun@koreanair.com"/>
    	</div>
    	<div class="form-group">
        	<label><small><b>휴대전화 번호</b></small></label>
        	<input type="text" name="phoneNumber" class="form-control" />
    	</div>
    	<div class="form-group">
		    <label for=""><b>거주국가</b></label>
		    <select class="form-control" name="countryOfResidence">
		        <option>대한민국</option>
		        <option>중국</option>
		        <option>일본</option>
		        <option>베트남</option>
		        <option>러시아</option>
		        <option>미국</option>
		    </select>        	
    	</div>
    	
    	<div class="card">
    		<div class="card-header">
    			<strong>마케팅 및 광고 활용 동의 (선택)</strong>
    		</div>
    		<div class="card-body">
    			<div class="d-flex justify-content-between mb-3">
					<div class="form-check">
						<label class="form-check-label">
							<input type="checkbox" class="form-check-input">
							뉴스레터 (회원 소식지 등)
						</label>
					</div>
					<div class="form-check">
						<label class="form-check-label">
							<input type="checkbox" class="form-check-input" >
							프로모션 정보 (이벤트, 할인 쿠폰 등)
						</label>
					</div>
					<div class="form-check">
						<label class="form-check-label">
							<input type="checkbox" class="form-check-input" >
							SMS 수신 동의
						</label>
					</div>
				</div>
    		</div>
    	</div>
    	
    	<div class="mt-3 d-flex justify-content-center">
    		<div class="form-group">
    			<button class="form-control btn-lg">이전</button>
    		</div>
   		    <div class="form-group ml-3">
    			<button class="form-control btn btn-dark btn-lg">확인</button>
    		</div>
    	</div>
	</form>	
</div>
<%@ include file="../layout/footer.jsp" %>
