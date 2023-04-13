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
         <p style="margin-bottom: 0px"></p>
         <div class="container" style="width: 70%;">
            <table class="table table-hover" id="modalTable">
               <tbody style="font-family: 'Pretendard-Regular';">
               
                  <tr>
                     <th>예약번호</th>
                     <th>예약자</th>
                     <th>전화번호</th>
                     <th>이메일</th>
                     <th>펜션이름</th>
                     <th>예약일</th>
                  </tr>
               
            <c:forEach var="RList" items="${RList }"  >
						<tr id="add-btn" onclick="location.href='${path}/RView.do?reservation_idx=${RList.reservation_idx }'">
							<td data-th="Supplier Code">${RList.reservation_idx }</td>
							<td data-th="Invoice Number">${RList.userName }</td>
							<td data-th="Invoice Number">${RList.userMobile }</td>
							<td data-th="Invoice Number">${RList.userEmail }</td>
							<td data-th="Invoice Number">${RList.pensionName }</td>
							<td data-th="Invoice Date"><fmt:formatDate value="${RList.reservation_date }" pattern="yyyy-MM-dd"/></td>
						</tr>
			</c:forEach>
					
               </tbody>
            </table>
            <hr/>
            <br></br>
            

         </div>
      </div>
</div>


<%@ include file="../footer.jsp" %>






</body>

</html>