<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>

   <head>

   </head>
   <body style="font-family: 'Pretendard-Regular';">
    <%@ include file ="pheader.jsp" %>

      <div id="fh5co-contact" data-section="reservation">
         <div class="container">
            <div class="row text-center fh5co-heading row-padded" >
            
               <div class="col-md-8 col-md-offset-2">
                  <h2 class="heading to-animate"  style="font-family: 'Pretendard-Regular';">Pension Registration</h2>
               </div>
            </div>
          

          <form action="editPProfile.do" method="post">
                <div class="container" style="text-align:center;padding-left: 4px">
                
                <div class="col-md-6 col-md-offset-3">
                  <h3 style="font-family: 'Pretendard-Regular';">Hodu Pension Registration form</h3>
                  
                  <div class="form-group ">
                     <label for="partnerName" class="sr-only">partnerName</label>
                     <input id="partnerName" name="partnerName" class="form-control" placeholder="업체명" type="text">
                  </div>
                  
                  <div class="form-group ">
                     <label for="partnerMobile" class="sr-only">partnerMobile</label>
                     <input id="partnerMobile" name="partnerMobile" class="form-control" placeholder="전화번호(ex:010-1234-1234)" type="tel">
                  </div>
                  
                  <div class="form-group ">
                     <label for="pensionName" class="sr-only">pensionName</label>
                     <input id="pensionName" name="pensionName" class="form-control" placeholder="펜션명" type="text">
                  </div>
                  
                   <div class="form-group ">
                     <label for="address" class="sr-only">address</label>
                     <input id="address" name="address" class="form-control" placeholder="펜션 주소" type="text">
                  </div>
                  
               <div class="form-group">
                 <p style="text-align : left; margin-bottom: 0px">펜션 사진 첨부</p>
                    <input class="form-control" id="maintenanceFile" th:field="*{file}" type="file">
               </div>
               
               <div class="form-group">
               <p style="text-align : left; margin-bottom: 0px">수용 가능한 반려견 사이즈</p>
               </div>
               <div class="form-control" style="margin-bottom: 15px">
               		
               		<p style="font-size: 16px"> 
		                <input type='checkbox' name='check' value='size1' />소형견 (10Kg 미만)&nbsp;&nbsp;&nbsp;
		                <input type='checkbox' name='check' value='size2' /> 중형견 (10kg~25Kg 미만)&nbsp;&nbsp;&nbsp;
		                <input type='checkbox' name='check' value='size3' /> 대형견 (25Kg 이상)
		            </p>
		        
                </div>
                 
               
                  <div class="form-group ">
                     <label for="dogNumber" class="sr-only">dogNumber</label>
                     <input id="dogNumber"  class="form-control" placeholder="수용 가능한 반려견 수" type="number">
                  </div>
                   
                   <div class="form-group ">
                     <label for="userNumber" class="sr-only">userNumber</label>
                     <input id="userNumber" name="userNumber" class="form-control" placeholder="수용 가능한 인원 수" type="number">
                  </div>
                     
                  <div class="form-group ">
                     <input class="btn btn-primary" value="등록" type="submit"  style="font-family: 'Pretendard-Regular';">
                   </div>
            </div>
         </div>
         </form>
      </div>
   
  
<%@ include file = "../footer.jsp" %>

</div>
   </body>
</html>