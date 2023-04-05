<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
					<form name="searchForm" action="" method="get">
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
							<th>조회수</th>
						</tr>

						<tr>
							<td data-th="Supplier Code">1</td>
							<td data-th="Supplier Name">UPS</td>
							<td data-th="Invoice Number">ASDF19218</td>
							<td data-th="Invoice Date">2023/04/05</td>
							<td data-th="Due Date">10</td>

						</tr>
						<tr>
							<td data-th="Supplier Code">2</td>
							<td data-th="Supplier Name">UPS South Inc.</td>
							<td data-th="Invoice Number">ASDF29301</td>
							<td data-th="Invoice Date">2023/04/05</td>
							<td data-th="Due Date">20</td>

						</tr>
						<tr>
							<td data-th="Supplier Code">3</td>
							<td data-th="Supplier Name">BOX Pro West</td>
							<td data-th="Invoice Number">ASDF43000</td>
							<td data-th="Invoice Date">2023/04/05</td>
							<td data-th="Due Date">5</td>

						</tr>
						<tr>
							<td data-th="Supplier Code">4</td>
							<td data-th="Supplier Name">Pan Providers and Co.</td>
							<td data-th="Invoice Number">ASDF33433</td>
							<td data-th="Invoice Date">2023/04/05</td>
							<td data-th="Due Date">4</td>
						</tr>
						<tr>
							<td data-th="Supplier Code">5</td>
							<td data-th="Supplier Name">Pan Providers and Co.</td>
							<td data-th="Invoice Number">ASDF33433</td>
							<td data-th="Invoice Date">2023/04/05</td>
							<td data-th="Due Date">4</td>
						</tr>
						
					</tbody>
				</table>
				<hr/>
				<a class="btn btn-default pull-right" style="font-family: 'Pretendard-Regular'; font-size: 15px;" >글쓰기</a>
				<br></br>
				
				<div class="text-center">
					<ul class="pagination">
						<li><a href="#" style="color:#5e493a">이전</a></li>
						<li><a href="#" style="color:#5e493a">1</a></li>
						<li><a href="#" style="color:#5e493a">2</a></li>
						<li><a href="#" style="color:#5e493a">3</a></li>
						<li><a href="#" style="color:#5e493a">4</a></li>
						<li><a href="#" style="color:#5e493a">5</a></li>
						<li><a href="#" style="color:#5e493a">다음</a></li>
					</ul>
				</div>
			</div>
		</div>
</div>
<%@ include file="footer.jsp" %>
</body>

</html>