package com.comsysto.google.service.impl;

import com.comsysto.google.service.api.DirectionService;
import com.comsysto.google.service.model.DirectionsRequest;
import com.comsysto.google.service.model.DirectionsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author zutherb
 */
@Service
public class DirectionServiceImpl implements DirectionService {

    private static final String googleUrl = "https://maps.googleapis.com/maps/api/directions/json?" +
            "origin={origin}&destination={destination}&sensor={sensor}&" +
            "waypoints={waypoints}";

    private RestTemplate restTemplate;

    @Autowired
    public DirectionServiceImpl(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    @Override
    public DirectionsResponse getDirections(DirectionsRequest directionsRequest){
        return restTemplate.getForObject(googleUrl, DirectionsResponse.class, directionsRequest);
    }
}

