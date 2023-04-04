<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>

  <head>

    <style>
      * {
        font-size: 18px;
        font-family: Pretendard-Regular;
      }
      textarea {
        width: 100%;
        height: 100px;
      } 
      .area select {
   		width: 100%;
   	    height: 55px;
   	  }
    </style>

   </head>
   
   <body style="font-family: 'Pretendard-Regular';">
    <%@ include file ="pheader.jsp" %>

      <div id="fh5co-contact" data-section="reservation">
         <div class="container">
            <div class="row text-center fh5co-heading row-padded" >
            
               <div class="col-md-8 col-md-offset-2">
                  <h2 class="heading to-animate"  style="font-family: 'Pretendard-Regular';">펜션 등록</h2>
               </div>
            </div>
          

          <form action="editPProfile.do" method="post">
                <div class="container" style="text-align:center;padding-left: 4px">
                
                <div class="col-md-6 col-md-offset-3">
                  <h3 style="font-family: 'Pretendard-Regular';">Hodu Pension Registration form</h3>
                  
                 <div class="form-group ">
                     <label for="pensionName" class="sr-only">pensionName</label>
                     <input id="pensionName" name="pensionName" class="form-control" placeholder="펜션명" type="text">
                  </div>

						<div class="area"> 
							<select id="area" class="form-control">
								<option selected disabled>지역을 선택하세요.</option>
								<option>경기</option>
								<option>충남</option>
								<option>충북</option>
								<option>전남</option>
								<option>전북</option>
								<option>경남</option>
								<option>경북</option>
								<option>강원</option>
								<option>제주</option>
							</select>
							<div id="areaError" class="error"></div>
						</div>

						<p style="margin-bottom: 17px"></p>

						<div class="form-group ">
                     <label for="address" class="sr-only">address</label>
                     <input id="address" name="address" class="form-control" placeholder="펜션 상세주소를 입력해주세요" type="text">
                  </div>
                  
                  <div class="form-group ">
                     <label for="partnerMobile" class="sr-only">partnerMobile</label>
                     <input id="partnerMobile" name="partnerMobile" class="form-control" placeholder="전화번호(ex:010-1234-1234)" type="tel">
                  </div>
              
               <div class="form-group">
               <p style="text-align : left; margin-bottom: 0px">수용 가능한 반려견 사이즈</p>
               </div>
               <div class="form-control" style="margin-bottom: 15px">
               		
               		<p style="font-size: 16px"> 
		                <input type='checkbox' name='check' value='소형견' /> 소형견 (10Kg 미만)&nbsp;&nbsp;&nbsp;
		                <input type='checkbox' name='check' value='중형견' /> 중형견 (10kg~25Kg 미만)&nbsp;&nbsp;&nbsp;
		                <input type='checkbox' name='check' value='대형견' /> 대형견 (25Kg 이상)
		            </p>
		        
                </div>
                             
                  <div class="form-group ">
                     <label for="dogNumber" class="sr-only">dogNumber</label>
                     <input id="dogNumber"  class="form-control" placeholder="수용 가능한 반려견 수" type="number">
                  </div>
                   
                   <div class="form-group ">
                     <label for="peopleNumber" class="sr-only">peopleNumber</label>
                     <input id="peopleNumber" name="peopleNumber" class="form-control" placeholder="수용 가능한 인원 수" type="number">
                  </div>
                  
                 <div class="message">
                     <textarea class="message_area form-control" rows="8" cols="50" placeholder="펜션 세부사항을 입력해주세요"></textarea>
                </div>
                  
            </div>
         </div>
         </form>
         <p style="margin-bottom: 14px"></p>
         <div class="col-md-6 col-md-offset-3">
	         <div class="form-group ">  
	         <form method="post" action="${path }/multiFileUpload.do?partnerId=${partnerId }" enctype="multipart/form-data">
				 <p style="text-align: left; margin-bottom: 10px"> 펜션 사진 업로드</p>
			     <p style="width: 102%">
			     <input type="file" name="multiFile" multiple class="form-control"></p>
	             <input class="btn btn-primary" value="다음" type="submit"  style="font-family: 'Pretendard-Regular'; 
	             margin-top: 15px; margin-left: 240px;margin-right: 240px">
			 </form> 
			 </div> 
		 </div>
      </div>
   
  
<%@ include file = "../footer.jsp" %>

</div>
   </body>
</html>