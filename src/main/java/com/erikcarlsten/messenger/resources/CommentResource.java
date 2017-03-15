package com.erikcarlsten.messenger.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/")
public class CommentResource {

    @GET
    public String test() {
        return "new comment resource";
    }

    @GET
    @Path("/{commentId}")
    public String test2(@PathParam("commentId") long commentId) {
        return "Method to return comment id: " + commentId;
    }

}
