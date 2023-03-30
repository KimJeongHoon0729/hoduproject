<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>HODU LIST</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>

<body style="font-family: 'Pretendard-Regular';">
   <%@ include file="header.jsp"%>
   <div id="fh5co-menus" data-section="menu">
      <div class="container">
         <div class="row text-center fh5co-heading row-padded">
            <div class="col-md-8 col-md-offset-2">
               <h2 class="heading to-animate">List</h2>
               <p class="sub-heading to-animate"></p>
               </div>
               </div>

         <!-- 드롭다운 추가 -->
         <div class="container" style="margin-bottom: 50px">
            <div class="dropdown">
               <button class="btn btn-default dropdown-toggle" type="button"
                  data-toggle="dropdown">
                  HODU LIST <span class="caret"></span>
               </button>
               <ul class="dropdown-menu">
                  <li><a onclick="like();">추천순</a></li>
                  <li><a onclick="distance();">거리순</a></li>
                  
               </ul>
            </div>
         </div>

         <!-- 드롭다운 끝 -->

         <div class="row row-padded">
            <div class="col-md" id="like">
               <div class="fh5co-food-menu to-animate-2">
                  <h2 class="fh5co-drinks" style="font-family: 'Pretendard-Regular';">추천순</h2>
                  <ul>
                  <c:forEach var="pension" items="${likeList }" >
                     <li>
                        <div class="fh5co-food-desc">
                           <figure>
                              <img src="/resources/list_images/${pension.img }" class="img-responsive"
                                 alt="Free HTML5 Templates by FREEHTML5.co">
                           </figure>
                           <div>
                              <h3 style="font-family: 'Pretendard-Regular';"><a href="user/list_pension">${pension.pensionName }</a></h3>
                              <p>${pension.score } 만족해요</p>
                              <p>${pension.region }</p>
                           </div>
                        </div>
                        <div class="fh5co-food-pricing"><fmt:formatNumber value="${pension.price}" pattern="###,###"/> 원</div>
                     </li>
                  </c:forEach>
                  </ul>
               </div>
            </div>
            
            
            
            
            <div class="col-md" id="distance">
               <div class="fh5co-food-menu to-animate-2">
                  <h2 class="fh5co-dishes" style="font-family: 'Pretendard-Regular';">거리순</h2>
                  <ul>
                     <li>
                        <div class="fh5co-food-desc">
                           <figure>
                              <img src="/resources/list_images/수영장 디자인 아이디어 & 사진 _ homify.jpg" class="img-responsive"
                                 alt="Free HTML5 Templates by FREEHTML5.co">
                           </figure>
                           <div>
                              <h3 style="font-family: 'Pretendard-Regular';">부천 보물섬 펜션</h3>
                              <p>8.2 만족해요 (5)</p>
                              <p>부천시</p>
                           </div>
                        </div>
                        <div class="fh5co-food-pricing">51,000원</div>
                     </li>
                     <li>
                        <div class="fh5co-food-desc">
                           <figure>
                              <img src="/resources/list_images/스머프펜션.jpg" class="img-responsive"
                                 alt="Free HTML5 Templates by FREEHTML5.co">
                           </figure>
                           <div>
                              <h3 style="font-family: 'Pretendard-Regular';">부천 진우네 펜션</h3>
                              <p>8.5 만족해요 (8)</p>
                              <p>부천시</p>
                           </div>
                        </div>
                        <div class="fh5co-food-pricing">60,000원</div>
                     </li>
                     <li>
                        <div class="fh5co-food-desc">
                           <figure>
                              <img src="/resources/list_images/타이니홈.jpg" class="img-responsive"
                                 alt="Free HTML5 Templates by FREEHTML5.co">
                           </figure>
                           <div>
                              <h3 style="font-family: 'Pretendard-Regular';">소사 정원 펜션</h3>
                               <p>9.0 추천해요 (15)</p>
                              <p>부천 심곡동</p>
                           </div>
                        </div>
                        <div class="fh5co-food-pricing">113,000원</div>
                     </li>
                     <li>
                        <div class="fh5co-food-desc">
                           <figure>
                              <img src="/resources/list_images/펜션캐빈.png" class="img-responsive"
                                 alt="Free HTML5 Templates by FREEHTML5.co">
                           </figure>
                           <div>
                              <h3 style="font-family: 'Pretendard-Regular';">역곡 다락펜션 소소온기</h3>
                                <p>8.4 만족해요 (2)</p>
                              <p>부천시 역곡동</p>
                           </div>
                        </div>
                        <div class="fh5co-food-pricing">121,500원</div>
                     </li>
                  </ul>
               </div>
            </div>
         </div>
            

      </div>
   </div>
   <%@ include file="footer.jsp"%>
   <script>
   $(function () {
		like();
	 });
    function like(){
    	$("#like").show();
		$("#distance").hide();
    }
    function distance(){
    	$("#distance").show();
		$("#like").hide();
    }
   </script>

</body>
</html>