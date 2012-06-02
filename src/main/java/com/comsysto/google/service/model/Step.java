package com.comsysto.google.service.model;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;

/**
 * @author zutherb
 */
@JsonSerialize
public class Step {
    private Distance distance;
    private Duration duration;
    @JsonProperty("end_location")
    private GeoLocation endLocation;
    @JsonProperty("start_location")
    private GeoLocation startLocation;
    @JsonProperty("html_instructions")
    private String htmlInstructions;
    @JsonProperty("travel_mode")
    private TravelMode travelMode;

    private Polyline polyline;

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

    public GeoLocation getEndLocation() {
        return endLocation;
    }

    public void setEndLocation(GeoLocation endLocation) {
        this.endLocation = endLocation;
    }

    public GeoLocation getStartLocation() {
        return startLocation;
    }

    public void setStartLocation(GeoLocation startLocation) {
        this.startLocation = startLocation;
    }

    public String getHtmlInstructions() {
        return htmlInstructions;
    }

    public void setHtmlInstructions(String htmlInstructions) {
        this.htmlInstructions = htmlInstructions;
    }

    public TravelMode getTravelMode() {
        return travelMode;
    }

    public void setTravelMode(TravelMode travelMode) {
        this.travelMode = travelMode;
    }

    public Polyline getPolyline() {
        return polyline;
    }

    public void setPolyline(Polyline polyline) {
        this.polyline = polyline;
    }
}
