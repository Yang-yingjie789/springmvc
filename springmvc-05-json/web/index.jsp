<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/6/1
  Time: 23:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>

  <script type="text/javascript">
    function test(callid) {
      if (callid){
        alert(callid);
      }else{
        alert(callid);
        return;
      }

    }
  </script>
  <body>


  <input type="button" value="12" onclick="test(null)">
  </body>
</html>
