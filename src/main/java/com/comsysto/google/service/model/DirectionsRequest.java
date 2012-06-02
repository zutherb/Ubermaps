package com.comsysto.google.service.model;

import org.apache.commons.lang.StringUtils;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author zutherb
 */
public class DirectionsRequest extends HashMap<String, String> implements Serializable {

    private static final String SEPARATOR = "|";

    private enum RequestParameter{
        ORIGIN("origin"),
        DESTINATION("destination"),
        SENSOR("sensor"),
        WAYPOINTS("waypoints");
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
        return Boolean.parseBoolean(get(RequestParameter.SENSOR.getName()));
    }

    public void setSensor(Boolean sensor) {
        put(RequestParameter.SENSOR.getName(), sensor.toString());
    }

    public List<String> getWaypoints() {
        String[] split = StringUtils.split(get(RequestParameter.WAYPOINTS.getName()), "|");
        return Arrays.asList(split);
    }

    public void setWaypoints(String ... waypoints) {
        put(RequestParameter.WAYPOINTS.getName(), StringUtils.join(waypoints, SEPARATOR));
    }

    public void setWaypoints(List<String> waypoints) {
        put(RequestParameter.WAYPOINTS.getName(), StringUtils.join(waypoints, SEPARATOR));
    }

}
