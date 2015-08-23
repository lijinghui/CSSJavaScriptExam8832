<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录页</title>
<link rel="stylesheet" href="bootstrap.min.css">
</head>
<body style=" background-image: url('Desert.jpg');background-size: cover">
<nav class=" navbar navbar-inverse navbar-fixed-top "  role="navigation">
    <div class="container">
        <div class="navbar-header"><a  href="" class="navbar-brand">1924 8322</a></div>

    </div>
</nav>
    <div style="height: auto">

    <div style="margin-top: 100px;margin-left: auto;margin-right: auto ;width: 500px;
    background-color: #eee;height: 200px" >
        <form action="<%=request.getContextPath() %>/LoginServlet" method="post">
        <div style="background-color: #fff">电影租赁管理系统</div>
        <div class="row">
            <div class="col-md-2 col-md-offset-2" style="margin-top: 30px">用户名</div>
            <div class="col-md-6"style="margin-top: 30px"><input type="text" name="username"/></div>
        </div>
        <div class="row">
            <div class="col-md-2 col-md-offset-2" style="margin-top: 30px">密码</div>
            <div class="col-md-5"style="margin-top: 30px"><input type="password" name="password"/></div>
        </div>
        <div class="row"><input class="btn btn-info col-md-2 col-md-offset-2"  style="margin-top: 5px" value="登录" type="submit"></div>
    </form>
    </div>
    </div>
</body>
</html>