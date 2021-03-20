package com.example.SeniorPushingManager.model.response;

public class Teamate {
    private String id;
    private String role;


    @Override
    public String toString() {
        return "Team{" +
                "id='" + id + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    public Teamate() {
    }

    public Teamate(String id, String role) {
        this.id = id;
        this.role = role;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
