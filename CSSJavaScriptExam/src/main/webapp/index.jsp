<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
<link rel="stylesheet" href="bootstrap.min.css">
<script src="jquery-2.1.4.min.js"></script>
<script src="bootstrap.min.js"></script>
<script src="getCus.js"></script>
<script>
	
</script>


</head>
<body>
	<nav class=" navbar navbar-inverse  " role="navigation">
	<div class="container">
		<div class="navbar-header">
			<a href="" class="navbar-brand">1924 8322</a>
		</div>
		<div id="navber " class="collapse navbar-collapse navbar-right">
			<a class="btn btn-info" style="margin-top: 10px" href="logout.jsp">退出</a>
		</div>
	</div>
	</nav>


	<div class="container ">
		<div class="col-md-2">
			<a class="btn btn-block" style="border: 1px solid #eee" id="getCu">Customer</a>
			<a class="btn btn-block" style="border: 1px solid #eee">film</a>
		</div>
		<div class="col-md-10" id="ajaxget" style="height: 400px;">
			<div style="text-align: center; margin-top: 20px">
				<a class="btn btn-info" href="CreadCus.jsp">创建客户</a>
			</div>
			<div>
				<h1>客户管理</h1>
				<p>客户列表</p>
			</div>
			<%
				session.setAttribute("islogin", "1");
			%>

			<div id="table"
				style="height: 300px; width: 900px; overflow-y: scroll;"></div>
			<div class="btn-group " style="float: right" id="btn-g">
				<button class="btn" id="onepage">1</button>
				<button class="btn" id="twopage">2</button>
				<button class="btn" id="threepage">3</button>
			</div>
		</div>

	</div>


	<!-- Modal -->

	<div id="myModal" class=" modal  fade" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class=" modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">×</button>
					<h3 id="myModalLabel">Modal header</h3>
				</div>
				<div class="modal-body">
					<form action="<%=request.getContextPath()%>/update"
						method="get">
						<p>编辑用户</p>
						<input id="gid" type="hidden" name="id">
						<div class="row">
							<div class="col-md-2 col-md-offset-2" style="margin-top: 30px">
								first name<strong style="color: red">*</strong>
							</div>
							<div class="col-md-6" style="margin-top: 30px">
								<input type="text" name="fn" id="fn"/>
							</div>
						</div>
						<div class="row">
							<div class="col-md-2 col-md-offset-2" style="margin-top: 30px">
								last name<strong style="color: red">*</strong>
							</div>
							<div class="col-md-5" style="margin-top: 30px">
								<input type="text" name="ln" id="ln" />
							</div>
						</div>
						<div class="row">
							<div class="col-md-2 col-md-offset-2" style="margin-top: 30px">email</div>
							<div class="col-md-5" style="margin-top: 30px">
								<input type="text" name="em"  id="em"/>
							</div>
						</div>
						<div class="row">
							<div class="col-md-2 col-md-offset-2" style="margin-top: 30px">
								address <strong style="color: red">*</strong>
							</div>
							<div class="col-md-5" style="margin-top: 30px">
								<input type="text" name="ad" id="ad" />
							</div>
						</div>
						<div class="row">
							<input class="btn btn-info col-md-2 col-md-offset-2"
								style="margin-top: 5px" value="添加" type="submit">
						</div>
					</form>
					<div class="modal-footer"></div>
				</div>
			</div>
		</div>
	</div>

	<div>
		<button class="kk">sss</button>
	</div>
	<a onclick="putidm()">ss</a>
</body>
</html>