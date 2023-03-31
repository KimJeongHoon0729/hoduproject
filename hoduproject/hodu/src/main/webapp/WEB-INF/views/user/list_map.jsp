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
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<script src="jquery.rwdImageMaps.min.js"></script>
<script type="text/javascript">

$(document).ready(function(e) {

    $('img[usemap]').rwdImageMaps();

});

</script>
 
</head>

<body style="font-family: 'Pretendard-Regular';">
   <%@ include file="header.jsp"%>
   <div id="fh5co-menus" data-section="menu">
      <div class="container">
         <div class="row text-center fh5co-heading row-padded">
         	<div>
         		<img src="/resources/images/dog.png" height="64px" width="64px" style="margin-bottom: -50px">
         	</div>
            <div class="col-md-8 col-md-offset-2">
               <h2 class="heading to-animate" style="font-family: 'Pretendard-Regular';">Pension List</h2>
               <p class="sub-heading to-animate" style="font-family: 'Pretendard-Regular';">원하는 지역을 선택해주세요.</p>
            </div>
            <div>
            	<img src="/resources/list_images/지도.png" usemap="#image-map">
				
				<map name="image-map">
				    <area target="_self" alt="경기" title="경기" href="${path }/likeList.do?region=경기" coords="233,77,230,96,215,103,210,115,202,121,204,133,203,142,197,160,203,172,211,180,225,197,239,200,252,199,262,198,283,194,289,174,293,161,297,147,294,140,280,128,284,123,284,105,284,93,275,78" shape="poly">
				    <area target="_self" alt="강원" title="강원" href="${path }/likeList.do?region=강원" coords="249,67,285,59,309,58,330,50,337,32,342,25,350,34,362,59,390,113,401,127,419,151,430,176,416,183,380,173,356,177,313,165,300,176,303,138,303,129,287,129,288,100,283,78,251,73" shape="poly">
				    <area target="_self" alt="충북" title="충북" href="${path }/likeList.do?region=충북" coords="312,173,293,180,284,190,272,202,261,205,261,211,267,223,260,249,266,258,273,279,283,286,299,286,314,279,312,257,305,237,311,226,321,218,331,214,338,211,344,209,356,200,367,192,362,180,331,172" shape="poly">
				    <area target="_self" alt="충남" title="충남" href="${path }/likeList.do?region=충남" coords="257,205,238,205,225,205,201,200,192,194,178,200,167,217,188,257,197,264,202,280,221,283,256,280,272,281,278,288,261,252,262,222" shape="poly">
				    <area target="_self" alt="전북" title="전북" href="${path }/likeList.do?region=전북" coords="280,288,234,289,209,297,211,310,196,342,203,359,235,354,260,350,267,355,280,352,287,317,291,312,301,305,308,296" shape="poly">
				    <area target="_self" alt="전남" title="전남" href="${path }/likeList.do?region=전남" coords="231,358,206,361,193,359,192,350,173,392,165,442,185,453,231,439,262,413,289,409,295,391,291,382,281,364" shape="poly">
				    <area target="_self" alt="경북" title="경북" href="${path }/likeList.do?region=경북" coords="431,180,399,191,392,191,353,205,333,219,326,221,314,231,319,256,316,285,316,294,324,310,351,320,372,328,381,327,397,330,433,329,443,289" shape="poly">
				    <area target="_self" alt="경남" title="경남" href="${path }/likeList.do?region=경남" coords="317,305,297,321,287,348,289,368,307,402,372,403,382,394,402,379,419,355,424,344,428,334,360,325" shape="poly">
				    <area target="_self" alt="제주" title="제주" href="${path }/likeList.do?region=제주" coords="202,532,189,536,176,543,174,555,184,558,198,559,215,557,222,552,224,544,225,537,220,535,217,530" shape="poly">
				</map>
            </div>
         </div>
      </div>
   </div>
   <%@ include file="footer.jsp"%>
   

</body>
</html>