package com.example.SeniorPushingManager.model.request;

public class DealsRequestModel {
    private String deal;
    private String superman;


    public DealsRequestModel() {
    }

    public DealsRequestModel(String deal, String superman) {
        this.deal = deal;
        this.superman = superman;
    }

    public String getSuperman() {
        return superman;
    }

    public void setSuperman(String superman) {
        this.superman = superman;
    }

    public String getDeal() {
        return deal;
    }

    public void setDeal(String deal) {
        this.deal = deal;
    }
}
