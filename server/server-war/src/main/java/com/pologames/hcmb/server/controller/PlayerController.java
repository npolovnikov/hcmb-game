package com.pologames.hcmb.server.controller;

import com.pologames.hcmb.server.entity.Player;
import com.pologames.hcmb.server.manager.PlayerManager;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.core.Response;
import java.util.List;

@Stateless
public class PlayerController implements PlayerControllerRest {

    @EJB
    private PlayerManager playerManager;

    @Override
    public Response createPlayer(){
        final Player player = playerManager.createRandomPlayer(40, 100);
        return Response.ok(player).build();
    }

    @Override
    public Response getPlayersList(){
        final List<Player> players = playerManager.getAllPlayers();
        return Response.ok(players).build();
    }
}
