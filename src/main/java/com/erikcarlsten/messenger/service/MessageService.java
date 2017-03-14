package com.erikcarlsten.messenger.service;

import com.erikcarlsten.messenger.database.DatabaseClass;
import com.erikcarlsten.messenger.model.Message;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MessageService {

    private Map<Long, Message> messages = DatabaseClass.getMessages();

    public List<Message> getAllMessages() {
        return new ArrayList<>(messages.values());
    }

}
