<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style="font-family: 'Pretendard-Regular';">

<%@ include file="header.jsp" %>
   <div id="fh5co-menus" data-section="menu">
      <div class="container">
			<div class="row text-center fh5co-heading row-padded">
				<div class="col-md-8 col-md-offset-2">
					<h2 class="heading to-animate"
						style="font-family: 'Pretendard-Regular';">QnA List</h2>
					<p class="sub-heading to-animate"></p>
					<p style="margin-bottom: 80px"></p>
					   
					   <!-- 검색 폼 영역 -->
					<form name="searchForm" action="#" method="get">
						<p style= "font-size: 18px; margin-left: -45px"">
							<select name="searchType" style="width: 100px; height: 40px;">
								<option value="ALL">전체검색</option>
								<option value="SUBJECT">제목</option>
								<option value="WRITER">작성자</option>
								<option value="CONTENTS">내용</option>
							</select> <input type="text" name="searchText" value="" style="width: 350px;" /> <input
								type="submit" value="검색" style="width: 70px;" />
						</p>
					</form>
					<!-- //검색 폼 영역 -->
				</div>
			</div>
			<p style="margin-bottom: -30px"></p>
			<div class="container" style="width: 70%;">
				<table class="table table-hover">
					<tbody style="font-family: 'Pretendard-Regular';">
					
						<tr>
							<th>번호</th>
							<th>제목</th>
							<th>작성자</th>
							<th>날짜</th>
							<th>답변완료</th>
						</tr>
					 <c:forEach var="question" items="${QList }">
						<tr>
							<td data-th="Supplier Code">${question.q_idx }</td>
							<td data-th="Supplier Name">${question.q_title }</td>
							<td data-th="Invoice Number">${question.userId }</td>
							<td data-th="Invoice Date"><fmt:formatDate value="${question.q_date }" pattern="yyyy-MM-dd"/></td>
							<td data-th="Due Date">완료</td>
						</tr>
					</c:forEach>
					</tbody>
				</table>
				<hr/>
				<a href="/user/qna_form" class="btn btn-default pull-right" style="font-family: 'Pretendard-Regular'; font-size: 15px;" >글쓰기</a>
				<br></br>
				
				<form id="moveForm" method="get">
				<input type="hidden" name="pageNum" value="${pageMaker.cri.pageNum }">
        		<input type="hidden" name="amount" value="${pageMaker.cri.amount }">   
				</form>
				
				<div class="text-center">
					<ul class="pagination">
						<c:if test="${pageMaker.prev }">
						<li><a href="${path }/QList.do?pageNum=${pageMaker.startPage-1 }&amount=10" style="color:#5e493a">이전</a></li>
						</c:if>
						<c:forEach var="num" begin="${pageMaker.startPage }" end="${pageMaker.endPage }">
						<li><a href="${path }/QList.do?pageNum=${num}&amount=10" style="color:#5e493a">${num }</a></li>
						</c:forEach>
						<c:if test="${pageMaker.next }">
						<li><a href="${path }/QList.do?pageNum=${pageMaker.endPage+1 }&amount=10" style="color:#5e493a">다음</a></li>
						</c:if>
					</ul>
				</div>
			</div>
		</div>
</div>
<%@ include file="footer.jsp" %>
</body>

</html>