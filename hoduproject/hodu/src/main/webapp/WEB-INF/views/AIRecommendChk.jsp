<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Security-Policy" content="upgrade-insecure-requests">
<meta charset="UTF-8">
<title>Pension List</title>
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
               <h2 class="heading to-animate" style="font-family: 'Pretendard-Regular';">AI Recommend Check</h2>
               <p class="sub-heading to-animate"></p>
            </div>
         </div>
               
         <div class="fh5co-food-desc">
             <figure style="text-align: -webkit-center">
                <img src="https://hodu.s3.ap-northeast-2.amazonaws.com//temp.jpg" class="img-responsive"
                   alt="Free HTML5 Templates by FREEHTML5.co">
             </figure>
         </div>
               
         <div class="form-group ">
         	<form method="post" action="AIRecommend.do?AIDog=${param.AIDog }" enctype="multipart/form-data">  
	           <label for="dogNum" class="sr-only">dogNum</label>
	           <input id="dogNum" name="dogNum" class="form-control" type="number" value=${param.AIDog }>
	           <input type="submit" class="btn btn-primary" value="다시제출" style="margin-top: 15px; font-family: 'Pretendard-Regular';">
            </form>  
	     </div>
      </div>
   </div>
   <%@ include file="footer.jsp"%>

</body>
</html>