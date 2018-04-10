package com.pologames.hcmb.server.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("players")
public interface PlayerControllerRest {
    @GET
    @Path("create")
    @Produces(MediaType.APPLICATION_JSON)
    Response createPlayer();

    @GET
    @Path("getList")
    @Produces(MediaType.APPLICATION_JSON)
    Response getPlayersList();
}
