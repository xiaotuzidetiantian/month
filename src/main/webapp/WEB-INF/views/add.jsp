<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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

/* $({
	$.post("getTypesList.do",function(obj){
		$("#tid").append("<option value='"+obj[i].tid+"'>"+obj[i].tname+"</option>");
	})
}); */

function add() {
	$.post("add",function(flag){
		if(flag) {
			alert("添加成功");
			location = "list";
		} else {
			alert("添加失败");
		}
	});
}
</script>
<body>
	<h3>试驾测评</h3>
	<form action="add" method="post">
		视频日期*<input type="date" name="cdate">
		类型<select id="tid">
			<option value="0">请选择</option>
			</select><br>
		标题*<input type="text" name="title"><br>
		视频*<input type="file" name="movie"><br>
		<input type="button" onclick="add()" value="提交">
	</form>
</body>
</html>