package com.erikcarlsten.messenger.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public class CommentResource {

    @GET
    public String test() {
        return "new comment resource";
    }

    @GET
    @Path("/{commendId}")
    public String test2() {
        return "Method to return comment id";
    }

}
