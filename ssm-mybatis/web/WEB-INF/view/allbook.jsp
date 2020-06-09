<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>图书页面</title>
    <link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap.min.css">
    <!--使用Bootstrap的js插件，必须先调入jQuery-->
    <script src="http://libs.baidu.com/jquery/1.9.0/jquery.min.js"></script>

    <!-- 包括所有bootstrap的js插件或者可以根据需要使用的js插件调用　-->
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
    <script type="text/javascript">
        function popup() {
            window.open ("", "添加图书", "height=500, width=600, toolbar=no, menubar=no, scrollbars=no, resizable=no, location=no, status=no");
        }
    </script>
</head>
<body>
<div class="container">
    <div class="container">
        <ul class="nav nav-pills" style="margin-left: 0px">
            <li role="presentation" class="active"><a href="${pageContext.request.contextPath}/book/addpage">新增图书</a></li>
            <li role="presentation" class="active"><a href="${pageContext.request.contextPath}/book/allbooks">显示全部 图书</a></li>
        </ul>
    </div>

    <form class="navbar-form navbar-left" action="${pageContext.request.contextPath}/book/queryBook" method="get">
    <div class="form-group">
        <input type="text" class="form-control" placeholder="输入图书查询" name="bookName">
    </div>
    <button type="submit" class="btn btn-default">Submit</button>
    </form>
    <form class="navbar-form navbar-left" action="${pageContext.request.contextPath}/book/queryBooks" method="get">
        <div class="form-group">
            <input type="text" class="form-control" placeholder="高级查询" name="bookName">
        </div>
        <button type="submit" class="btn btn-default">Submit</button>
        <span style="font: small-caps bold 16px Georgia, serif; color: red">${result}</span>
    </form>

</div>


    <table class="table table-striped">
        <thead>
           <tr>
               <th>系列号</th>
               <th>图书编码</th>
               <th>图书名称</th>
               <th>图书存量</th>
               <th>图书详情</th>
               <th>操作</th>
           </tr>
        </thead>
        <c:forEach items="${list}" var="book" varStatus="bookStatus">
        <tr>
        <td>${bookStatus.index +1}</td>
        <td>${book.bookID}</td>
        <td>${book.bookName}</td>
        <td>${book.bookCounts}</td>
        <td>${book.detail}</td>
         <td colspan="2"><a href="${pageContext.request.contextPath}/book/editPage?bookID=${book.bookID}">修改</a>&nbsp;
             <a href="${pageContext.request.contextPath}/book/deleteBook?bookID=${book.bookID}" onclick="if (!confirm('确认删除此图书吗'))return false;">删除</a></td>

        </tr>
        </c:forEach>
    </table>




</body>
</html>
