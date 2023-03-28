<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>
	<body>
	<%@ include file="header.jsp" %>
	<link rel="stylesheet" href="/resources/style2.css">

      <div id="fh5co-contact" data-section="reservation">
         <div class="container">
            <div class="row text-center fh5co-heading row-padded" >
            
               <div class="col-md-8 col-md-offset-2">
                  <h2 class="heading to-animate">SignIn</h2>
               </div>
            </div>
         </div>   
        <div id="container">
			<div class="toggle-switch">
				<input type="checkbox" id="chbox" onchange="setDisplay()" checked>
				<label for="chbox">
					<span class="toggle-track"></span>
				</label>
			</div>
		
	   </div>
		<form id="user" name="join_form" method="post">
 
          		<div class="container" style="text-align:center;padding-left: 4px">
          		
      		    <div class="col-md-6 col-md-offset-3">
                  <h3>user form</h3>
                  <div class="form-group">
                     <label for="userId" class="sr-only">UserId</label>
                     <input id="userId" name="userId" class="form-control" placeholder="userId" type="text">
                  	 <button id="idCheck" name="idCheck" class="btn btn-primary" type="button" onclick="fn_idCheck();" value="N">duplicatoin check</button>
                  </div>
                   <div class="form-group ">
                     <label for="userPw" class="sr-only">userPw</label>
                     <input id="userPw" name="userPw" class="form-control" placeholder="userPw" type="password">
                  </div>
                  <div class="form-group ">
                     <label for="userPwRe" class="sr-only">userPwRe</label>
                     <input id="userPwRe"  class="form-control" placeholder="userPwRe" type="password">
                  </div>
                   <div class="form-group ">
                     <label for="userName" class="sr-only">userName</label>
                     <input id="userName" name="userName" class="form-control" placeholder="userName" type="text">
                  </div>
                   <div class="form-group ">
                     <label for="userBirth" class="sr-only">userBirth</label>
                     <input id="userBirth" name="userBirth" class="form-control" placeholder="userBirth" type="date">
                  </div>
                   <div class="form-group ">
                     <label for="sex" class="sr-only">sex</label>
                     <input id="sex" name="sex" class="form-control" placeholder="sex" type="text">
                  </div>
                   <div class="form-group ">
                     <label for="userMobile" class="sr-only">userMobile</label>
                     <input id="userMobile" name="userMobile" class="form-control" placeholder="userMobile(form:010-1234-1234)" type="tel">
                  </div>
                   <div class="form-group ">
                     <label for="userEmail" class="sr-only">userEmail</label>
                     <input id="userEmail" name="userEmail" class="form-control" placeholder="userEmail(form:abc@abc.com)" type="email">
                  </div>             
                  <div class="form-group ">
                     <button class="btn btn-primary" type="button" onclick="join_check();">signin</button>
                   </div>
            </div>
         </div>
         
  </form>
	
	
	
	
	<form id="partner">

            
          		<div class="container" style="text-align:center">
          		
      		    <div class="col-md-6 col-md-offset-3">
                  <h3>partner form</h3>
                  <div class="form-group">
                     <label for="UserId" class="sr-only">UserId</label>
                     <input id="UserId" name="userId" class="form-control" placeholder="UserId" type="text">
                  </div>
                   <div class="form-group ">
                     <label for="userPw" class="sr-only">userPw</label>
                     <input id="userPw" name="userPw" class="form-control" placeholder="userPw" type="text">
                  </div>
                  <div class="form-group ">
                     <label for="userPwRe" class="sr-only">userPwRe</label>
                     <input id="userPwRe" name="userPwRe" class="form-control" placeholder="userPwRe" type="text">
                  </div>
                   <div class="form-group ">
                     <label for="userName" class="sr-only">userName</label>
                     <input id="userName" name="userName" class="form-control" placeholder="userName" type="text">
                  </div>
                   <div class="form-group ">
                     <label for="userBirth" class="sr-only">userBirth</label>
                     <input id="userBirth" name="userBirth" class="form-control" placeholder="userBirth" type="date">
                  </div>
                   <div class="form-group ">
                     <label for="sex" class="sr-only">sex</label>
                     <input id="sex" name="sex" class="form-control" placeholder="sex" type="text">
                  </div>
                   <div class="form-group ">
                     <label for="userMobile" class="sr-only">userMobile</label>
                     <input id="userMobile" name="userMobile" class="form-control" placeholder="userMobile" type="text">
                  </div>
                   <div class="form-group ">
                     <label for="userEmail" class="sr-only">userEmail</label>
                     <input id="userEmail" name="userEmail" class="form-control" placeholder="userEmail" type="text">
                  </div>             
                  <div class="form-group ">
                     <input class="btn btn-primary" value="Submit" type="submit">
                   </div>
            </div>
         </div>
  </form>

	
   </div>
  
<%@ include file = "footer.jsp" %>

	<script>
	$(function () {
		$("#chbox").prop("checked", true);
		setDisplay();
	 });
			function setDisplay() {
				if($("input:checkbox[id=chbox]").is(":checked")){
			
				$("#user").show();
				$("#partner").hide();
			} else {
				$("#user").hide();
				$("#partner").show();
			}
			}
	</script>
	<script type="text/javascript">
		function fn_idCheck(){
			$.ajax({
				url : "/idCheck",
				type : "post",
				dataType : "json",
				contentType : "application/x-www-form-urlencoded; charset=UTF-8",
				data : {"userId" : $("#userId").val()},
				success : function(data){
					if(data == 1){
						alert("사용할 수 없는 아이디입니다.");
					}else if(data == 0){
						$("#idCheck").attr("value", "Y");
						alert("possible id");
					}
				}
			})
		}
	</script>
	<!-- Main JS -->
	<script src="/resources/js/main.js"></script>
	<script type="text/javascript" src="/resources/js/join_check.js"></script>
	</body>
</html>
