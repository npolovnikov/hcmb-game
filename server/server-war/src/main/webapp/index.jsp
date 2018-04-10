<%--
  Created by IntelliJ IDEA.
  User: npolovnikov
  Date: 22.03.18
  Time: 10:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Hockey Mobile</title>
  </head>
  <body>
    <button type="submit" onclick="createRandomPlayer()">Generate</button>
  </body>
  <script>
    function createRandomPlayer() {
        var xhttp = new XMLHttpRequest();
        xhttp.open("GET", "/server/api/players/create", true);
        xhttp.setRequestHeader("Content-type", "application/json");
        xhttp.send();
        var response = JSON.parse(xhttp.responseText);
    }
  </script>
</html>
