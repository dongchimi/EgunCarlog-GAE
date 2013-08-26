<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" /> 
<!DOCTYPE html>
<html>
  <head>
    <title>이건 차계부</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Bootstrap -->
    <link href="${ctx}/style/css/bootstrap.min.css" rel="stylesheet" media="screen">
    <script src="http://code.jquery.com/jquery.js"></script>
    <script src="${pageContext.request.contextPath}/style/js/bootstrap.min.js"></script>
    <script src="${ctx}/style/js/respond.min.js"></script>
  </head>
  <body>
  <h1>회원가입</h1>
  <form role="form" action="${ctx}/auth/signup">
    <div class="form-group">
      <label for="egunEmail">이메일</label>
      <input type="email" class="form-control" id="egunEmail" placeholder="이메일 형식으로 입력하세요.">
    </div>
    <div class="form-group">
      <label for="egunUserId">아이디</label>
      <input type="email" class="form-control" id="egunUserId" placeholder="아이디를 입력하세요.">
    </div>
    <div class="form-group">
      <label for="egunUserPassword1">비밀번호</label>
      <input type="password" class="form-control" id="egunUserPassword1" placeholder="비밀번호를 입력해주세요.">
      <label for="egunUserPassword2">비밀번호 확인</label>
      <input type="password" class="form-control" id="egunUserPassword2" placeholder="비밀번호를 다시한번 입력해주세요.">
    </div>
    <button type="submit" class="btn btn-lg btn-primary">회원가입</button>
    <a href="${ctx}" class="btn btn-lg btn-default">취소</a>
  </form>
  </body>
</html>