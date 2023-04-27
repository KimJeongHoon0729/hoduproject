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
                  <h2 class="heading to-animate" style="font-family: 'Pretendard-Regular';">${param.pensionName }</h2>
                  <p class="sub-heading to-animate">예약 시 펜션 이름을 정확히 작성해 주세요.</p>
               </div>
            </div>
         
         <div class="form-group" style="text-align: end;">
            <button class="btn btn-primary" type="button" style="font-family: 'Pretendard-Regular';" onclick="location.href='${path }/ReviewList.do?pensionName=${param.pensionName }'">리뷰확인</button>
            
            <c:if test="${sessionScope.userId != null }">
            <button class="btn btn-primary" type="button" style="font-family: 'Pretendard-Regular';" onclick="location.href='${path }/user/reservation?pensionName=${param.pensionName }'">예약하기</button>
            </c:if>
            
         </div>
         
            <div class="row">
         <c:forEach var="RoomList" items="${RoomList }" >
               <div class="fh5co-grid">
                  <div class="fh5co-v-half to-animate-2">
                     <div class="fh5co-v-col-2 fh5co-bg-img" style="background-image: url(/resources/images/room1.jpg)"></div>
                     <div class="fh5co-v-col-2 fh5co-text fh5co-special-1 arrow-left">
                        <h2 style="font-family: 'Pretendard-Regular';">객실 이름</h2>
                        <span class="pricing">${RoomList.roomName }</span>
                     </div>
                  </div>
                  <div class="fh5co-v-half">
                     <div class="fh5co-h-row-2 to-animate-2">
                        <div class="fh5co-v-col-2 fh5co-bg-img" style="background-image: url(/resources/images/9.png)"></div>
                        <div class="fh5co-v-col-2 fh5co-text arrow-left">
                           <h2 style="font-family: 'Pretendard-Regular';">수용가능한 반려견 크기</h2>
                           <span class="pricing">${RoomList.dogSize } </span>
                          </div>
                     </div>
                     <div class="fh5co-h-row-2 fh5co-reversed to-animate-2">
                        <div class="fh5co-v-col-2 fh5co-bg-img" style="background-image: url(/resources/images/122.png)"></div>
                        <div class="fh5co-v-col-2 fh5co-text arrow-right">
                           <h2 style="font-family: 'Pretendard-Regular';">가격</h2>
                           <span class="pricing">${RoomList.price } 원</span>
                          </div>
                     </div>
                  </div>

                  <div class="fh5co-v-half">
                     <div class="fh5co-h-row-2 fh5co-reversed to-animate-2">
                        <div class="fh5co-v-col-2 fh5co-bg-img" style="background-image: url(/resources/images/dog1.jpg)"></div>
                        <div class="fh5co-v-col-2 fh5co-text arrow-right">
                           <h2 style="font-family: 'Pretendard-Regular';">수용가능한 반려견 수</h2>
                           <span class="pricing">${RoomList.dogNum } 마리</span>
                          </div>
                     </div>
                     <div class="fh5co-h-row-2 to-animate-2">
                        <div class="fh5co-v-col-2 fh5co-bg-img" style="background-image: url(/resources/images/p1.png)"></div>
                        <div class="fh5co-v-col-2 fh5co-text arrow-left">
                           <h2 style="font-family: 'Pretendard-Regular';">수용가능한 인원수</h2>
                           <span class="pricing">${RoomList.peopleNum } 명</span>
                          </div>
                     </div>
                  </div>
                  <div class="fh5co-v-half to-animate-2">
                     <div class="fh5co-v-col-2 fh5co-bg-img" style="background-image: url(/resources/images/6.jpg)"></div>
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