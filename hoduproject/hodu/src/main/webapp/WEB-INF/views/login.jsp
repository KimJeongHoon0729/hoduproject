<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form>
	<table border="1"> <!-- 부트스트랩 사용시 div, card -->
		<tr> <!-- 1행이 완성되면 복사를 해서 수정, name은 DTO에 필드명과 동일 -->
			<td>아이디</td> <!-- 아이디는 읽기용 -->
			<td><input type="text" name="userId" readonly></td> <!-- dto 는 컨트롤러에 -->
		</tr>
		<tr>	
			<td>비밀번호</td>
			<td><input type="password" name="userPw" ></td>
		</tr>
		<tr>	
			<td>이름</td>
			<td><input type="text" name="userName" ></td>
		</tr>
		<tr>	
			<td>이메일</td>
			<td><input type="email" name="userEmail"></td>
		</tr>
		<tr>
			<td colspan="2" align="center"> <!-- colsapn 2칸 합치기 -->
				<input type="button" value="회원가입">
				<input type="button" value="삭제">
			</td>
		</tr>
	
	</table>

</form>

</body>
</html>