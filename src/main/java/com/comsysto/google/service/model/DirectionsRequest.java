package com.comsysto.google.service.model;

import java.io.Serializable;
import java.util.HashMap;

/**
 * @author zutherb
 */
public class DirectionsRequest extends HashMap<String, String> implements Serializable {
    private enum RequestParameter{
        ORIGIN("origin"),
        DESTINATION("destination"),
        SENSOR("sensor");
        private String name;

        RequestParameter(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public String getOrigin() {
        return get(RequestParameter.ORIGIN.getName());
    }

    public void setOrigin(String origin) {
        put(RequestParameter.ORIGIN.getName(), origin);
    }

    public String getDestination() {
        return get(RequestParameter.DESTINATION.getName());
    }

    public void setDestination(String destination) {
        put(RequestParameter.DESTINATION.getName(), destination);
    }

    public Boolean getSensor() {
        return Boolean.getBoolean(get(RequestParameter.SENSOR.getName()));
    }

    public void setSensor(Boolean sensor) {
        put(RequestParameter.SENSOR.getName(), sensor.toString());
    }
}
