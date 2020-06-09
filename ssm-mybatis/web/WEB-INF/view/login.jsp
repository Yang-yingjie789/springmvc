
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录页面</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/login">
    <fieldset>
        <legend contenteditable="true">&nbsp;登录</legend>
        <span><strong>用户名：</strong></span>
        <input placeholder="请输入用户名" type="text" name="username"/>
        <span><strong>密&nbsp;&nbsp;码：</strong></span>
        <input placeholder="请输入密码" type="text" name="password"/><br />
        <button class="btn" contenteditable="true" type="submit">提交</button>
    </fieldset>
</form>


</body>
</html>
