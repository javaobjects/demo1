<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>注册页面</title>
</head>
<body>
<form action="RegisterServlet" method="get">
id：<input type="text" name="id"/><br>
name：<input type="text" name="username"/><br>
性别：<input type="radio" name="sex" value="男"/>男<input type="radio" name="sex" value="女"/>女<br>
兴趣：<input type="checkbox" name="xingqu" value="lanqiu"/>篮球<input type="checkbox" name="xingqu" value="zuqiu"/>足球
<input type="checkbox" name="xingqu" value="yumaoqiu"/>羽毛球
<input type="checkbox" name="xingqu" value="paiqiu"/>排球
<input type="checkbox" name="xingqu" value="diqiu"/>地球<br>
省份：<select name="province">
	<option value="广东省">广东省</option>
	<option value="福建省">福建省</option>
</select>
<br>
城市：<select name="city">
<option value="zhuhai">珠海市</option>
<option value="shenzhen">深圳市</option>
</select><br>
学历：<input type="text" name="xueli"/><br>
专业：<input type="text" name="zhuanye"/><br>
学校：<input type="text" name="xuexiao"/><br>
生日：<input type="date" name="birth"/><br>
<input type="submit" value="注册"/>
</body>
</html>