<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
  <head>
    <title>이건 차계부</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Bootstrap -->
    <link href="style/css/bootstrap.min.css" rel="stylesheet" media="screen">
    <script src="http://code.jquery.com/jquery.js"></script>
    <script src="style/js/bootstrap.min.js"></script>
    <script src="style/js/respond.min.js"></script>
  </head>
  <body>
  <h1>먼저, 로그인하세요.</h1>
  <form role="form" action="#">
    <div class="form-group" >
      <label for="egunUserId">아이디</label>
      <input type="text" class="form-control" id="egunUserId" placeholder="아이디를 입력하세요.">
    </div>
    <div class="form-group">
      <label for="egunUserPassword">비밀번호</label>
      <input type="password" class="form-control" id="egunUserPassword" placeholder="비밀번호를 입력해주세요.">
    </div>
    <div class="checkbox">
      <label><input type="checkbox"> Remember me</label>
    </div>
    <button type="submit" class="btn btn-lg btn-primary">로그인</button>
    <a href="/auth/signupForm" class="btn btn-default btn-lg">회원가입</a>
  </form>
  </body>
</html>