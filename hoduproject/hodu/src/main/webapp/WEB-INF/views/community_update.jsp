<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="path" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>User Qna Content</title>
</head>
  <style>
      .modal {
        position: absolute;
        top: 0;
        left: 0;

        width: 100%;
        height: 100%;

        display: none;

        background-color: rgba(0, 0, 0, 0.4);
      }

      .modal.show {
        display: block;
      }

      .modal_body {
        position: absolute;
        top: 50%;
        left: 50%;
        width: 400px;
        height: 350px;
        background-color: rgb(255, 255, 255);
        border-radius: 10px;
        box-shadow: 0 2px 3px 0 rgba(34, 36, 38, 0.15);
        transform: translateX(-50%) translateY(-50%);
      }
      .m_head{
        height: 10%;
        padding: 20px;
        display: flex;
        justify-content: space-between;
        background-color:#e7e5e5;
        border-top-left-radius: 10px;
        border-top-right-radius: 10px;
      }
      .m_body{
        height: 80%;
        padding: 20px;
      }
      .m_footer{
        height: 10%;
        padding: 20px;
        background-color:#e7e5e5;
        border-bottom-left-radius: 10px;
        border-bottom-right-radius: 10px;
        display: flex;
        justify-content: end;
      }
      .modal_title{
        font-size: 18px;
        color: gray;
        font-weight: 500;
        align-self: center;
      }
      .close_btn{
        font-size: 20px;
        color: rgb(139, 139, 139);
        font-weight: 900;
        cursor: pointer;
        align-self: center;
      }
      .modal_label{
        padding-top: 10px;
      }
      .input_box{
        width: 100%;
        border: 1px solid rgb(189, 189, 189);
        height: 30px;
      }
      .modal_btn{
        width: 80px;
        height: 35px;
        border-radius: 5px;
        text-align: center;
        font-size: 14px;
        font-weight: bolder;
        padding-top: 5px;
        margin-left: 5px;
        font-family: 'Pretendard-Regular';
        align-self: center;
      }
      .cancle{
        background-color: white;
        color: black;
      }
      .save{
        background-color: #fb6e14;
        color: white;
      }
    </style>


<body style="font-family: 'Pretendard-Regular';">

<%@ include file="header.jsp" %>
   <div id="fh5co-menus" data-section="menu">
      <div class="container">
			<div class="row text-center fh5co-heading row-padded">
				<div class="col-md-8 col-md-offset-2">
					<h2 class="heading to-animate"
						style="font-family: 'Pretendard-Regular';">Community</h2>
					<p class="sub-heading to-animate"></p>
					<p style="margin-bottom: 80px"></p>
				</div>
			</div>
			<p style="margin-bottom: -30px"></p>
			<div class="container" style="width: 70%;">
			
				<table class="table table-bordered">
				
				   <tr>
				      <th style="width: 200px; text-align: center;">작성자</th>
				      <td>${CView.writer }</td>
				   </tr>
				 
				   <tr>
					  <th style="text-align: center;">게시글 날짜</th>
				   	  <td><fmt:formatDate value="${CView.write_date }" pattern="yyyy-MM-dd HH:mm:ss"/></td>	
				   </tr>   
				   
				   <tr>
					    <th style="text-align: center;">제목</th>
					   <td><input value=" ${CView.title }" id="title" name="title" type="text"/></td>
				   </tr>   
				   
				   <tr>
					   <th style="height:200px; text-align: center;">내용</th>
					   <td><input value=" ${CView.content }" id="content" name="content" type="text"/></td>
				   </tr>		  
				 
				</table>
				
				<div class="col-sm-12" style="text-align: -webkit-center;">
				<button class="btn btn-primary btn-block" type="button" onclick="location.href='CUpdate.do?index=${CView.index}'";  style="width: 70px; font-family: 'Pretendard-Regular'; display: inline-block; margin-top: 0px">제출</button>			
				</div>

</body>

</html>