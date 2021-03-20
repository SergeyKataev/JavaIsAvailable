package com.example.SeniorPushingManager.model.response;

import java.util.List;

public class Deals {
    private List<Deal> deals;

    public Deals(List<Deal> deals) {
        this.deals = deals;
    }

    public Deals() {
    }

    public List<Deal> getDeals() {
        return deals;
    }

    public void setDeals(List<Deal> deals) {
        this.deals = deals;
    }

    @Override
    public String toString() {
        return "Deals{" +
                "deals=" + deals +
                '}';
    }
}
