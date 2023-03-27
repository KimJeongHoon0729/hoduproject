<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>

	<head>

	</head>
	<body>
	<%@ include file="../header.jsp" %>

      <div id="fh5co-contact" data-section="reservation">
         <div class="container">
            <div class="row text-center fh5co-heading row-padded" >
            
               <div class="col-md-8 col-md-offset-2">
                  <h2 class="heading to-animate">Update form</h2>
               </div>
            </div>
          

 
          		<div class="container" style="text-align:center;padding-left: 4px">
          		
      		    <div class="col-md-6 col-md-offset-3">
                  <h3>user form</h3>
                  <div class="form-group">
                     <label for="userId" class="sr-only">UserId</label>
                     <input id="userId" class="form-control" placeholder="UserId" type="text" readonly>
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
                     <input class="btn btn-primary" value="Update" type="submit">
                   </div>
            </div>
         </div>
      </div>
	
  
<%@ include file = "../footer.jsp" %>

</div>
	</body>
</html>
