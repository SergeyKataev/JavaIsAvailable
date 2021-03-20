package com.example.SeniorPushingManager.model.response;

import java.util.List;

public class Deal {
    private String id;
    private String stage;
    private List<Teamate> team;

    @Override
    public String toString() {
        return "Deals{" +
                "id='" + id + '\'' +
                ", stage='" + stage + '\'' +
                ", team=" + team +
                '}';
    }

    public Deal() {
    }

    public Deal(String id, String stage, List<Teamate> team) {
        this.id = id;
        this.stage = stage;
        this.team = team;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public List<Teamate> getTeam() {
        return team;
    }

    public void setTeam(List<Teamate> team) {
        this.team = team;
    }
}
