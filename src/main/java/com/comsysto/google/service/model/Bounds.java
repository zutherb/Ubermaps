package com.comsysto.google.service.model;

import java.io.Serializable;

/**
 * @author zutherb
 */
public class Bounds implements Serializable {
    private GeoLocation northeast;
    private GeoLocation southwest;

    public GeoLocation getNortheast() {
        return northeast;
    }

    public void setNortheast(GeoLocation northeast) {
        this.northeast = northeast;
    }

    public GeoLocation getSouthwest() {
        return southwest;
    }

    public void setSouthwest(GeoLocation southwest) {
        this.southwest = southwest;
    }
}
