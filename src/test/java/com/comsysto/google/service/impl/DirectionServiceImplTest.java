package com.comsysto.google.service.impl;

import com.comsysto.google.service.api.DirectionService;
import com.comsysto.google.service.model.DirectionsRequest;
import com.comsysto.google.service.model.DirectionsResponse;
import com.comsysto.google.service.model.DirectionsResponseStatus;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

/**
 * @author zutherb
 */
@ContextConfiguration(locations = "classpath:com/comsysto/google/spring-context.xml")
public class DirectionServiceImplTest extends AbstractJUnit4SpringContextTests{

    @Autowired
    private DirectionService directionService;

    @Test
    public void testGetDirections() throws Exception {
        DirectionsRequest directionsRequest = new DirectionsRequest();
        directionsRequest.setOrigin("Halberstadt, Germany");
        directionsRequest.setDestination("Munich, Germany");
        directionsRequest.setSensor(Boolean.TRUE);
        DirectionsResponse directions = directionService.getDirections(directionsRequest);
        assertNotNull(directions);
    }

    @Test
    public void testGetDirectionsWithWayPoints() throws Exception {
        DirectionsRequest directionsRequest = new DirectionsRequest();
        directionsRequest.setOrigin("Halberstadt, Germany");
        directionsRequest.setDestination("Munich, Germany");
        directionsRequest.setWaypoints("Cologne, Germany", "Heidelberg, Germany");
        directionsRequest.setSensor(Boolean.TRUE);
        DirectionsResponse directions = directionService.getDirections(directionsRequest);
        assertNotNull(directions);
    }

    @Test
    public void testNoRouteCouldBeFound() throws Exception {
        DirectionsRequest directionsRequest = new DirectionsRequest();
        directionsRequest.setOrigin("New York");
        directionsRequest.setDestination("Munich");
        directionsRequest.setSensor(Boolean.TRUE);
        DirectionsResponse directions = directionService.getDirections(directionsRequest);
        assertNotNull(directions);
        assertEquals(directions.getStatus(), DirectionsResponseStatus.ZERO_RESULTS);
    }
}
