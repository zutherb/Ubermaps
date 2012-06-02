package com.comsysto.google.service;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import static org.junit.Assert.assertNotNull;

/**
 * @author zutherb
 */
@ContextConfiguration(locations = "classpath:com/comsysto/google/spring-context.xml")
public class ContextTest extends AbstractJUnit4SpringContextTests {
    @Test
    public void contextIsLoadable(){
        assertNotNull(applicationContext);
    }
}
