package com.example.SeniorPushingManager.Services;


import com.example.SeniorPushingManager.model.request.DealRequest;
import com.example.SeniorPushingManager.model.request.DealsRequestModel;
import com.example.SeniorPushingManager.model.response.Deal;
import com.example.SeniorPushingManager.model.response.Deals;
import com.example.SeniorPushingManager.model.response.Teamate;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;


@Service
public class DealService {
    // логика
    public DealRequest getDealsByIdUser(DealsRequestModel idUser) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false); // если пришло неизвестное поле - игнор
        String file = "/json/deals.json";
        InputStream is = Deals.class.getResourceAsStream(file);
        Deals deals = objectMapper.readValue(is, Deals.class);
        DealRequest request = new DealRequest();
        List dealsList = new ArrayList();
        for (Deal entry : deals.getDeals()) {
            for (var t : entry.getTeam()) {
                if (t.getId().equals(idUser.getSuperman())) {
                    // ты есть в команде
                    if (t.getRole().equals("PrimaryKM") && countTeammate(entry.getTeam()) == 1) {
                        dealsList.add(new DealsRequestModel(entry.getId(), "самостоятельная"));
                    } else if (t.getRole().equals("PrimaryKM") && countTeammate(entry.getTeam()) > 1) {
                        dealsList.add(new DealsRequestModel(entry.getId(), "совместная Лидер Я"));
                    } else {
                        dealsList.add(new DealsRequestModel(entry.getId(), "совместная Лидер КМ"));
                    }
                }
            }
        }
        request.setDealsRequest(dealsList);
        return request;
    }

    // считаем участников сделки
    private int countTeammate(List<Teamate> team) {
        var teamCount = 0;
        for (var t : team) {
            if (!t.equals("0552")) {
                teamCount++;
            }
        }
        return teamCount;
    }

}
