<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style="font-family: 'Pretendard-Regular';">
<%@ include file="header.jsp" %>
 <div id="fh5co-contact" data-section="reservation">
         <div class="container">
            <div class="row text-center fh5co-heading row-padded" >
            
               <div class="col-md-8 col-md-offset-2">
                  <h2 class="heading to-animate"  style="font-family: 'Pretendard-Regular';">예약하기</h2>
               </div>
            </div>
                <div class="container" style="text-align:center;padding-left: 4px">
                
                <div class="col-md-6 col-md-offset-3">
                  <h3 style="font-family: 'Pretendard-Regular';">Reservation</h3>
                  <div class="form-group ">
                     <label for="userPwRe" class="sr-only">resevation_date</label>
                     <input id="userPwRe"  class="form-control" placeholder="예약 날짜" type="date">
                  </div>   
                  <div class="form-group ">
                     <label for="userPwRe" class="sr-only">userID</label>
                     <input id="userPwRe"  class="form-control" placeholder="아이디" type="text">
                  </div>
                  <div class="form-group ">
                     <label for="userPwRe" class="sr-only">userName</label>
                     <input id="userPwRe"  class="form-control" placeholder="이름" type="text">
                  </div>
                  <div class="form-group ">
                     <label for="userPwRe" class="sr-only">userMobile</label>
                     <input id="userPwRe"  class="form-control" placeholder="핻드폰 번호" type="text">
                  </div>
                  <div class="form-group ">
                     <label for="userPwRe" class="sr-only">userEmail</label>
                     <input id="userPwRe"  class="form-control" placeholder="이메일" type="text">
                  </div>
                  <div class="form-group ">
                     <label for="userPwRe" class="sr-only">pensionName</label>
                     <input id="userPwRe"  class="form-control" placeholder="펜션이름" type="text">
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
                     <label for="userPwRe" class="sr-only">dogNumber</label>
                     <input id="userPwRe"  class="form-control" placeholder="강아지 수" type="number">
                  </div>
                  <div class="form-group ">
                     <label for="userPwRe" class="sr-only">peopleNum</label>
                     <input id="userPwRe"  class="form-control" placeholder="인원" type="text">
                  </div>
               <div class="message">
                     <textarea class="message_area form-control" rows="8" cols="50" placeholder="펜션에 미리 전달한 사항을 작성해 주세요"></textarea>
                   </div>               
                   <div class="form-group ">
                     <button class="btn btn-primary" type="button" onclick="join_check();" style="font-family: 'Pretendard-Regular';">제출</button>
                   </div>
            </div>
         </div>
      </div>
   </div>
<%@ include file="footer.jsp" %>
</body>
</html>