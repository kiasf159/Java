<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width", initial-scale="1">
<link rel="stylesheet" href="css/bootstrap.css">
<title>JSP 게시판 웹사이트</title>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
  		<a class="navbar-brand" href="main.jsp">부곡로그</a>
   		<a class="navbar-brand text-secondary" href="main.jsp">메뉴</a>
  		<a class="navbar-brand text-secondary" href="bbs.jsp">게시판</a>
  		<a class="navbar-brand text-secondary" href="newUser.jsp">회원가입</a>
 </nav>
 
 <div class="container">
  <div class="col-lg-4"></div>
  <div class="col-lg-4">
   <div class="jumbotron" style="padding-top: 50px;margin-top: 50px;">
    <form method="post" action="newUserAction.jsp">
     <h3 style="text-align: center;">회원 가입</h3>
     <br>
     <div class="form-row">
      <input type="text" class="form-control" id="userID" name="userID" placeholder="아 이 디" maxlength="20">
     </div>
     <br>
     <div class="form-row">
      <input type="password" class="form-control" id="userPassword" name="userPassword"  placeholder="비 밀 번 호" maxlength="20">
     </div>
     <div class="form-row">
      <input type="text" class="form-control" id="userName" name="userName"  placeholder="이름" maxlength="20">
     </div>
     <div class="form-row" style="text-align:center">
      	<div class="btn-group" data-toggle="buttons">
      		<label class="btn btn-primary">
      			<input type="radio" name="userGender" autocomplete="off" value="남자" checked>남자
      		</label>
      		<label class="btn btn-primary">
      			<input type="radio" name="userGender" autocomplete="off" value="여자" checked>여자
      		</label>
      	</div>
     </div>
     <div class="form-row">
      <input type="email" class="form-control" id="userEmail" name="userEmail" placeholder="이메일" maxlength="50">
     </div>
     <br>
     <input type="submit" class="btn btn-info form-control" value="회원가입">
    </form>
   </div>
  </div>
 </div>
	<script src="https://code.jquery.com/jquery-4.3.1.min.js"></script>
	<script src="js/bootstrap.js"></script>
</body>
</html>