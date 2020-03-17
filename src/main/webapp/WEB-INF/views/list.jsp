<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>试驾测评</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no"/>
<!-- 引入 css -->
<link rel="stylesheet" type="text/css"
	href="/resource/css/bootstrap.css">
<!-- 引入js -->
<script type="text/javascript" src="/resource/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/resource/js/jquery-3.2.1.js"></script>
<script type="text/javascript">

	function goPage(page) {
		location = "list?page="+page;
	}
	
	/* $({
		$.post("getTypesList.do",function(obj){
			$("#tid").append("<option value='"+obj[i].tid+"'>"+obj[i].tname+"</option>");
		})
	}); */
	function add() {
		location = "add.jsp";
	}
</script>
<body>
	<div>
		<div align="center">
			<h3>试驾测评</h3>
			<div>
				<form action="list" namethod="post">
					<input type="button" onclick="add()" value="添加">
					类型<select id="tid">
						<option value="0">请选择</option>
						</select>
					视频日期<input type="date" name="${drivers.d1 }" value="${drivers.d1 }">-<input type="date" name="${drivers.d2 }" value="${drivers.d2 }">
					标题<input type="text" name="${drivers.title }" value="${drivers.title }">
					<button type="button">搜索</button>
				</form>
			</div>
			<c:forEach items="${info.list }" var="drivers">
				<img alt="" src="/pic/${drivers.movie }"><br>
				${drivers.title }<br>
				<fmt:formatDate value="${drivers.cdate }" pattern="yyyy-MM-dd"/>
				 ${drivers.tname }
				 <a>修改</a>
				 <br>
			</c:forEach>
			<jsp:include page="/WEB-INF/common/pages.jsp"></jsp:include>
		</div>
	</div>
</body>
</html>