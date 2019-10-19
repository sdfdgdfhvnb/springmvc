<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>添加用户信息</title>
    <style>
        table {border:1px solid #000000}
        table th{border:1px solid #000000}
        table td{border:1px solid #000000}
    </style>
</head>
<body>
<form id="userForm"
      action="${pageContext.request.contextPath }/insert.do"  method="post">
    添加用户信息：
    <table cellpadding="0" cellspacing="0" width="80%">

        <tr>
            <td>用户名称</td>
            <td><input type="text" name="username" value="" /></td>
        </tr>
        <tr>
            <td>用户密码</td>
            <td><input type="password" name="password" value="" /></td>
        </tr>
        <tr>
            <td>邮箱</td>
            <td><input type="text" name="email" value="" /></td>
        </tr>
        <tr>
            <td>联系电话</td>
            <td><input type="text" name="phoneNum" value="" /></td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit" value="添加" />
            </td>
        </tr>
    </table>

</form>
</body>

</html>