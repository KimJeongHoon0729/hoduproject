
<!DOCTYPE html>

	<head>

	</head>
	<body>
	<%@ include file="header.jsp" %>
	<link rel="stylesheet" href="/resources/style2.css">

      <div id="fh5co-contact" data-section="reservation">
         <div class="container">
            <div class="row text-center fh5co-heading row-padded">
            
               <div class="col-md-8 col-md-offset-2">
                  <h2 class="heading to-animate">SignIn</h2>
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
		<form id="user">
 
          		<div class="container" style="text-align:center;padding-left: 4px">
          		
      		    <div class="col-md-6 col-md-offset-3">
                  <h3>user form</h3>
                  <div class="form-group">
                     <label for="JserId" class="sr-only">UserId</label>
                     <input id="JserId" class="form-control" placeholder="JserId" type="text">
                  </div>
                   <div class="form-group ">
                     <label for="userPw" class="sr-only">userPw</label>
                     <input id="userPw" class="form-control" placeholder="userPw" type="text">
                  </div>
                   <div class="form-group ">
                     <label for="userName" class="sr-only">userName</label>
                     <input id="userName" class="form-control" placeholder="userName" type="text">
                  </div>
                   <div class="form-group ">
                     <label for="userBirth" class="sr-only">userBirth</label>
                     <input id="userBirth" class="form-control" placeholder="userBirth" type="text">
                  </div>
                   <div class="form-group ">
                     <label for="sex" class="sr-only">sex</label>
                     <input id="sex" class="form-control" placeholder="sex" type="text">
                  </div>
                   <div class="form-group ">
                     <label for="userMobile" class="sr-only">userMobile</label>
                     <input id="userMobile" class="form-control" placeholder="userMobile" type="text">
                  </div>
                   <div class="form-group ">
                     <label for="userEmail" class="sr-only">userEmail</label>
                     <input id="userEmail" class="form-control" placeholder="userEmail" type="text">
                  </div>             
                  <div class="form-group ">
                     <input class="btn btn-primary" value="Submit" type="submit">
                   </div>
            </div>
         </div>
      </div>
  </form>
	
	<form id="partner">

            
          		<div class="container" style="text-align:center">
          		
      		    <div class="col-md-6 col-md-offset-3">
                  <h3>partner form</h3>
                  <div class="form-group">
                     <label for="JserId" class="sr-only">UserId</label>
                     <input id="JserId" class="form-control" placeholder="JserId" type="text">
                  </div>
                   <div class="form-group ">
                     <label for="userPw" class="sr-only">userPw</label>
                     <input id="userPw" class="form-control" placeholder="userPw" type="text">
                  </div>
                   <div class="form-group ">
                     <label for="userName" class="sr-only">userName</label>
                     <input id="userName" class="form-control" placeholder="userName" type="text">
                  </div>
                   <div class="form-group ">
                     <label for="userBirth" class="sr-only">userBirth</label>
                     <input id="userBirth" class="form-control" placeholder="userBirth" type="text">
                  </div>
                   <div class="form-group ">
                     <label for="sex" class="sr-only">sex</label>
                     <input id="sex" class="form-control" placeholder="sex" type="text">
                  </div>
                   <div class="form-group ">
                     <label for="userMobile" class="sr-only">userMobile</label>
                     <input id="userMobile" class="form-control" placeholder="userMobile" type="text">
                  </div>
                   <div class="form-group ">
                     <label for="userEmail" class="sr-only">userEmail</label>
                     <input id="userEmail" class="form-control" placeholder="userEmail" type="text">
                  </div>             
                  <div class="form-group ">
                     <input class="btn btn-primary" value="Submit" type="submit">
                   </div>
            </div>
         </div>
      </div>
  </form>
	
   </div>
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
	<!-- Main JS -->
	<script src="/resources/js/main.js"></script>

	</body>
</html>
