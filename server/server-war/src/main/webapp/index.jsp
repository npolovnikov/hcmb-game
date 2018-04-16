<%@ page import="javax.ws.rs.client.ClientBuilder" %>
<%@ page import="javax.ws.rs.core.MediaType" %>
<%@ page import="java.util.List" %>
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
  <style>
    #statisticTable {
      text-align: center;
      vertical-align: middle;
    }

  </style>
  <body>
    <table id="statisticTable">
      <tbody>
        <tr>
          <td>Total Players</td>
          <td>Total PlayersCard</td>
        </tr>
        <tr>
          <td><%final List players = ClientBuilder.newClient()
                    .target("http://localhost:8080/")
                    .path("server/api/players/getList")
                    .request(MediaType.APPLICATION_JSON)
                    .get(List.class);
            out.print(players.size());%></td>
        </tr>
      </tbody>
    </table>
    <button type="submit" onclick="createRandomPlayer()">Generate</button>
  </body>
  <script>
    function createRandomPlayer() {
        ClientBuilder.newClient()
            .target("http://localhost:8080/")
            .path("server/api/players/create")
            .request(MediaType.APPLICATION_JSON)
            .get();
    }
  </script>
</html>
