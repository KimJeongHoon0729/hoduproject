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
	<table border="1"> <!-- ��Ʈ��Ʈ�� ���� div, card -->
		<tr> <!-- 1���� �ϼ��Ǹ� ���縦 �ؼ� ����, name�� DTO�� �ʵ��� ���� -->
			<td>���̵�</td> <!-- ���̵�� �б�� -->
			<td><input type="text" name="userId" readonly></td> <!-- dto �� ��Ʈ�ѷ��� -->
		</tr>
		<tr>	
			<td>��й�ȣ</td>
			<td><input type="password" name="userPw" ></td>
		</tr>
		<tr>	
			<td>�̸�</td>
			<td><input type="text" name="userName" ></td>
		</tr>
		<tr>	
			<td>�̸���</td>
			<td><input type="email" name="userEmail"></td>
		</tr>
		<tr>
			<td colspan="2" align="center"> <!-- colsapn 2ĭ ��ġ�� -->
				<input type="button" value="ȸ������">
				<input type="button" value="����">
			</td>
		</tr>
	
	</table>

</form>

</body>
</html>