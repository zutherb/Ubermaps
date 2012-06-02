package com.comsysto.google.service.api;

import com.comsysto.google.service.model.DirectionsRequest;
import com.comsysto.google.service.model.DirectionsResponse;

/**
 * @author zutherb
 */
public interface DirectionService {
    DirectionsResponse getDirections(DirectionsRequest directionsRequest);
}
