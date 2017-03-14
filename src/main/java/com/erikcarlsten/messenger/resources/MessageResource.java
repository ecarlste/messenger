package com.erikcarlsten.messenger.resources;

import com.erikcarlsten.messenger.model.Message;
import com.erikcarlsten.messenger.service.MessageService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/messages")
public class MessageResource {

    private final MessageService messageService = new MessageService();

    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Message> getMessages() {
       return messageService.getAllMessages();
    }

}
