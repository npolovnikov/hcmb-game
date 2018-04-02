package com.pologames.hcmb.server.servlets;

import com.pologames.hcmb.server.entity.Player;
import com.pologames.hcmb.server.manager.PlayerManager;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "GetTestServlet", urlPatterns = {"/get"}, loadOnStartup = 1)
public class GetTestServlet extends HttpServlet {

    private static final long START_TIME = System.currentTimeMillis();

    @EJB
    private PlayerManager playerManager;

    @Override
    protected void service(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {
        resp.setStatus(HttpServletResponse.SC_OK);
        final long uptime = System.currentTimeMillis() - START_TIME;
        resp.getOutputStream().print("Uptime: " + uptime + " ms\n");

        final List<Player> players = playerManager.getAllPlayers();
        resp.getOutputStream().print("List Size = "+ players.size() + "\n");
        resp.getOutputStream().print("Players = "+ players + "\n");
    }
}
