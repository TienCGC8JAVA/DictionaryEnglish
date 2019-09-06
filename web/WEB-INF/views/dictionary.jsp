<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 9/6/2019
  Time: 12:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Bài tập của Chãu Chãu xinh trai</title>
  </head>
  <style>
    body {
      text-align: center;
    }
    h1 {
      color: blue;
    }
  </style>
  <body>
    <h1>TRA TỪ ĐIỂN ANH - VIỆT</h1>
    <form method = "post" action = "${pageContext.request.contextPath}/result">
      <label>
        <input type = "text" name = "english" />
      </label>
      <input type = "submit" value = "search" />
      <p>${result}</p>
    </form>
  </body>
</html>
