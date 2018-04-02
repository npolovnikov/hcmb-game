package com.pologames.hcmb.server.servlets;

import com.pologames.hcmb.server.manager.PlayerManager;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CreateTestServlet", urlPatterns = {"/create"}, loadOnStartup = 1)
public class CreateTestServlet extends HttpServlet {

    private static final long START_TIME = System.currentTimeMillis();

    @EJB
    private PlayerManager playerManager;

    @Override
    protected void service(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {
        resp.setStatus(HttpServletResponse.SC_OK);
        final long uptime = System.currentTimeMillis() - START_TIME;
        resp.getOutputStream().print("Uptime: " + uptime + " ms\n");
        resp.getOutputStream().print(playerManager.createRandomPlayer(80, 90).toString());
    }
}
