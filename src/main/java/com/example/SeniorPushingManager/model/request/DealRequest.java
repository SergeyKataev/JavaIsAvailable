package com.example.SeniorPushingManager.model.request;

import java.util.List;

public class DealRequest {
    private List<DealsRequestModel> dealsRequest;

    public DealRequest() {
    }

    public DealRequest(List<DealsRequestModel> dealsRequest) {
        this.dealsRequest = dealsRequest;
    }

    public List<DealsRequestModel> getDealsRequest() {
        return dealsRequest;
    }

    public void setDealsRequest(List<DealsRequestModel> dealsRequest) {
        this.dealsRequest = dealsRequest;
    }
}
