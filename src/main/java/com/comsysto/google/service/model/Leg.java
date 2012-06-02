package com.comsysto.google.service.model;

import com.sun.xml.internal.xsom.impl.ListSimpleTypeImpl;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.io.Serializable;
import java.util.List;

/**
 * @author zutherb
 */
@JsonSerialize
public class Leg implements Serializable {
    private Distance distance;
    private Duration duration;
    @JsonProperty("end_address")
    private String endAddress;
    @JsonProperty("end_location")
    private GeoLocation endLocation;
    @JsonProperty("start_address")
    private String startAddress;
    @JsonProperty("start_location")
    private GeoLocation startLocation;
    private List<Step> steps;
    @JsonProperty("via_waypoint")
    private List<WayPoint> viaWayPoints;

    public Distance getDistance() {
        return distance;
    }

    public void setDistance(Distance distance) {
        this.distance = distance;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public String getEndAddress() {
        return endAddress;
    }

    public void setEndAddress(String endAddress) {
        this.endAddress = endAddress;
    }

    public GeoLocation getEndLocation() {
        return endLocation;
    }

    public void setEndLocation(GeoLocation endLocation) {
        this.endLocation = endLocation;
    }

    public String getStartAddress() {
        return startAddress;
    }

    public void setStartAddress(String startAddress) {
        this.startAddress = startAddress;
    }

    public GeoLocation getStartLocation() {
        return startLocation;
    }

    public void setStartLocation(GeoLocation startLocation) {
        this.startLocation = startLocation;
    }

    public List<Step> getSteps() {
        return steps;
    }

    public void setSteps(List<Step> steps) {
        this.steps = steps;
    }
}
