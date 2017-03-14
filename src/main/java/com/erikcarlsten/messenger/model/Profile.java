package com.erikcarlsten.messenger.model;

public class Profile {

    private int id;
    private String profileName;

    public Profile(int id, String profileName) {
        this.id = id;
        this.profileName = profileName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }
}
