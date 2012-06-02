package com.comsysto.google.service.model;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.io.Serializable;
import java.util.List;

/**
 * @author zutherb
 */
@JsonSerialize
public class Route implements Serializable {
    private String summary;
    private String copyrights;
    private List<Leg> legs;
    private Bounds bounds;
    @JsonProperty("overview_polyline")
    private Polyline overviewPolyline;
    private List<Warning> warnings;
    @JsonProperty("waypoint_order")
    private List<WayPoint> wayPointOrder;


    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getCopyrights() {
        return copyrights;
    }

    public void setCopyrights(String copyrights) {
        this.copyrights = copyrights;
    }

    public List<Leg> getLegs() {
        return legs;
    }

    public void setLegs(List<Leg> legs) {
        this.legs = legs;
    }

    public Bounds getBounds() {
        return bounds;
    }

    public void setBounds(Bounds bounds) {
        this.bounds = bounds;
    }

    public Polyline getOverviewPolyline() {
        return overviewPolyline;
    }

    public void setOverviewPolyline(Polyline overviewPolyline) {
        this.overviewPolyline = overviewPolyline;
    }

    public List<Warning> getWarnings() {
        return warnings;
    }

    public void setWarnings(List<Warning> warnings) {
        this.warnings = warnings;
    }

    public List<WayPoint> getWayPointOrder() {
        return wayPointOrder;
    }

    public void setWayPointOrder(List<WayPoint> wayPointOrder) {
        this.wayPointOrder = wayPointOrder;
    }
}
