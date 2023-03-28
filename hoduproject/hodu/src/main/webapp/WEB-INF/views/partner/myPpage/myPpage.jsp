<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="../pheader.jsp" %>


	<div id="fh5co-events" data-stellar-background-ratio="0.5" style="background-color: white;">
			<div class="fh5co-overlay"></div>
			<div class="container">
				<div class="row text-center fh5co-heading row-padded">
					<div class="col-md-8 col-md-offset-2 to-animate">
						<h2 class="heading">MyPPage</h2>
					</div>
				</div>
				<div class="row">
					<div class="col-md-4">
						<div class="fh5co-event to-animate-2">
							<h3>Reservation List</h3>
							<p></p>
							<p><a href="myPpage/PreservationList" class="btn btn-primary btn-outline">Reservation</a></p>
						</div>
					</div>
					<div class="col-md-4">
						<div class="fh5co-event to-animate-2">
							<h3>Edit Profile</h3>
							<p></p>
							<p><a href="${path }/viewPProfile.do?partnerId=${partnerId}" class="btn btn-primary btn-outline">Edit</a></p>
						</div>
					</div>
					<div class="col-md-4">
						<div class="fh5co-event to-animate-2">
							<h3>Withdrawal</h3>
							<p></p>
							<p><a href="#" class="btn btn-primary btn-outline" onclick="call_confirm();">Withdrawal</a></p>
						</div>
					</div>
				</div>
			</div>
		</div>
		
<script type="text/javascript">
function call_confirm(){
	
	if(confirm("탈퇴하시겠습니까?")){
		location.href="${path }/deletePProfile.do?partnerId=${partnerId}";
		alert("정상적으로 처리되었습니다.");
	}else{
		alert("취소되었습니다.");
	}
	
}
</script>
<%@ include file="../footer.jsp" %>
</body>
</html>