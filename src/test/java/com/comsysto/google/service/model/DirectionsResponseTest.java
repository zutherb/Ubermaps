package com.comsysto.google.service.model;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.introspect.JacksonAnnotationIntrospector;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertNotNull;

/**
 * @author zutherb
 */
public class DirectionsResponseTest {
    @Test
    public void canBeJsonSerialized() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.setAnnotationIntrospector(new JacksonAnnotationIntrospector());
        String jsonString = mapper.writeValueAsString(new DirectionsResponse());
        assertNotNull(jsonString);
    }
}
