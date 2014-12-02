<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=Edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="../../css/font-awesome.min.css" rel="stylesheet" type="text/css" />
<link href="../../css/loginstyle.css" rel="stylesheet" type="text/css" />
<link href="../../css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="../../js/jquery-1.9.1.js"></script>
<script type="text/javascript" src="../../js/my.js"></script>
<script type="text/javascript" src="../../js/bootstrap.min.js"></script>
<title>登陆</title>
</head>
<body style="background:#7fffd4;">
    <div id="con">
    <form action="login" id="form1" method="post" role="form">
        <div class="form-group" id="main">
        <div class="col-xs-3">
        <input type="text" name="username" placeholder="请输入用户名" class="form-control input-lg"/>
        </div>
        <div class="col-xs-3">
        <input type="password" name="password" placeholder="请输入密码" class="form-control input-lg"/>
        </div>
        <div class="form-group">
        <a id="loginbutton" class="btn btn-primary btn-lg">登陆</a><a style="margin-left:10px;color:#cccccc;">立即注册</a>
        </div>
        <div class="form-group">
        <span id="msg">${msg}</span>
        </div>
        </div>
    </form>
    </div>

</body>
</html>