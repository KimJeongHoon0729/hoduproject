<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Pension Reservation List</title>
</head>



<body style="font-family: 'Pretendard-Regular';">

<%@ include file="../pheader.jsp" %>
   <div id="fh5co-menus" data-section="menu">
      <div class="container">
         <div class="row text-center fh5co-heading row-padded">
            <div class="col-md-8 col-md-offset-2">
               <h2 class="heading to-animate"
                  style="font-family: 'Pretendard-Regular';">Reservation List</h2>
               <p class="sub-heading to-animate"></p>
               <p style="margin-bottom: 80px"></p>
            </div>
         </div>
         <p style="margin-bottom: -30px"></p>
         <div class="container" style="width: 70%;">
            <table class="table table-bordered">
            
               <tr>
                  <th style="width: 200px; text-align: center;">예약번호</th>
                  <th></th>
               </tr>
              
              <tr>
                  <th style="width: 200px; text-align: center;">예약일</th>
                  <th></th>
               </tr>
             
               <tr>
                 <th text-align: center; style="text-align: center;">아이디</th>
                    <th></th>   
               </tr>

               <tr>
                  <th style="width: 200px; text-align: center;">예약자</th>
                  <th></th>
               </tr>
				
				<tr>
					<th text-align: center; style="text-align: center;">인원수</th>
					<th></th>
				</tr>
					
			   <tr>
                  <th style="width: 200px; text-align: center;">이메일</th>
                  <th></th>
               </tr>	
					
               <tr>
                  <th text-align: center; style="text-align: center;">전화번호</th>
                  <th></th>
               </tr>

               <tr>
                   <th text-align: center; style="text-align: center;">펜션이름</th>
                  <td></td>
               </tr>
               
                <tr>
                   <th text-align: center; style="text-align: center;">펜션가격</th>
                  <td></td>
               </tr>

               <tr>
                  <th style="width: 200px; text-align: center;">반려견 수</th>
                  <th></th>
               </tr>

               <tr>
                  <th text-align: center; style="text-align: center;">반려견 사이즈</th>
                  <th></th>
               </tr>

					<tr>
                  <th style="height:200px; text-align: center;">세부내용</th>
                  <td></td>
               </tr>            
               
            </table>
            <hr/>
            <div class="find-btn" style="text-align: center;">
            <input class="btn btn-primary" value="수정" type="submit"  style="font-family: 'Pretendard-Regular';" >
	        <input class="btn btn-primary" value="목록" type="submit"  style="font-family: 'Pretendard-Regular';" >
	        <input class="btn btn-primary" value="삭제" type="submit"  style="font-family: 'Pretendard-Regular';" >     
            </div>
            <br></br>
            
            <form id="moveForm" method="get">
            <input type="hidden" name="pageNum" value="${pageMaker.cri.pageNum }">
              <input type="hidden" name="amount" value="${pageMaker.cri.amount }">   
            </form>
         </div>
      </div>
</div>
<%@ include file="../footer.jsp" %>


</body>

</html>