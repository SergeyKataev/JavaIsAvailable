package com.example.SeniorPushingManager.Controller;

import com.example.SeniorPushingManager.Services.DealService;
import com.example.SeniorPushingManager.model.request.DealRequest;
import com.example.SeniorPushingManager.model.request.DealsRequestModel;
import com.example.SeniorPushingManager.model.response.Deals;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@RestController
public class DealsController {

    private final DealService dealService;
    public DealsController(DealService dealService) {
        this.dealService = dealService;
    }

    @GetMapping("/deals")
    @ResponseBody
    public DealRequest getDeals(@RequestBody DealsRequestModel dealsRequestModel) throws IOException {
        return dealService.getDealsByIdUser(dealsRequestModel);
    }
}
