<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
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
                  <li>추천순</li>
                  <li>거리순</li>
                  <li>낮은 가격순</li>
                  <li>높은 가격순</li>
               </ul>
            </div>
         </div>

         <!-- 드롭다운 끝 -->

         <div class="row row-padded">
            <div class="col-md">
               <div class="fh5co-food-menu to-animate-2">
                  <h2 class="fh5co-drinks" style="font-family: 'Pretendard-Regular';">추천순</h2>
                  <ul>
                     <li>
                        <div class="fh5co-food-desc">
                           <figure>
                              <img src="/resources/list_images/134c721b-31f7-4f52-8a19-6ff53eba9cf5.jpg" class="img-responsive"
                                 alt="Free HTML5 Templates by FREEHTML5.co">
                           </figure>
                           <div>
                              <h3 style="font-family: 'Pretendard-Regular';">양평 풀스테이 조이 풀빌라</h3>
                              <p>9.1 추천해요 (57)</p>
                              <p>양평군 | C아트뮤지엄 차량 5분</p>
                           </div>
                        </div>
                        <div class="fh5co-food-pricing">224,000원</div>
                     </li>
                     <li>
                        <div class="fh5co-food-desc">
                           <figure>
                              <img src="/resources/list_images/27평 세컨하우스 프로젝트 1(젊은 전원주택 트렌드Ⅱ).jpg" class="img-responsive"
                                 alt="Free HTML5 Templates by FREEHTML5.co">
                           </figure>
                           <div>
                              <h3 style="font-family: 'Pretendard-Regular';">양평 초록밤풀빌라</h3>
                              <p>9.6 최고에요 (21)</p>
                              <p>양평군</p>
                           </div>
                        </div>
                        <div class="fh5co-food-pricing">269,100원</div>
                     </li>
                     <li>
                        <div class="fh5co-food-desc">
                           <figure>
                              <img src="/resources/list_images/3fc9c681-cb48-4614-b8af-c86c135a60c5.jpg" class="img-responsive"
                                 alt="Free HTML5 Templates by FREEHTML5.co">
                           </figure>
                           <div>
                              <h3 style="font-family: 'Pretendard-Regular';">별빛애견펜션</h3>
                              <p>10.0 최고에요 (18)</p>
                              <p>양평군 | 비발디파크 차량 11분</p>
                           </div>
                        </div>
                        <div class="fh5co-food-pricing">190,000원</div>
                     </li>
                     <li>
                        <div class="fh5co-food-desc">
                           <figure>
                              <img src="/resources/list_images/625d0ead-f13d-4bd3-a10c-71701aea58b6.jpg" class="img-responsive"
                                 alt="Free HTML5 Templates by FREEHTML5.co">
                           </figure>
                           <div>
                              <h3 style="font-family: 'Pretendard-Regular';">양평 쉼하우스 펜션</h3>
                              <p>8.4 만족해요 (8)</p>
                              <p>양평군 | 두물머리 차량 31분</p>
                           </div>
                        </div>
                        <div class="fh5co-food-pricing">250,000원</div>
                     </li>
                  </ul>
               </div>
            </div>
            
       
      </div>
   </div>
   <%@ include file="footer.jsp"%>
</body>
</html>