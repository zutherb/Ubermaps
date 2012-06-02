package com.comsysto.google.service.impl;

import com.comsysto.google.service.api.DirectionService;
import com.comsysto.google.service.model.DirectionsRequest;
import com.comsysto.google.service.model.DirectionsResponse;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

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
}
