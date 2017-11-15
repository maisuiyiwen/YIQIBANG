<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="bootstrap/bootstrap-3.3.7/dist/css/bootstrap.min.css">
<style>
body {
	background: #1e314b;
}
  .mypanel{
    width:520px;
    height:400px;
    margin:auto;
    margin-top:100px;
    background:#162435;
  }
   .img1{
    width:163px;
    height:55px;
    margin-left:160px;
    margin-top:30px;
   }
      ul,li,ol{
            list-style:none;
        }
   .myul{
   width:410px;
   height:250px;
   
   }     
   .myli1{
    font-size: 12px;
    font-family: "MicrosoftYaHei";
    color:white;
   }
   li{
     padding:3px;
   
   }
 
</style>
</head>
<body>
	<div id="page" >
	
		<div class="panel mypanel">
			<div class="panel-heading">
				 <img src="img/logo.png" class="img1">
			</div>
			<div class="panel-body">
			  <ul class="myul">
			    <li class="myli1">用户名：</li>
			    <li ><input type="text"  id="username" name="username" placeholder="请输入用户名" style="width:380px;height:30px;">			 		    
			    </li>
			    <li class="myli1">密码：</li>
			    <li><input type="text"  id="password" name="password" placeholder="请输入密码" style="width:380px;height:30px;"></li>
			    <li class="myli1">验证码：</li>
			    <li>
			       <ul class="list-inline">
			          <li><img id="validate_img" alt="点击重试" src="validate.jsp" style="width:100px;height:33px;"></li>
			          <li><input type="text" id="basic-code" name="code" aria-describedby="basic-addon3" placeholder="验证码" style="width:90px;height:30px;"></li>
			       </ul>			    
			    </li>
			    <li>  
			        <ul class="list-inline myul2">
			          <li><button type="submit">登录</button></li>
			          <li><button type="button">忘记密码</button></li>
			       </ul>	
			    </li>
			  </ul>			
			</div>
		</div>		
	</div>
</body>
</html>