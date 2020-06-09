<%@ page import="com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>Title</title>
    <script>
        function confirm1() {
           var conf= window.confirm("确认添加图书?");
            if (conf=true) {
                return true;
            } else {
                return false;
            }
        }
    </script>
</head>
<body>

<form action="${pageContext.request.contextPath}/book/addbook" method="post">
    <div class="form-group">
        <label for="exampleInputEmail1">图书名称</label>
        <input type="text" class="form-control" id="exampleInputEmail1" name="bookName" required>
    </div>
    <div class="form-group">
        <label for="exampleInputEmail1">图书详情</label>
        <input type="text" class="form-control"  name="detail" required>
    </div>
    <div class="form-group">
        <label for="exampleInputEmail1">图书存量</label>
        <input type="number" class="form-control"  name="bookCounts" required>
    </div>
    <button type="submit" class="btn btn-default" onsubmit="confirm1()">添加</button>
</form>


</body>
</html>
