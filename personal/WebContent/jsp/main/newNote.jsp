<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=Edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="../../css/base.css" rel="stylesheet" type="text/css" />
<link href="../../css/newNote.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="../../js/jquery-1.9.1.js"></script>
<script type="text/javascript" src="../../js/note.js"></script>
<script>
    window.onload=$(function(){
    	var height = $(window).height()+'px';
    	$(".num").css('height',height);
    })
</script>
<title>创建一个新笑话</title>
</head>
<body>
		<div id="num_0" class="num">
			<div id="top">
				<ul>
					<li><a href="../main/index.jsp">首页</a></li>
					<li><a>新的笑话</a></li>
					<li>个人中心</li>
					<li>我要吐槽</li>
					<li>帮助菜鸡作者一起开发</li>
				</ul>
				
				<form action="insertUserArticle" method="post" enctype="multipart/form-data">
				<input type="hidden" value="${sessionScope.id}" id="id" name="id">
					<div id="main">
					    <div style="margin:0px auto;width:830px;">
						<div id="content">
							<textarea rows="5" cols="100" placeholder="在此输入笑话内容"
								name="arcontent"></textarea>
							<input type="file" name="file"/>
						</div>
						<br/>
						<div>
							<input type="submit" value="提交" class="button">
						</div>
						</div>
					</div>
			    </form>
				<br/>
				<div id="contt">
				<div>
				<c:forEach items="${articles }" var="ar">
				<div class="ar">
				    <p>${ar.arcontent }</p>
				    <p>${ar.arcreatetime }</p>
				    <p>${ar.username }</p>
				    <p>${ar.aid }</p>
				    <img src="${ar.arpic }" style="width:120px;hight:100px;" />
				    <form>
				    <input type="text" name="comment" id="${ar.aid }"/>
				    <input type="button" value="提交" onclick="submitComment(${ar.aid })"/>
				    <span>收起</span>
				    <div id="comment">
				    
				    </div>
				    </form>
				    
				</div>
				</c:forEach>
				</div>
				</div>
			</div>
		</div>
</body>
</html>