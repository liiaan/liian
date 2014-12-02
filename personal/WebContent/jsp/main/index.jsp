<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=Edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="../../css/base.css" rel="stylesheet" type="text/css" />
<link href="../../css/index.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css"
	href="../../css/jquery.pagepiling.css" />
<script type="text/javascript" src="../../js/jquery-1.9.1.js"></script>
<script type="text/javascript" src="../../js/index.js"></script>
<script src="../../js/jquery-ui.min.js"></script>
<script type="text/javascript" src="../../js/jquery.pagepiling.min.js"></script>
<title>小贱鸡</title>
<script type="text/javascript">
		var deleteLog = false;
		$(document).ready(function() {
	    	$('#pagepiling').pagepiling({
	    		menu: '#menu',
	    		anchors: ['page1', 'page2', 'page3'],
			    sectionsColor: ['#bfda00', '#2ebe21', '#2C3E50'],
			    onLeave: function(index, nextIndex, direction){
			    	if(deleteLog){
			    		$('#callbacksDiv').html('');
			    	}
			    	
			    },
			    afterRender: function(){
			    	
			    },
			    afterLoad: function(anchorLink, index){
			    	
					if(index == 2){
						$('#section2').find('.intro').delay(100).animate({
							left: '0%'
						}, 1500, 'easeOutExpo', function(){
							$('#section2').find('p').first().fadeIn(700, function(){
								$('#section2').find('p').last().fadeIn(600);
							});
						});
					}
					if(anchorLink == 'page3'){
						$('#section3').find('.intro').delay(100).animate({
						left: '0%'
						}, 1500, 'easeOutExpo');
					}
					deleteLog = true;
			    }
			});
	    });
    </script>
<style>
body {
	font-family: 微软雅黑;
	font-size: 14px;
	background: url(../../image/stardust.png);
}
</style>
</head>
<body>
	<ul id="menu">
		<li class="active"><a href="#page1">欢迎</a></li>
		<li><a href="#page2">热门笑话</a></li>
		<li><a href="#page3">热门用户</a></li>
	</ul> 
	
	<div
		style="position: fixed; top: 50px; left: 50px; color: white; z-index: 999;"
		id="callbacksDiv"></div>
	<div id="pagepiling">
		<div class="section" id="section1"
			style="background: url(../../image/stardust.png);">
			<div id="num_0" class="num">
				<div id="top">
					<ul>
						<li>首页</li>
						<li><a href="findUserArticle?id=${sessionScope.id}">新的笑话</a></li>
						<li>个人中心</li>
						<li>我要吐槽</li>
						<li>帮助菜鸡作者一起开发</li>
					</ul>
				</div>
				<div id="wel">
					<p>Welcome</p>
				</div>
				<div id="username">
					<p>${username}</p>
				</div>
			</div>
		</div>
		<div class="section" id="section2"
			style="background: url(../../image/stardust.png);">
			<div class="intro">
				<div id="num_1" class="num">
					<div class="title">
						<p>热门</p>
						<span><a>更多</a></span>
					</div>
					<div id="Ar">
						<div id="firstAr" class="showAr">
							<div class="content">
								<div class="contenttitle">
									<img src="../../image/pic.jpg"><span>小驴:</span>
								</div>
								<p>在工地上干木工活，由于班组太多！塔吊吊料特别忙！我们领班想了个好办法！！让胖子去贴个纹身，刮个光头，穿个背心，带上拇指粗的假金链子！让他吊料就是好使！把开塔吊的司机震慑住了，对讲机一拿，手一摆，每次都是先吊我们的！！！多么明显的以貌取人啊！！！过了上胖子照片！！！
								</p>
								<div class="contentfoot">
									<span><a>赞</a></span> <span><a>查看详情</a></span>
								</div>
							</div>
						</div>
						<div id="secAr" class="showAr">
							<div class="content">
								<div class="contenttitle">
									<img src="../../image/pic.jpg"><span>小驴:</span>
								</div>
								<p>在工地上干木工活，由于班组太多！塔吊吊料特别忙！我们领班想了个好办法！！让胖子去贴个纹身，刮个光头，穿个背心，带上拇指粗的假金链子！让他吊料就是好使！把开塔吊的司机震慑住了，对讲机一拿，手一摆，每次都是先吊我们的！！！多么明显的以貌取人啊！！！过了上胖子照片！！！
								</p>
								<div class="contentfoot">
									<span><a>赞</a></span> <span><a>查看详情</a></span>
								</div>
							</div>
						</div>
						<div id="thiAr" class="showAr">
							<div class="content">
								<div class="contenttitle">
									<img src="../../image/pic.jpg"><span>小驴:</span>
								</div>
								<p>在工地上干木工活，由于班组太多！塔吊吊料特别忙！我们领班想了个好办法！！让胖子去贴个纹身，刮个光头，穿个背心，带上拇指粗的假金链子！让他吊料就是好使！把开塔吊的司机震慑住了，对讲机一拿，手一摆，每次都是先吊我们的！！！多么明显的以貌取人啊！！！过了上胖子照片！！！
								</p>
								<div class="contentfoot">
									<span><a>赞</a></span> <span><a>查看详情</a></span>
								</div>
							</div>
						</div>
						<div id="forAr" class="showAr">
							<div class="content">
								<div class="contenttitle">
									<img src="../../image/pic.jpg"><span>小驴:</span>
								</div>
								<p>在工地上干木工活，由于班组太多！塔吊吊料特别忙！我们领班想了个好办法！！让胖子去贴个纹身，刮个光头，穿个背心，带上拇指粗的假金链子！让他吊料就是好使！把开塔吊的司机震慑住了，对讲机一拿，手一摆，每次都是先吊我们的！！！多么明显的以貌取人啊！！！过了上胖子照片！！！
								</p>
								<div class="contentfoot">
									<span><a>赞</a></span> <span><a>查看详情</a></span>
								</div>
							</div>
						</div>
					</div>

				</div>
			</div>
		</div>
		<div class="section" id="section4"
			style="background: url(../../image/stardust.png);">
			<div class="intro">
				<div id="num_2" class="num">
					<div class="title">
						<p>热门用户</p>
					</div>
					<div id="wel">
						<p>敬请期待</p>
					</div>
				</div>
			</div>
		</div>
	</div>


</body>
</html>