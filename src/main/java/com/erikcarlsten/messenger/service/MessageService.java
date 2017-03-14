package com.erikcarlsten.messenger.service;

import com.erikcarlsten.messenger.model.Message;

import java.util.ArrayList;
import java.util.List;

public class MessageService {

    public List<Message> getAllMessages() {
        Message m1 = new Message(1L, "Hello World!", "Erik Carlsten");
        Message m2 = new Message(2L, "Hello Jersey!", "Erik Carlsten");

        List<Message> messages = new ArrayList<>();
        messages.add(m1);
        messages.add(m2);

        return messages;
    }

}
