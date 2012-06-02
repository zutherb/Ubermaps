package com.comsysto.google.service.model;

import org.apache.commons.io.FileUtils;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.introspect.JacksonAnnotationIntrospector;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;

import static org.junit.Assert.assertNotNull;

/**
 * @author zutherb
 */
public class DirectionsResponseTest {

    private static ObjectMapper mapper;

    @BeforeClass
    public static void setup(){
        mapper = new ObjectMapper();
        mapper.setAnnotationIntrospector(new JacksonAnnotationIntrospector());
    }

    @Test
    public void canBeJsonSerialized() throws IOException {
        String jsonString = mapper.writeValueAsString(new DirectionsResponse());
        assertNotNull(jsonString);
    }

    @Test
    public void canBeJsonDeserialized() throws IOException {
        ClassPathResource pathResource = new ClassPathResource("/com/comsysto/google/service/model/directionresponse.json");
        String jsonString = FileUtils.readFileToString(pathResource.getFile());
        DirectionsResponse directionsResponse = mapper.readValue(jsonString, DirectionsResponse.class);
        assertNotNull(directionsResponse);
    }
}
