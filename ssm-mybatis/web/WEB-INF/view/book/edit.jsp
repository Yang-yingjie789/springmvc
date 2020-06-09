<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>图书修改页面</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/book/editBook" method="post">
    <input name="bookID" hidden="hidden" value="${QBook.bookID}">
    <div class="form-group">
        <label for="exampleInputEmail1">图书名称</label>
        <input type="text" class="form-control" id="exampleInputEmail1" name="bookName" required value="${QBook.bookName}">
    </div>
    <div class="form-group">
        <label for="exampleInputEmail1">图书详情</label>
        <input type="text" class="form-control"  name="detail" required value="${QBook.detail}">
    </div>
    <div class="form-group">
        <label for="exampleInputEmail1">图书存量</label>
        <input type="number" class="form-control"  name="bookCounts" required value="${QBook.bookCounts}">
    </div>
    <button type="submit" class="btn btn-default">添加</button>
</form>


</body>
</html>
