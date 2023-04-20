<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Pension List</title>
</head>
<body style="font-family: 'Pretendard-Regular';">
<%@ include file="header.jsp" %>
<div id="fh5co-featured" data-section="features">
         <div class="container">
            <div class="row text-center fh5co-heading row-padded">
               <div class="col-md-8 col-md-offset-2">
                  <h2 class="heading to-animate" style="font-family: 'Pretendard-Regular';">펜션이름</h2>
                  <p class="sub-heading to-animate">예약 시 펜션 이름을 정확히 작성해 주세요.</p>
               </div>
            </div>
         
         <div class="form-group" style="text-align: end;">
            <button class="btn btn-primary" type="button" style="font-family: 'Pretendard-Regular';" onclick="location.href='${path }/ReviewList.do?pensionName=${penionName }'">리뷰확인</button>
            <button class="btn btn-primary" type="button" style="font-family: 'Pretendard-Regular';" onclick="location.href='reservation'">예약하기</button>
         </div>
         
            <div class="row">
			<c:forEach var="RoomList" items="${RoomList }" >
               <div class="fh5co-grid">
                  <div class="fh5co-v-half to-animate-2">
                     <div class="fh5co-v-col-2 fh5co-bg-img" style="background-image: url(/resources/images/hodu.jpg)"></div>
                     <div class="fh5co-v-col-2 fh5co-text fh5co-special-1 arrow-left">
                        <h2 style="font-family: 'Pretendard-Regular';">객실 이름</h2>
                        <span class="pricing">${RoomList.roomName }</span>
                       </div>
                  </div>
                  <div class="fh5co-v-half">
                     <div class="fh5co-h-row-2 to-animate-2">
                        <div class="fh5co-v-col-2 fh5co-bg-img" style="background-image: url(/resources/images/hodu1.jpg)"></div>
                        <div class="fh5co-v-col-2 fh5co-text arrow-left">
                           <h2 style="font-family: 'Pretendard-Regular';">수용가능한 반려견</h2>
                           <span class="pricing">${RoomList.dogSize } </span>
                          </div>
                     </div>
                     <div class="fh5co-h-row-2 fh5co-reversed to-animate-2">
                        <div class="fh5co-v-col-2 fh5co-bg-img" style="background-image: url(/resources/images/hodu2.jpg)"></div>
                        <div class="fh5co-v-col-2 fh5co-text arrow-right">
                           <h2 style="font-family: 'Pretendard-Regular';">가격</h2>
                           <span class="pricing">${RoomList.price } 원</span>
                          </div>
                     </div>
                  </div>

                  <div class="fh5co-v-half">
                     <div class="fh5co-h-row-2 fh5co-reversed to-animate-2">
                        <div class="fh5co-v-col-2 fh5co-bg-img" style="background-image: url(/resources/images/hodu3.jpg)"></div>
                        <div class="fh5co-v-col-2 fh5co-text arrow-right">
                           <h2 style="font-family: 'Pretendard-Regular';">수용가능한 반려견 수</h2>
                           <span class="pricing">${RoomList.dogNum } 마리</span>
                          </div>
                     </div>
                     <div class="fh5co-h-row-2 to-animate-2">
                        <div class="fh5co-v-col-2 fh5co-bg-img" style="background-image: url(/resources/images/hodu8.jpg)"></div>
                        <div class="fh5co-v-col-2 fh5co-text arrow-left">
                           <h2 style="font-family: 'Pretendard-Regular';">수용가능한 인원수</h2>
                           <span class="pricing">${RoomList.peopleNum } 명</span>
                          </div>
                     </div>
                  </div>
                  <div class="fh5co-v-half to-animate-2">
                     <div class="fh5co-v-col-2 fh5co-bg-img" style="background-image: url(/resources/images/hodu7.jpg)"></div>
                     <div class="fh5co-v-col-2 fh5co-text fh5co-special-1 arrow-left">
                        <h2 style="font-family: 'Pretendard-Regular';">세부사항</h2>
                        <span class="pricing">${RoomList.message_room }</span>
                     </div>
                  </div>

               </div>
               
               <br>
               <br>
               </c:forEach>
            </div>

         </div>
      </div>
<%@ include file="footer.jsp" %>
</body>
</html>