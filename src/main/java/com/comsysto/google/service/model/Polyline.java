package com.comsysto.google.service.model;

import org.codehaus.jackson.map.annotate.JsonSerialize;

/**
 * @author zutherb
 */
@JsonSerialize
public class Polyline {
    private String points;

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = points;
    }
}
