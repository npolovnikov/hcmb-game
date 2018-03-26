package com.pologames.hcmb.server.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "TestServlet", urlPatterns = {"/test"}, loadOnStartup = 1)
public class TestServlet extends HttpServlet {

    private static final long START_TIME = System.currentTimeMillis();

    @Override
    protected void service(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {
        resp.setStatus(HttpServletResponse.SC_OK);
        final long uptime = System.currentTimeMillis() - START_TIME;
        resp.getOutputStream().print("Uptime: " + uptime + " ms");
    }
}
