package com.pologames.hcmb.admin;

import com.pologames.hcmb.server.manager.GamerManager;
import com.pologames.hcmb.server.manager.PlayerCardManager;
import com.pologames.hcmb.server.manager.PlayerManager;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinServlet;

import javax.ejb.EJB;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = "/*", name = "AdminUIServlet", asyncSupported = true)
@VaadinServletConfiguration(ui = AdminUI.class, productionMode = false)
public class AdminUIServlet extends VaadinServlet {
    @EJB
    private PlayerManager playerManager;
    @EJB
    private PlayerCardManager playerCardManager;
    @EJB
    private GamerManager gamerManager;

    public PlayerManager getPlayerManager() {
        return playerManager;
    }

    public PlayerCardManager getPlayerCardManager() {
        return playerCardManager;
    }

    public GamerManager getGamerManager() {
        return gamerManager;
    }
}
